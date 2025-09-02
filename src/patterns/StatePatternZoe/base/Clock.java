package patterns.StatePatternZoe.base;

public class Clock {
    private State state = State.Normal;
    private int time = 0;

    public Clock(){
    }

    public int getTime() {
        return time;
    }
    public void tick(){
        switch (state) {
            case Normal: time +=1; break;
            case Setting: break;
        }
    }
    public void set() {
        switch (state) {
            case Normal: break;
            case Setting: time += 60; break;
        }
    }
    public void mode() {
        switch (state) {
            case Normal: state = State.Setting; break;
            case Setting: state = State.Normal; break;
        }
    }
}
