package oop.ch07.calc;

import oop.ch06.calc.BinaryOp;
import oop.ch06.calc.UnaryOp;

import java.lang.System.Logger;

/**
 * An abstract class representing a state in a calculator state machine.
 * This class provides basic functionalities that all states in the calculator state machine should implement.
 *
 * @param <P> the type of the containing state.
 */
abstract class State<P extends State<?>> {
    /**
     * The logger for logging messages.
     */
    static final Logger LOGGER = System.getLogger(State.class.getName());

    /**
     * The name of the state.
     */
    final String name;

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
        this(parent, null);
    }

    /**
     * Constructs a state with the given parent and name.
     *
     * @param parent The state containing this state.
     * @param name   The name of the state.
     */
    State(P parent, String name) {
        this.parent = parent;
        this.name = name;
    }

    /**
     * Performs entry actions when entering this state.
     */
    void entry() {}

    /**
     * Handles the input of a digit.
     *
     * @param d The digit to be handled.
     */
    void digit(int d) {}

    /**
     * Handles the input of a dot.
     */
    void dot() {}

    /**
     * Handles the application of a unary operation.
     *
     * @param op The unary operation to be applied.
     */
    void unOp(UnaryOp op) {}

    /**
     * Handles the application of a binary operation.
     *
     * @param op The binary operation to be applied.
     */
    void binOp(BinaryOp op) {}

    /**
     * Evaluates the current expression.
     */
    void eval() {}

    /**
     * Clears the current input.
     */
    void clear() {}

    /**
     * Clears all stored values and resets the calculator.
     */
    void allClear() {}

    /**
     * Handles error conditions.
     */
    void error() {}

    /**
     * Gets the calculator associated with this state.
     *
     * @return The calculator object.
     */
    Calculator getCalculator() {
        return parent.getCalculator();
    }

    @Override
    public String toString() {
        return name == null ? getClass().getName() : name;
    }
}
