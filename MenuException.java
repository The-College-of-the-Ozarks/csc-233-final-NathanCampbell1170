/*
 * MenuException.java
 * This class contains syntax errors.
 */
public class MenuException inherits Exception
  {
    public MenuException(String choice)
    {
      supper(choice);
    }
  }