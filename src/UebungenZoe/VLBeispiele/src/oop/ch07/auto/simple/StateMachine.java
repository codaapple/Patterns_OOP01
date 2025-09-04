package oop.ch07.auto.simple;

import java.lang.System.Logger.Level;

/**
 * An abstract class representing a state machine. It maintains the current state and provides methods to transition
 * between states.
 */
abstract class StateMachine extends State {
    /**
     * The current state of the state machine.
     */
    private State state;

    /**
     * Constructs a state machine with the given parent.
     *
     * @param parent The parent state machine.
     */
    StateMachine(State parent) {
        super(parent);
    }

    /**
     * Gets the initial state of the state machine.
     */
    abstract State initialState();

    /**
     * Transitions the state machine to the specified state.
     *
     * @param newState The state to transition to.
     */
    @Override
    void gotoState(State newState) {
        LOGGER.log(Level.DEBUG, "{0}: {1} --> {2}", this, state, newState);
        enter(newState);
    }

    /**
     * Performs the entry action of the state machine.
     */
    @Override
    void entry() {
        final State newState = initialState();
        LOGGER.log(Level.DEBUG, "{0}: initial state={1}", this, newState);
        enter(newState);
    }

    /**
     * Enters a new state.
     *
     * @param newState The new state to enter.
     */
    private void enter(State newState) {
        if (newState.parent != this)
            throw new IllegalArgumentException("Wrong state: " + newState + " belongs to " + newState.parent + " instead of " + this);
        state = newState;
        state.entry();
    }

    @Override
    void a() {
        state.a();
    }

    @Override
    void b() {
        state.b();
    }

    @Override
    void c() {
        state.c();
    }

    @Override
    void d() {
        state.d();
    }

    @Override
    public String toString() {
        return super.toString() + "(in " + state + ")";
    }
}
