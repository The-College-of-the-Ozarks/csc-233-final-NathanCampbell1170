/*
 * PlanMenu.java
 * The code for the Exception catch has gone missing. 
 */
import javax.swing.*;
public class PlanMenu
  {
    public static void main(String[] args)
    {
      Menu briefMenu = new Menu();
      PickMenu entree = null;
      String guestChoice = new String();

      try
        {
          PickMenu selection = new PickMenu(briefMenu);
          entree = selection;
          guestChoice = entree.getGuestChoice();
        }
      catch(MenuException error)
      {
    	  guestChoice = error.getMessage();
      }
      catch(Exception error)
		{
    	  //missing code here.
		}
      JOptionPane.showMessageDialog(null, "You chose " + guestChoice);
    }
  }