/*
 * PickMenu.java
 * There are no issues with this class.
 */
import javax.swing.*;
public class PickMenu
  {
    private Menu briefMenu;
    private String guestChoice = new String();

    public PickMenu(Menu theMenu) throws MenuException
    {
      briefMenu = theMenu;
      setGuestChoice();
    }

    public void setGuestChoice() throws MenuException
    {
      JOptionPane.showMessageDialog(null, "Choose from the following menu:");
      guestChoice = briefMenu.displayMenu();
    }

    public String getGuestChoice()
    {
      return(guestChoice);
    }
  }