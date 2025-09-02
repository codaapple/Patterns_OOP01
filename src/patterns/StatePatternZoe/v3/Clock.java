package patterns.StatePatternZoe.v3;

public class Clock {

    public Clock(){
    }

    private abstract class State{
        abstract void tick();
        abstract void set();
        abstract void mode();
    }

    private final State normal = new State() {
        void tick() {
            setTime(getTime() + 1);
        }
        void set() {
        }
        void mode() {
            state = setting;
        }
    };

    private final State setting = new State() {
        void tick() {
        }
        void set() {
            setTime(getTime() + 60);
        }
        void mode() {
            state = normal;
        }
    };

    private State state = normal;
    private int t = 0;

    public int getTime() {
        return t;
    }

    void setTime(int t) { 
        this.t = t;
    }

    public void tick() { 
        state.tick(); 
    }

    public void set() { 
        state.set(); 
    }

    public void mode() {
        state.mode(); 
    }
}
