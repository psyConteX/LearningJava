	import java.util.Scanner;
public class Kapitalverdoppelung
{

	   public static void kapitalverdoppelung(int a,int b) 
	   {
	      System.out.println("*** Kapitalverdoppelung ***");
	      System.out.println(a+" "+b);

	      // Numerical input
	      Scanner myObj = new Scanner(System.in);  // Konstruktor-Aufruf
	      System.out.print("Bitte Ursprungskapital in EUR eingeben: ");
	      double uk = myObj.nextDouble();
	      System.out.println("Ursprungskapital = " + uk + " EUR");

	      System.out.print("Bitte Zinssatz in Prozent eingeben: ");
	      double ps = myObj.nextDouble();
	      System.out.println("Zinssatz = " + ps + " %");

	      // Interne variablen
	      double k;                  // Deklaration
	      k = uk;                    // Initialisierung
	      int jahre = 0;             // Deklaration + Initialisierung

	      while (k < (uk * 2)) {
	         // Zinsformel
	         k = k * (1 + ps / 100);
	         jahre++;
	      }

	      double k2 = Math.round(k * 100) / 100.0;  // Achtung, Division durch 100 geht, liefert aber falsches Ergebnis
	      System.out.println("Jahre = " + jahre + ", Kapital = " + k2 + " EUR");

	      System.out.println("Ende.");
	}
}
