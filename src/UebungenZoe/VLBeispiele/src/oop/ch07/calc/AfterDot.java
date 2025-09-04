package oop.ch07.calc;

class AfterDot extends State<Lower> {
    AfterDot(Lower parent) {super(parent, "after_dot");}

    @Override
    void digit(int d) {
        final Calculator c = getCalculator();
        c.setValue(c.getValue() + d * c.getFactor());
        c.setFactor(0.1 * c.getFactor());
    }
}
