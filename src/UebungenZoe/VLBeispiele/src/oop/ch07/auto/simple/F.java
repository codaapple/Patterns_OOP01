package oop.ch07.auto.simple;

class F extends State {
    F(State parent) {
        super(parent);
    }

    @Override
    void d() {
        System.out.println("F->A");
        parent.gotoState(new A(parent));
    }
}
