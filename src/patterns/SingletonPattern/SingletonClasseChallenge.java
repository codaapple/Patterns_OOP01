package patterns.SingletonPattern;

import static java.lang.Math.pow;

public class SingletonClasseChallenge {

    private static SingletonClasseChallenge instance;
    private static int Key;

    // Privater Konstrukter, damit nicht ausversehen mehrere Instanzen erzeugt werden können
    private SingletonClasseChallenge() {}

    //Factory Method, sie erzeugt ein Instance oder gibt sie zurück
    public static SingletonClasseChallenge getInstance() {
        //wenn noch keine Instance vorhanden ist, erzeugt die Methode eine
        if (instance == null) {
            instance = new SingletonClasseChallenge();
        }
        //in jedem Fall wird die Instance zurück gegeben
        return instance;
    }
    public static SingletonClasseChallenge getInstance(int key) {
        if (instance == null) {
            instance = new SingletonClasseChallenge();
            //in Statischen Methoden kann kein this. verwendet werden, wodurch es notwendig wird die beiden Variablen unterschiedlich zu benennen
            Key = key;
            //nur wenn eine Instanz mit Key erzeugt wird, kann der Key gesetzt werden, danach ist dieser unveränderbar
        }
        return instance;
    }
    public int challenge(int message) {
        return (int) (pow(message,Key));
    }
}
