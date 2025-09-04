package oop.ch07.auto.generics;

class F extends State<Automaton> {
    F(Automaton parent) {
        super(parent);
    }

    @Override
    void d() {
        System.out.println("F->A");
        parent.gotoState(new A(parent));
    }
}
