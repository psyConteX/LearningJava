
public class WriteSymbol {

	public static void main(String[] args) {
		// init block
		String star; 		
		String sign1=" ";	
		String sign2="#";	
		star = "";			
		int x, xsize;
		int y, ysize;
		x = 0;
		y = 0;
		xsize = 10;
		ysize = 10;
		// init block end
		while (y < ysize) { 							//zeilen check
			while (x < xsize) {							//spalten check
				//System.out.println(x+"<-x y->"+ y); 	//debug line
				if (y>0&&x>0&&y<ysize-1&&x<xsize-1) {	star += sign1; } 
				else { star+=sign2; } //positions abfrage sobald 1+ abstand
				x++;
			}
			System.out.println(star); 					//zeile geschrieben
			x=0;										//reset spaltenzahl 
			star = "";									//reset zeileninhalt
			y++;										//nächste zeile
		}
		
		System.out.println("Done");						//schleifen ende
		}

 
}