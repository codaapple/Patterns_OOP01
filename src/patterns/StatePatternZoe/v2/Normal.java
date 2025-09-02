package patterns.StatePatternZoe.v2;

class Normal extends State {

    Normal (Clock clock) {
        super(clock);
    }

    public void tick(){
        clock.setTime(clock.getTime() + 1);
    }

    public void set(){
    }

    public void mode(){
        clock.setState(clock.setting);
    }
}
