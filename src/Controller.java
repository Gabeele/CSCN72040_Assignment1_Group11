
public class Controller
{

	public static void coordinateController(String input)
	{
		DataPoint dp = DataHandler.coordinatesToDataPoint(input);
		//Pass to machine learning interface

	}
	
	public static void fileController(String input)
	{
		DataSet ds = DataHandler.fileToDataSet(input);
		//Pass to machine learning interface
		//Write the file in Data handler
		
	}
	
	
}
