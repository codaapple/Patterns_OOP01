package oop.ch07.auto.simple;

class E extends State {
    E(State parent) {
        super(parent);
    }

    @Override
    void c() {
        System.out.println("E->D");
        parent.gotoState(new D(parent));
    }
}
