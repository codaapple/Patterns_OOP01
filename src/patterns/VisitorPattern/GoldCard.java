package patterns.VisitorPattern;

public class GoldCard implements Creditcard{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String toString(){
        return "BronzCard";
    }
}
