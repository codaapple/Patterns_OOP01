package patterns.VisitorPattern;

public class BronzCard implements Creditcard {

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String toString(){
        return "BronzCard";
    }


}
