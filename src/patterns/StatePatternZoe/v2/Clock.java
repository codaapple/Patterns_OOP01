package patterns.StatePatternZoe.v2;

public class Clock {
    final State normal = new Normal(this);
    final State setting = new Setting(this);
    private State state = normal;
    private int t = 0;

    public Clock(){
    }
    
    void setState(State s) { 
        state = s;
    }

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
