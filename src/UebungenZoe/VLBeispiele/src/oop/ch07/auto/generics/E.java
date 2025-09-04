package oop.ch07.auto.generics;

class E extends State<Lower> {
    E(Lower parent) {
        super(parent);
    }

    @Override
    void c() {
        System.out.println("E->D");
        parent.gotoState(new D(parent));
    }
}
