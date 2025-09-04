package oop.ch07.calc;

class Error extends State<Automaton> {
    Error(Automaton parent) {
        super(parent, "error");
    }

    @Override
    void allClear() {
        parent.gotoState(new Working(parent));
    }
}
