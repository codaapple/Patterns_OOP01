package patterns.VisitorPattern;

public class SilverCard implements Creditcard{

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String toString(){
        return "SilverCard";
    }
}
