package oop.ch07.calc;

class Unchanged extends State<Lower> {
    Unchanged(Lower parent) {
        super(parent, "unchanged");
    }

    @Override
    void digit(int d) {
        getCalculator().setValue(d);
        parent.gotoState(new BeforeDot(parent));
    }

    @Override
    void dot() {
        final Calculator c = getCalculator();
        c.setValue(0.0);
        c.setFactor(0.1);
        parent.gotoState(new AfterDot(parent));
    }
}
