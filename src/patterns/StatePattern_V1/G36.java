package patterns.StatePattern_V1;

public class G36 {
    private State state=new Entladen();
    public G36() {}
    
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }

    public void next(){
        state.next(this);
    }
    public void prev(){
        state.prev(this);
    }
    public void verschluss(){
        state.verschluss(this);
    }
    public void magazinEinführen(){
        state.magazinEinführen(this);
    }
    public void magazinEntnehmen(){
        state.magazinEntnehmen(this);
    }
    public void abkrümmen(){
        state.abkrümmen(this);
    }
}
