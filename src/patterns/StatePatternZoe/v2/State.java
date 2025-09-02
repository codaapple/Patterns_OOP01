package patterns.StatePatternZoe.v2;

abstract class State {

    final Clock clock;

    State(Clock c) {
        clock = c;
    }

    abstract void tick();

    abstract void set();
    
    abstract void mode();
}
