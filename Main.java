/*
 * Main.java
 * This program is the main driver for the Restaurant. 
 * This program only contains syntax errors that need to be corrected. 
 */
import javax.swing.JOptionPane;
public class Main {
	
	public static void Main(String[] args)
	{
	      int guestChoiceMenu = 0;
	      try 
	      {
		      do 
		      {
		      String input = JOptionPane.showInputDialog(null, "1. Regular Menu\n" + "2. Vegetarian Menu\n" + "Type your selection, then press Enter.")
		      guestChoiceMenu = Integer.parseint(input);
		      } while (guestChoiceMenu != 1 && guestChoiceMenu != 2);
		      
		      if (guestChoiceMenu == 1)
		      {
		    	  PlanMenu.main(null);
		      }
		      else
		      {
		    	  PlanVegetarianMenu.main(null)
		      }
	      }
	      catch(Exception mistake)
	      {
	          JOptionPane.showMesageDialog(null, "You chose an invalid menu option");
	      }
	 }
}
