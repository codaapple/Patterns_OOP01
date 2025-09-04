package oop.ch07.auto.simple;

class Lower extends StateMachine {
    Lower(State parent) {
        super(parent);
    }

    @Override
    D initialState() {
        return new D(this);
    }

    @Override
    void b() {
        System.out.println("A->E");
        gotoState(new E(this));
    }
}
