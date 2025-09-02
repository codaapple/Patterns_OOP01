package UebungenZoe.Uebung6;

import java.util.*;

public class Sudoku {

    private final Field[][] board;

    public Sudoku() {
        this.board = new Field[9][9];
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                board[x][y] = new Field(x, y, this);
            }
        }
    }

    Field get(int x, int y) {
        return board[x][y];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String nl = System.lineSeparator();

        for (int y = 0; y < 9; y++) {
            if (y > 0 && y % 3 == 0) {
                sb.append("---------+---------+---------").append(nl);
            }
            for (int x = 0; x < 9; x++) {
                if (x > 0) {
                    if (x % 3 == 0) sb.append(" | ");
                    else sb.append(' ');
                }
                sb.append(board[x][y].toString());
            }
            sb.append(nl);
        }
        return sb.toString();
    }

    public void initialize(int... values) {
        if (values.length != 81) {
            throw new IllegalArgumentException("initialize expects 81 values, du hast " + values.length);
        }

        int idx = 0;
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                int v = values[idx++];
                Field f = board[x][y];
                if (v == 0) {
                    f.setValue(null);
                } else {
                    Value val = Value.of(v);
                    if (!isPlacementLegal(x, y, val)) {
                        throw new IllegalArgumentException("Illegal initial value " + v + " at (" + x + ", " + y + ")");
                    }
                    f.setValue(val);
                }
            }
        }
    }

    public boolean solve() {
        Field target = selectUnassignedFieldWithSmallestDomain();
        if (target == null) {
            return true;
        }

        List<Value> options = new ArrayList<>(target.getDomain());

        for (Value v: options) {
            int x = target.getX();
            int y = target.getY();

            if (isPlacementLegal(x, y, v)) {
                target.setValue(v);

                if (solve()) {
                    return true;
                }

                // backtrack hier!
                target.setValue(null);
            }
        }
        return false;
    }

    public List<Sudoku> solveAll() {
        List<Sudoku> solutions = new ArrayList<>();
        solveAllRecs(solutions);
        return solutions;
    }

    private void solveAllRecs(List<Sudoku> out) {
        Field target = selectUnassignedFieldWithSmallestDomain();
        if (target == null) {
            out.add(copy());
            return;
        }
        List<Value> options = new ArrayList<>(target.getDomain());
        for (Value v : options) {
            int x = target.getX();
            int y = target.getY();
            if (isPlacementLegal(x, y, v)) {
                target.setValue(v);
                solveAllRecs(out);
                target.setValue(null);
            }
        }
    }

    private Sudoku copy() {
        Sudoku s = new Sudoku();
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                s.board[x][y].setValue(this.board[x][y].getValue());
            }
        }
        return s;
    }

    private Field selectUnassignedFieldWithSmallestDomain() {
        Field best = null;
        int bestSize = Integer.MAX_VALUE;
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                Field f = board[x][y];
                if (f.isEmpty()) {
                    int size = f.getDomain().size();
                    if (size == 0) {
                        return f;
                    }
                    if (size < bestSize) {
                        best = f;
                        bestSize = size;
                        if (bestSize == 1) {
                            //keine Lust mehr.
                        }
                    }
                }
            }
        }
        return best;
    }

    private boolean isPlacementLegal(int x, int y, Value v) {
        
        //Zeile
        for (int xx = 0; xx < 9; xx++) {
            if (xx == x) continue;
            Value w = board[xx][y].getValue();
            if (v == w) return false;
        } 

        //Spalte
        for (int yy = 0; yy < 9; yy++) {
            if (yy == y) continue;
            Value w = board[x][yy].getValue();
            if (v == w) return false;
        }

        //3x3 Blöcke
        int bx = (x / 3)* 3;
        int by = (y / 3)* 3;
        for (int yy = by; yy < by + 3; yy++) {
            for (int xx = bx; xx < bx + 3; xx++) {
                if (xx == x && yy == y) continue;
                Value w = board[xx][yy].getValue();
                if (v == w) return false;
            }
        }
        return true;
    }


}
