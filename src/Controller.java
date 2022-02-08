
public class Controller
{

	public static int coordinateController(String input, ClassifierNames classifier)
	{
		DataPoint dp = DataHandler.coordinatesToDataPoint(input);
		//Pass to machine learning interface
		MachineLearningInterface MLI = new MachineLearning();
		return MLI.predictOrientation(dp, classifier);
		
	}
	
	public static void fileController(String filename, ClassifierNames classifier)
	{
		MachineLearningInterface MLI = new MachineLearning();

		DataSet ds = DataHandler.fileToDataSet(filename);
		//Pass to machine learning interface
		//Write the file in Data handler
		
		for (int i = 0; i < ds.points.size(); i++) {
			ds.points.elementAt(i).setOrientation(MLI.predictOrientation(ds.points.elementAt(i), classifier));
		}
		
		DataHandler.dataSetToFile(ds, filename);
		
	}
	
	public static void fileController(String filename)
	{
		MachineLearningInterface MLI = new MachineLearning();

		DataSet ds = DataHandler.fileToDataSet(filename);
		//Pass to machine learning interface
		//Write the file in Data handler
		
		MLI.setTrainingData(ds);
		
	}
	
	
}
