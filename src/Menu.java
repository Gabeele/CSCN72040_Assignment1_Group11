import java.util.Scanner;

/**
 * {@summary Class provides static methods for the user interface. Including user input, print menus, and facilitating actions on the controller}
 * 
 * @author Gavin Abeele
 * @author Brayden Bowler
 * @author Karl Stencell
 * @author Thomas Horvath 
 * 
 * @version 1.0
 * 
 */
public class Menu
{

	private static Scanner inputScanner = new Scanner(System.in);

	/**
	 * Prints the welcome and menu screen
	 * @return Boolean of the select function (False if user exits the program)
	 */
	static boolean printMenu()
	{
		System.out.println("\n------------------------------------------------------------");
		System.out.println("Welcome to the program =]");
		System.out.println("-------------------------------------------------------------");
		System.out.println("    1. To calculate unknown data of a file (unknownData.txt)");
		System.out.println("    2. To calculate unknown single point");
		System.out.println("    3. To import training data (trainingData.txt)");
		System.out.println("    4. TO EXIT");

		return select();
	}
	
	/**
	 * Prints the list of classifiers
	 */
	static void printClassifierList() {
		System.out.println("Select the classifier:");
		System.out.println("1. Nearest Neighbor");
		System.out.println("2. Another Classifier");
	}

	/**
	 * The menu select functionality to determine which action the user chooses
	 * @return
	 */
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
				enterFile();				//Enter in a unknown data file
				break;
			}
			case 2:
			{
				enterPoint();				//Enter in a single point
				break;
			}
			case 3:
			{
				enterTrainingData();		//Enter in the training data
				break;
			}
			case 4:
			{
				return false;	//Returns false if user exists
			}
			default:
				throw new IllegalArgumentException("Unexpected value");
			}
		} catch (Exception e)
		{
			System.out.println("Error in user input");
		}

		return true;	
	}

	
	/**
	 * Static function to enter in a unknown data file to create orientation points
	 */
	static void enterFile()
	{
		System.out.println("Enter the file name of unknown data to determine orientation:");

		try
		{
			String inputString = inputScanner.next();

			ClassifierNames classifier = pickClassifier();

			Controller.fileController(inputString, classifier);	

		} catch (Exception e)
		{
			System.out.println("Error in user input");
		}

	}

	/**
	 * Static function to determine the orentation of a single point provided by the user
	 */
	static void enterPoint()
	{
		String inputString = null;
		
		System.out.println("Enter your vector separated by commas and no spaces (eg. 1,2,3):");
		
		try
		{
			inputString = inputScanner.next();
			
		} catch (Exception e)
		{
			System.out.println("Error in user input");
		}
				
		ClassifierNames classifier = pickClassifier();
		
		int orientation = Controller.coordinateController(inputString, classifier);
		
		PrintPredictedOrientation(orientation);
	}
	
	/**
	 * Static function to enter in the file location of the training data set
	 */
	static void enterTrainingData() {
		
		System.out.println("Enter the training data file:");
		
		try {
		
			String inputString = inputScanner.next();
	
			Controller.fileController(inputString);
			
				
		}catch (Exception e)
		{
			System.out.println("Error in user input");
		}
		
	}

	/**
	 * Static function to select the classifier 
	 * @return the selected classifier
	 */
	static ClassifierNames pickClassifier(){
		
		int inputInt=0;
		ClassifierNames classifier = null;
		
		printClassifierList();
		
		try
		{
			inputInt =  inputScanner.nextInt();
			
			if (inputInt == 1)
			{
				classifier = ClassifierNames.NEAREST_NEIGHBORS;
			} else
			{
				classifier = ClassifierNames.ANOTHER_CLASSIFIER;
			}

		} catch (Exception e)
		{
			System.out.println("Error in user input");
		}
		return classifier;
	}

	/**
	 * Prints the  point orientation
	 * @param orientation the integer equivalent of the orientation 
	 */
	static void PrintPredictedOrientation(int orientation)
	{
		
		System.out.println("The device with those accelerometer vectors is oriented as " + getOrientationString(orientation));
		
	}

	/**
	 * Static function to convert the orientation integer to a string 
	 * @param orientation Integer value representing a orientation 
	 * @return A string of the orientation 
	 */
	public static String getOrientationString(int orientation) {
		switch (orientation)
		{
		case 1:
		{
			return("FACE UP");

		}
		case 2:
		{
			return("FACE DOWN");

		}
		case 3:
		{
			return("PORTRAIT");
		}
		case 4:
		{
			return("PORTRAIT UPSIDE DOWN");

		}
		case 5:
		{
			return("LANDSCAPE LEFT");

		}
		case 6:
		{
			return("LANDSCAPE RIGHT");

		}
		default:
		{
			return("UNKNOWN");


		}
		}
		}
	
	/**
	 * Cleaner function for the input scanner
	 */
	static void closeInputScanner()
	{

		inputScanner.close();
	}
		
}
