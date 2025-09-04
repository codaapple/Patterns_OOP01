package oop.ch07.calc;

import oop.ch06.calc.BinaryOp;
import oop.ch06.calc.CalculatorError;
import oop.ch06.calc.UnaryOp;

class Automaton extends StateMachine<Automaton, Automaton> {
    private final Calculator calculator;

    Automaton(Calculator calculator) {
        super(null, "Automaton");
        this.calculator = calculator;
        entry();
    }

    @Override
    Calculator getCalculator() {
        return calculator;
    }

    @Override
    Working initialState() {
        return new Working(this);
    }

    @Override
    void unOp(UnaryOp op) {
        try {
            super.unOp(op);
        }
        catch (CalculatorError ex) {
            error();
        }
    }

    @Override
    void binOp(BinaryOp op) {
        try {
            super.binOp(op);
        }
        catch (CalculatorError ex) {
            error();
        }
    }

    @Override
    void eval() {
        try {
            super.eval();
        }
        catch (CalculatorError ex) {
            error();
        }
    }
}
