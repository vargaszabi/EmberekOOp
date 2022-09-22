package hu.petrik.emberekoop;

public class Main {
    public static void main(String[] args) {
        Ember e1 = new Ember("Ol Ajos","2000-05-06", "Bivalybasznád");
        Ember e2 = new Ember("Maki Verem","2003-12-25", "Budapest");
        Ember e3 = new Ember("Kovács István","1998-08-01", "Debrecen");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
