/*
 * PlanVegetarianMenu.java
 * 
 * Write a try / catch block that catches Exception error.
 * When an invalid choice is made, the user should be presented with the message:
 * "You chose an invalid vegetarian selection."
 * 
 */

import javax.swing.*;
public class PlanVegetarianMenu
  {
    public static void main(String[] args)
    {
      VegetarianMenu briefMenu = new VegetarianMenu();
      PickMenu entree = null;
      String guestChoice = new String();
try
{
      PickMenu selection = new PickMenu(briefMenu);

      entree = selection;
      guestChoice = entree.getGuestChoice();
}
catch(Exception error)
{
	guestChoice = "an invalid choice";
}
      JOptionPane.showMessageDialog(null, "You chose " + guestChoice);
    }
  }