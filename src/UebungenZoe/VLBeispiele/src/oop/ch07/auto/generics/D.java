package oop.ch07.auto.generics;

class D extends State<Lower> {
    D(Lower parent) {
        super(parent);
    }

    @Override
    void a() {
        System.out.println("D->E");
        parent.gotoState(new E(parent));
    }
}
