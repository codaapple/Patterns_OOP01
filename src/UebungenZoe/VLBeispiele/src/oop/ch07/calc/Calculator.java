package oop.ch07.calc;

import oop.ch06.calc.BinaryOp;
import oop.ch06.calc.CalculatorError;
import oop.ch06.calc.UnaryOp;
import oop.ch06.observer.Observer;
import oop.ch06.observer.ObserverSupport;

public class Calculator {
    private double value;
    private double opnd1;
    private BinaryOp lastOp;
    private double factor;
    private final ObserverSupport observerSupport = new ObserverSupport();
    private final Automaton auto = new Automaton(this);

    public double getValue() {
        return value;
    }

    void setValue(double n) {
        value = n;
        observerSupport.notifyObservers();
    }

    double getOpnd1() {
        return opnd1;
    }

    void setOpnd1(double opnd1) {
        this.opnd1 = opnd1;
    }

    BinaryOp getLastOp() {
        return lastOp;
    }

    void setLastOp(BinaryOp lastOp) {
        this.lastOp = lastOp;
    }

    double getFactor() {
        return factor;
    }

    void setFactor(double factor) {
        this.factor = factor;
    }

    public void addObserver(Observer o) {
        observerSupport.addObserver(o);
    }

    public void unOp(UnaryOp op) {
        try {
            auto.unOp(op);
        }
        catch (CalculatorError ex) {
            auto.error();
        }
    }

    public void binOp(BinaryOp op) {
        try {
            auto.binOp(op);
        }
        catch (CalculatorError ex) {
            auto.error();
        }
    }

    public void eval() {
        try {
            auto.eval();
        }
        catch (CalculatorError ex) {
            auto.error();
        }
    }

    public void digit(int d) {
        auto.digit(d);
    }

    public void dot() {
        auto.dot();
    }

    public void clear() {
        auto.clear();
    }

    public void allClear() {
        auto.allClear();
    }
}
