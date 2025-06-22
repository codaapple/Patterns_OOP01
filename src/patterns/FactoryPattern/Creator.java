package patterns.FactoryPattern;

public class Creator {

    public static Produkt createProdukt(String produkt){
        switch (produkt.toLowerCase()){
            case "produkt1":
                return new ConcreteProdukt1();
            case "produkt2":
                return new ConcreteProdukt2();
            case "apfel":
                return new ConcreteProdukt1();
            default:
                throw new IllegalArgumentException("Unbekanntes Produkt: " + produkt);
        }
    }

}
