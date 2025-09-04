package oop.ch07.auto.simple;

class D extends State {
    D(State parent) {
        super(parent);
    }

    @Override
    void a() {
        System.out.println("D->E");
        parent.gotoState(new E(parent));
    }
}
