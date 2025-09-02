package UebungenZoe.Uebung6;

import java.util.*;

public class Field {

    private final int x;
    private final int y;
    private final Sudoku board;
    private Value value;

    private List<Field> dependents; //für faule, gleiche Zeile/Spalte

    public Field(int x, int y, Sudoku board) {
        this.x = x;
        this.y = y;
        this.board = board;
        this.value = null;
        this.dependents = null;
    }

    public boolean isEmpty() {
        return value == null;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value v) {
        this.value = v;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return ".";
        } else {
            return value.toString();
        }
    }

    public List<Field> getDependents() {
        if (dependents == null) {
            Set<Field> set = new LinkedHashSet<>();

            for (int xx = 0; xx < 9; xx++) {
                if (xx != x) set.add(board.get(xx, y));
            }

            for (int yy = 0; yy < 9; yy++) {
                if (yy != y) set.add(board.get(x, yy));
            }

            int bx = (x / 3) * 3;
            int by = (y / 3) * 3;
            for (int yy = by; yy < by + 3; yy++) {
                for (int xx = bx; xx < bx + 3; xx++) {
                    if (xx == x && yy == y) continue;
                    set.add(board.get(xx, yy));
                }
            }
            dependents = new ArrayList<>(set);
        }
        return dependents;
    }

    public Set<Value> getDomain() {
        if (!isEmpty()) {
            return Collections.emptySet();
        }
        EnumSet<Value> dom = EnumSet.allOf(Value.class);
        for (Field f: getDependents()) {
            if (!f.isEmpty()) {
                dom.remove (f.getValue());
            }
        }
        return dom;
    }
}
