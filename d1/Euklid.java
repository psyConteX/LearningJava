/**
 *  2023-05-02`17:11
 *  Berechnung GGT nach Struktogramm Handout 1 'Algorithmen' Folie 13
 */

class Euklid {
   public static void main(String[] args) {
      System.out.println("*** Aloha Euklid ***");

      int iOne = 36;                           // m, e.g. 36
      int iTwo = 24;                           // n, e.g. 24
      int iRemi;                               // r, remainder

      System.out.println("Berechne GGT von " + iOne + " und " + iTwo);

      iRemi = iOne % iTwo;
      while (iRemi > 0) {
         iOne = iTwo;
         iTwo = iRemi;
         iRemi =  iOne % iTwo;
      }
      System.out.println("GGT = " + iTwo);
   }
}
