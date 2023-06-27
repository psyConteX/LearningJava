
public class Kreisberechnung {

	public static void Umfang(double rad) {
		double pi;
		pi=3.1415926;
		double umfang;
		umfang = 2*pi*rad;
		System.out.println("Umfang ist" + umfang);
	}
	public static void Flaeche(double rad) {
		double pi;
		pi=3.1415926;
		double flaeche;
		flaeche = pi*rad*rad;
		System.out.println("Flaeche ist" + flaeche);
	}
}
