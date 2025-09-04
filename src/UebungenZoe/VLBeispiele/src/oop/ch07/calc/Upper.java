package oop.ch07.calc;

class Upper extends StateMachine<Upper, Working> {
    Upper(Working parent) {
        super(parent, "upper");
    }

    @Override
    NoOp initialState() {
        return new NoOp(this);
    }
}
