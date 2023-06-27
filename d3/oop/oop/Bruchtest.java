
package oop.oop;

/**
 *
 * @author Administrator
 */
public class Bruchtest {
    int varTest;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ggt von 27 und 39 ist " + Bruch.ggt(27,39));
        
        System.out.println("Anzahl Brüche: " + Bruch.getAnzahlBrueche());

        Bruch b1 = new Bruch();
        System.out.println("b1: " + b1);
        b1.zaehler = 5;
        b1.nenner = 8;
        System.out.println("Bruch b1 = " + b1.zaehler + " / " + b1.nenner);
        
        Bruch b2 = new Bruch();
        b2.zaehler = 1;
        b2.nenner = 2;
        System.out.println("b2: " + b2);
        System.out.println("Bruch b2 = " + b2.zaehler + " / " + b2.nenner);
        
        System.out.println("b1 == b2: " + (b1 == b2));  // false
        int zahl1 = 2877;
        int zahl2 = 66;
        zahl2 = zahl1;
       
        System.out.println("zahl1=" + zahl1);
        System.out.println("zahl2=" + zahl2);
        zahl1 = 7777;
        System.out.println("zahl1=" + zahl1);
        b2 = b1;    // Objekt Referenz wird zugewiesen
        System.out.println("b1 == b2: " + (b1 == b2));  // true
        
        System.out.println("Bruch b1 = " + b1.zaehler + " / " + b1.nenner);
        System.out.println("Bruch b2 = " + b2.zaehler + " / " + b2.nenner);
        
        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);
        // gleiche Referenzen
        // die Referenz auf das ursprüngliche Objekt b2 existiert nicht mehr

        Bruch b3 = new Bruch();
        b3.zaehler = 5;
        b3.nenner = 6;
        
        Bruch b4 = new Bruch();
        b4.zaehler = 5;
        b4.nenner = 6;
        
        System.out.println("b3 == b4: " + (b3 == b4));  // false
        
        int a = 8;
        int b = 8;
        System.out.println("a == b: " + (a == b));  // true

        // Lebensdauer eines Objektes
        int x = 11;
        Bruch b5 = null;
        if (x > 10) {
            b5 = new Bruch();
            b5.zaehler = 2;
            b5.nenner = 3;
        }
        System.out.println(b5.zaehler);
        
        b5.ausgeben();
        System.out.println("");
        System.out.println("b5: " + b5);
        
       /* Bruch b10 = new Bruch();
        b10.zaehler = 15;
        b10.nenner = 45; */
        Bruch b10 = new Bruch(15,45);
       
        System.out.println("b10: " + b10);
        b10.kuerzen();
        System.out.println("b10: " + b10);
        
        // Methode ggt ausserhalb der Klasse Bruch nutzen
        System.out.println("ggt von 18 und 39 ist " + b1.ggt(18,39));
           
        Bruch b20 = b5.multipliziere(b10);
        System.out.println("b5 * b10:");
        System.out.println(b5 + " * " + b10 + " = " + b20);
        
        b5 = b5.multipliziere(b10);
        Bruch xx = new Bruch(7);
        System.out.println(xx);
        
        /* (1/2 + 3/4) : 1/10 = 25/2 */
        Bruch test = new Bruch(1,2).addiere(new Bruch(3,4)).dividiere(new Bruch(1,10));
        System.out.println("--> " + test);
        
        System.out.println("--> dezimal " + test.dezimalwert());
        
        System.out.println("Anzahl Brüche: " + Bruch.getAnzahlBrueche());
        
        
    }
    
}


