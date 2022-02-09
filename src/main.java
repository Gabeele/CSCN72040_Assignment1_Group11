/**
 * {@summary Main class to begin the application}
 * 
 * @author Gavin Abeele
 * @author Brayden Bowler
 * @author Karl Stencell
 * @author Thomas Horvath 
 * 
 * @version 1.0
 * 
 */
public class main
{

	public static void main(String[] args)
	{
		boolean runFlag = true;
		
		do {
			runFlag = Menu.printMenu();
			
			
		}while(runFlag);
		
			Menu.closeInputScanner();
		
	}

}
