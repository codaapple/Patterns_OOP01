package oop.ch07.auto.simple;

class Automaton extends StateMachine {
    Automaton() {
        super(null);
        entry();
    }

    @Override
    A initialState() {
        return new A(this);
    }
}
