package oop.ch07.auto.generics;

import java.lang.System.Logger;

/**
 * An abstract class representing a state in a state machine.
 *
 * @param <P> the type of the containing state.
 */
abstract class State<P extends State<?>> {
    /**
     * The logger for logging messages.
     */
    static final Logger LOGGER = System.getLogger(State.class.getName());

    /**
     * The parent state containing this state.
     */
    final P parent;

    /**
     * Constructs a state with the given parent.
     *
     * @param parent The state containing this state.
     */
    State(P parent) {
        this.parent = parent;
    }

    /**
     * Performs entry actions when entering this state.
     */
    void entry() {}

    void a() { /* do nothing */}

    void b() { /* do nothing */}

    void c() { /* do nothing */}

    void d() { /* do nothing */}

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
