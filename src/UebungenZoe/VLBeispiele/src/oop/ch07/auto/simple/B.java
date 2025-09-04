package oop.ch07.auto.simple;

class B extends State {
    B(State parent) {
        super(parent);
    }

    @Override
    void a() {
        System.out.println("B->C");
        parent.gotoState(new C(parent));
    }
}
