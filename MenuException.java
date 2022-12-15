/*
 * MenuException.java
 * This class contains syntax errors.
 */
public class MenuException extends Exception
  {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L; //Eclipse said I needed this, automatically suggested it to fix an error//

	public MenuException(String choice)
    {
      super(choice);
    }
  }