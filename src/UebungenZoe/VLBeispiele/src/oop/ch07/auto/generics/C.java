package oop.ch07.auto.generics;

class C extends State<Upper> {
    C(Upper parent) {
        super(parent);
    }

    @Override
    void b() {
        System.out.println("C->B");
        parent.gotoState(new B(parent));
    }
}
