package oop.oop;

/**
 *
 * @author Administrator
 */
public class Bruch {
    int zaehler;    // Objektvariable
    int nenner;     // Objektvariable
    private static int anzahlBrueche;// Klassenattribut
    
    public Bruch() {   // Konstruktor
        this(0, 1);     // Konstruktorverkettung
        //nenner = 1;
    }
    public Bruch(int zaehler) {
        this(zaehler, 1);       // Konstruktorverkettung
        //this.zaehler = zaehler;
        //nenner = 1;
    }
    
    /**
     * 
     * @param zaehler das ist die Zahl über dem Bruchstrich
     * @param nenner wird auf den Wert != 0 geprüft
     */
    public Bruch(int zaehler, int nenner) {
        anzahlBrueche++;
        this.zaehler = zaehler;
        if (nenner != 0) // Nenner darf nicht 0 sein !!
            this.nenner = nenner;
        else
            this.nenner = 1;
    }
    
    // Klassenmethode zum Lesen der Klassenvariable anzahl_brueche
    // eine set-Methode ist nicht vorgesehen
    public static int getAnzahlBrueche() {
        return anzahlBrueche;
    }
    
    /**
     * Multiplikation des aktuellen Bruch Objektes 
     * mit dem Bruchobjekt aus der Parameterübergabe
     * 
     * @param bm Bruch Objekt als Mulitplikator
     * @return Ein Objekt der Klasse Bruch
     */
    public Bruch multipliziere(Bruch bm) {
        int z = this.zaehler * bm.zaehler;
        int n = this.nenner  * bm.nenner;
        Bruch e = new Bruch(z, n);
        e.kuerzen();
        return e;
    }
    
    public Bruch dividiere(Bruch bd) {
        int z = this.zaehler * bd.nenner;
        int n = this.nenner  * bd.zaehler;
        Bruch e = new Bruch(z, n);
        e.kuerzen();
        return e;
    }
    
    public Bruch addiere(Bruch ba) {
        int z = (this.zaehler * ba.nenner) + (this.nenner * ba.zaehler);
        int n = this.nenner * ba.nenner;
        Bruch e = new Bruch(z, n);
        e.kuerzen();
        return e;
    }
    
    public Bruch subtrahiere(Bruch bs) {
        int z = (this.zaehler * bs.nenner) - (this.nenner * bs.zaehler);
        int n = this.nenner * bs.nenner;
        Bruch e = new Bruch(z, n);
        e.kuerzen();
        return e;
    }
    
    public void erweitern(int faktor) {
        zaehler = zaehler * faktor;
        nenner  = nenner  * faktor;
    }
    
    public void kuerzen() {
        int t = ggt(zaehler, nenner); 
        zaehler = zaehler / t;
        nenner  = nenner / t;
    }
    
    // Klassenmethode siehe static
    // steht auch ohne Objekt zur Verfügung
    // Aufruf mit Bruch.ggt(..., ...)
    public static int ggt(int m, int n) {
        m = Math.abs(m);
        n = Math.abs(n);
        int r = m % n;
        while (r > 0) {
            m = n;
            n = r;
            r = m % n;
        }
        return n;
    }
    
    public double dezimalwert() {
        return (double)zaehler / (double)nenner;
    }
    
    public int signum() {
        if (dezimalwert() == 0) return 0;
        if (dezimalwert() > 0)  return 1;
        return -1;
    }
    
    public void ausgeben() {    // Methode ohne Rückgabewert, siehe void
        System.out.print(zaehler + " / " + nenner);
    }
    
    @Override
    public String toString() {
        return String.valueOf(zaehler + " / " + nenner);
    }
}
