package patterns.StatePatternZoe.v1;

class Setting extends State {

    Setting (Clock clock) {
        super(clock);
    }

    public void tick(){

    }

    public void set(){
        clock.setTime(clock.getTime() + 60);
    }

    public void mode(){
        clock.setState(new Normal(clock)); 
        System.out.println("Wechsle von Setting zu Normal.");
    }
}
