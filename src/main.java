
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
