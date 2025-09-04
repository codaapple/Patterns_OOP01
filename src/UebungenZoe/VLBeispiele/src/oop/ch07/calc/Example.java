package oop.ch07.calc;

import oop.ch06.calc.Ops;

class Example {
    public static void main(String[] args) {
        final Calculator calc = new Calculator();
        calc.digit(2);
        calc.digit(4);
        calc.dot();
        calc.digit(5);
        System.out.println(calc.getValue());
        calc.binOp(Ops.PLUS);
        calc.digit(3);
        calc.clear();
        calc.binOp(Ops.MULT);
        calc.digit(1);
        calc.digit(2);
        System.out.println(calc.getValue());
        calc.eval();
        System.out.println(calc.getValue());
        calc.unOp(Ops.CHANGE_SIGN);
        System.out.println(calc.getValue());
        calc.unOp(Ops.SQRT);
        System.out.println(calc.getValue());
        calc.allClear();
        System.out.println(calc.getValue());
    }
}
