package oop.ch07.auto.generics;

public class Demo {
    public static void main(String[] args) {
        final Automaton auto = new Automaton();
        System.out.println("a:");
        auto.a();
        System.out.println("---------\nb:");
        auto.b();
        System.out.println("---------\nc:");
        auto.c();
        System.out.println("---------\nd:");
        auto.d();
        System.out.println("---------\nc:");
        auto.c();
        System.out.println("---------\nd:");
        auto.d();
        System.out.println("---------\nc:");
        auto.c();
        System.out.println("---------\na:");
        auto.a();
        System.out.println("---------\nb:");
        auto.b();
    }
}
