/**
 *  file       : id 20221116°1415 — gitlab.com/normai/cheeseburger …/java/jv311kbd1menu.java
 *  version    : • 20221117°0913 v0.1.8 Filling • 20221116°1415 v0.1.6 Stub
 *  license    : BSD 3-Clause | © 2022 - 2023 Norbert C. Maier
 *  subject    : Demonstrate keyboard menu with pressing Enter
 *  userstory  :
 *  summary    :
 *  status     : Good enough.
 *  ref        : https://stackoverflow.com/questions/36344189/how-to-click-windows-key-in-java [ref 20221116°1812]
 *  ref        : https://docs.oracle.com/javase/7/docs/api/java/awt/Robot.html#keyPress(int) [ref 20221116°1814]
 *  ref        : https://docs.oracle.com/javase/tutorial/uiswing/misc/keybinding.html [ref 20221116°1816]
 *  ref        : https://www.delftstack.com/howto/java/get-keybord-input-in-java/ [ref 20221116°1818]
 *  ref        : https://stackoverflow.com/questions/59742483/java-how-to-get-user-input-without-pressing-the-enter-key [ref 20221116°1822]
 *  ref        : https://stackoverflow.com/questions/1066318/how-to-read-a-single-char-from-the-console-in-java-as-the-user-types-it [ref 20221116°1823]
 *  ref        : https://stackoverflow.com/questions/19672246/what-is-the-preferred-way-to-java-awt-keyboard-input [ref 20221116°1825]
 *  ref        : https://darkcoding.net/software/non-blocking-console-io-is-not-possible/ [ref 20221116°1832]
 *  ref        : https://www.tutorialspoint.com/awt/awt_key_event.htm [ref 20221116°1836]
 *  ref        :
 */

import java.util.*;


class Demos1
{
   private static final String sVERSION = "v0.1.8";
   private static final String sJAVAVER = "(Javac " + System.getProperty("java.runtime.version") + ")";

   public static void main(String[] args)
   {
      System.out.println(String.format("*** Hei, tama on `jv311kbd1menu.java` -- Keyboard menu (with Enter) %s ***", sVERSION, sJAVAVER)); // "Hei, tämä on"

      Scanner scn = new Scanner(System.in);
      boolean bRun = true;
      while (bRun)
      {
         System.out.println("Menu: a = Anton, k = Kylie, s = Santa, x = Exit");
         String sKey = scn.nextLine();

         switch (sKey)
         {
             case "a" :
                System.out.println("This is Anton speaking");
                break;
             case "k" :
                System.out.println("This is Kylie singing");
                break;
             case "K" :
            	 System.out.println("Geheime Kapitalverdoppelung angesteuert");
            	 Kapitalverdoppelung Kapitalx2 = new Kapitalverdoppelung();
            	 Kapitalx2.kapitalverdoppelung(1, 1);
             case "s" :
                System.out.println("This is Santa Claus ringing");
                break;
             case "x" :
                bRun = false;
                break;
             default :
                System.out.println("Invalid selection: \"" + sKey + "\"");
             case "S" :
            	 System.out.println("Geographie");
            	 Kreisberechnung flaeche = new Kreisberechnung();
            	 flaeche.Flaeche(4.4);
            	 flaeche.Umfang(7.6);
            	 break;
         }
      }

      scn.close();
      System.out.println("Nakemiin.");                                 // "Näkemiin"
   }
}
