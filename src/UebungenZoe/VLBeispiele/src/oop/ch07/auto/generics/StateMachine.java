package oop.ch07.auto.generics;

import java.lang.System.Logger.Level;

/**
 * An abstract class representing a state machine. It maintains the current state and provides methods to transition
 * between states.
 *
 * @param <S> the type of the concrete state machine.
 * @param <P> the type of the containing state.
 */
abstract class StateMachine<S extends StateMachine<S, P>, P extends State<?>> extends State<P> {
    /**
     * The current state of the state machine.
     */
    private State<S> state;

    /**
     * Constructs a state machine with the given parent.
     *
     * @param parent The parent state machine.
     */
    StateMachine(P parent) {
        super(parent);
    }

    /**
     * Gets the initial state of the state machine.
     */
    abstract State<S> initialState();

    /**
     * Transitions the state machine to the specified state.
     *
     * @param newState The state to transition to.
     */
    void gotoState(State<S> newState) {
        LOGGER.log(Level.DEBUG, "{0}: {1} --> {2}", this, state, newState);
        enter(newState);
    }

    /**
     * Performs the entry action of the state machine.
     */
    @Override
    void entry() {
        final State<S> newState = initialState();
        LOGGER.log(Level.DEBUG, "{0}: initial state={1}", this, newState);
        enter(newState);
    }

    /**
     * Enters a new state.
     *
     * @param newState The new state to enter.
     */
    private void enter(State<S> newState) {
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
