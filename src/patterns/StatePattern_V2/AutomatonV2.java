package patterns.StatePattern_V2;

public class AutomatonV2 {

    StateV2 rot = new Rot(this);
    StateV2 grün = new Grün(this);
    StateV2 gang = new Übergang(this);
    private StateV2 currentState = rot;

    public void crosswalker(){
        currentState.crosswalker();
    }
    public void car(){
        currentState.car();
    }
    public void next(){
        currentState.next();
    }

    public StateV2 getCurrentState(){
        return currentState;
    }

    public void setCurrentState(StateV2 currentState){
        this.currentState = currentState;
    }

}
