package hu.petrik.emberekoop;

public class Main {
    public static void main(String[] args) {
        Ember e1 = new Ember("Ol Ajos", "2000-05-06", "Bivalybasznád");
        Ember e2 = new Ember("Maki Verem", "2003-12-25", "Budapest");
        Ember e3 = new Ember("Kovács István", "1998-08-01", "Debrecen");
        Ember e4 = new Ember("Kis Abdul", "2008-12-30", "Veszprém");
        Ember e5 = new Ember("Lakatos Mercédesz", "1998-03-5", "Pécs");
        Ember[] emberTomb = new Ember[]{e1, e2, e3, e4, e5};
        Emberek ek = new Emberek(emberTomb);
        System.out.println(ek);
    }
}
