package oop.ch07.auto.generics;

class Automaton extends StateMachine<Automaton, Automaton> {
    Automaton() {
        super(null);
        entry();
    }

    @Override
    A initialState() {
        return new A(this);
    }
}
