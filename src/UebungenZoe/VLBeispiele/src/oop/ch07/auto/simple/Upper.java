package oop.ch07.auto.simple;

class Upper extends StateMachine {
    Upper(State parent) {
        super(parent);
    }

    @Override
    B initialState() {
        return new B(this);
    }
}
