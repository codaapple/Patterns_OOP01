package oop.ch07.auto.generics;

class B extends State<Upper> {
    B(Upper parent) {
        super(parent);
    }

    @Override
    void a() {
        System.out.println("B->C");
        parent.gotoState(new C(parent));
    }
}
