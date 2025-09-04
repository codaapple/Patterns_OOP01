package oop.ch07.auto.simple;

import java.lang.System.Logger;

/**
 * An abstract class representing a state in a state machine.
 */
abstract class State {
    /**
     * The logger for logging messages.
     */
    static final Logger LOGGER = System.getLogger(State.class.getName());

    /**
     * The parent state containing this state.
     */
    final State parent;

    /**
     * Constructs a state with the given parent.
     *
     * @param parent The state containing this state.
     */
    State(State parent) {
        this.parent = parent;
    }

    void gotoState(State newState) {
        throw new IllegalStateException("not in a statemachine");
    }

    /**
     * Performs entry actions when entering this state.
     */
    void entry() { /* do nothing */}

    void a() { /* do nothing */}

    void b() { /* do nothing */}

    void c() { /* do nothing */}

    void d() { /* do nothing */}

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
