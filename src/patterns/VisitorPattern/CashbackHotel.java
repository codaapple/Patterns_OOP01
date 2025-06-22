package patterns.VisitorPattern;


public class CashbackHotel implements Visitor {

    public CashbackHotel(){}

    @Override
    public void visit(Creditcard card) {
        switch(card){
            case BronzCard b ->
                System.out.println("5%");
            case SilverCard b ->
                System.out.println("10%");
            case GoldCard b ->
                System.out.println("20%");
            default ->
                throw new UnsupportedOperationException("Not supported yet.");
        }
    }
}