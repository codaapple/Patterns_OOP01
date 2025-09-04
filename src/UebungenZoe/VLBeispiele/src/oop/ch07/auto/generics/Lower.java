package oop.ch07.auto.generics;

class Lower extends StateMachine<Lower, A> {
    Lower(A parent) {
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
