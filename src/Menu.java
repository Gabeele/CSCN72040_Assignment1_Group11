import java.util.Scanner;

public class Menu {

	static void printMenu() {
		do {
			System.out.println("Welcome to the program =]");
			System.out.println("1. For entering a file name");
			System.out.println("2. For entering a set of data");
			System.out.println("3. TO EXIT");
		} while (Menu.select());
	}

	static boolean select() {
		Scanner inputScanner = new Scanner(System.in);
		int inputInt = inputScanner.nextInt();

		switch (inputInt) {
		case 1: {
			Menu.enterFile();
			break;
		}
		case 2: {
			Menu.enterData();
			break;
		}
		case 3: {
			return false;
		}
		default:
			throw new IllegalArgumentException("Unexpected value");
		}
		return true;
	}

	static void enterFile() {
		System.out.println("Enter the name of the file you wish to read:");

		Scanner inputScanner = new Scanner(System.in);
		String inputString = inputScanner.nextLine();

		DataHandler.fileToDataSet(inputString);
	}

	static void enterData() {
		System.out.println("Enter your data: i.e. 1,2,3 ");

		Scanner inputScanner = new Scanner(System.in);
		String inputString = inputScanner.nextLine();

		DataHandler.coordinatesToDataPoint(inputString);
	}
}
