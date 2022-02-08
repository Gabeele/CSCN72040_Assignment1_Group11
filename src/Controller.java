
public class Controller
{

	static private MachineLearning learningModel = new MachineLearning();
	
	public static int coordinateController(String input, ClassifierNames classifier)
	{
		DataPoint dp = DataHandler.coordinatesToDataPoint(input);

		return learningModel.predictOrientation(dp, classifier);
		
	}
	
	public static void fileController(String filename, ClassifierNames classifier)
	{

		DataSet ds = DataHandler.fileToDataSet(filename);

		for (int i = 0; i < ds.points.size(); i++) {
			ds.points.elementAt(i).setOrientation(learningModel.predictOrientation(ds.points.elementAt(i), classifier));
		}
		
		DataHandler.dataSetToFile(ds, filename);
		
	}
	
	public static void fileController(String filename)
	{

		DataSet ds = DataHandler.fileToDataSet(filename);

		learningModel.setTrainingData(ds);
		
	}
	
	
}
