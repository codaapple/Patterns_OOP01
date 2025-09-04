package oop.ch07.calc;

class BeforeDot extends State<Lower> {
    BeforeDot(Lower parent) {
        super(parent, "before_dot");
    }

    @Override
    void digit(int d) {
        final Calculator c = getCalculator();
        c.setValue(10.0 * c.getValue() + d);
    }

    @Override
    void dot() {
        getCalculator().setFactor(0.1);
        parent.gotoState(new AfterDot(parent));
    }
}
