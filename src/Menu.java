import java.util.Scanner;

public class Menu
{
	
	private static Scanner inputScanner = new Scanner(System.in);

	static boolean printMenu()
	{
		System.out.println("Welcome to the program =]");
		System.out.println("1. For entering a file name");
		System.out.println("2. For entering a set of data");
		System.out.println("3. To import training data ");
		System.out.println("4. TO EXIT");
			
		return select();
	}

	static boolean select()
	{
		String input;
		try 
		{
			
			input = inputScanner.next();
			
			switch (Integer.parseInt(input))
			{
			case 1:
			{
				enterFile();
				break;
			}
			case 2:
			{
				enterDataManually();
				break;
			}
			case 3:
			{
				enterTrainingData();
				break;
			}
			case 4:
			{
				return false;
			}
			default:
				//throw new IllegalArgumentException("Unexpected value");
			}
		} catch (NumberFormatException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

	static void enterFile()
	{
		System.out.println("Enter the name of the file you wish to read:");

		String inputString = inputScanner.next();
		ClassifierNames classifier = Menu.pickClassifier();

		Controller.fileController(inputString, classifier);
		
		System.out.println("Data exported");

		
	}
	
	static void enterDataManually() {
		String data = Menu.enterData();
		ClassifierNames classifier = Menu.pickClassifier();
		int orientation = Controller.coordinateController(data, classifier);
		PrintPredictedOrientation(orientation);
	}

	static String enterData()
	{
		System.out.println("Enter your X vector: i.e. 1,2,3 ");

		String inputString = inputScanner.next();
		
		
		return inputString;
	}
	
	static ClassifierNames pickClassifier() {
		System.out.println("Select the classifier:");
		System.out.println("1. Nearest Neighbor");
		System.out.println("2. Another Classifier");
		

		int userInput = inputScanner.nextInt();

		
		ClassifierNames classifier;
		if (userInput == 1) {
			classifier = ClassifierNames.NEAREST_NEIGHBORS;
		}
		else {
			classifier = ClassifierNames.ANOTHER_CLASSIFIER;
		}
		
		return classifier;
	}
	
	static void PrintPredictedOrientation(int orientation) {
		System.out.println("The device with those accelerometer vectors is oriented as " );
		
		switch (orientation) {
		case 1:
		{
			System.out.print("FACE UP");
			break;
		}
		case 2:
		{
			System.out.print("FACE DOWN");
			break;
		}
		case 3:
		{
			System.out.print("PORTRAIT");
			break;
		}
		case 4:
		{
			System.out.print("PORTRAIT UPSIDE DOWN");
			break;
		}
		case 5:
		{
			System.out.print("LANDSCAPE LEFT");
			break;
		}
		case 6:
		{
			System.out.print("LANDSCAPE RIGHT");
			break;
		}
		default:
		{
			System.out.print("UNKNOWN");
			break;
		}
		}
		return;
	}
	

	static void enterTrainingData() {
		
		System.out.println("Enter the name of the file you wish to read:");

		String inputString = inputScanner.next();

		Controller.fileController(inputString);
		
		System.out.println("Data imported");
		
	
	}
	
	static void closeInputScanner() {
	
		inputScanner.close();
	}
	
}
