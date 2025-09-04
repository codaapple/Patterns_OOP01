package oop.ch07.auto.simple;

class C extends State {
    C(State parent) {
        super(parent);
    }

    @Override
    void b() {
        System.out.println("C->B");
        parent.gotoState(new B(parent));
    }
}
