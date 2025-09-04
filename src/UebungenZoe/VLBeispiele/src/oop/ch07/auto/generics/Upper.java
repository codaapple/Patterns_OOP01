package oop.ch07.auto.generics;

class Upper extends StateMachine<Upper, A> {
    Upper(A parent) {
        super(parent);
    }

    @Override
    B initialState() {
        return new B(this);
    }
}
