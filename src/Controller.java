/**
 * {@summary Class provides static controller methods to facilitate data management, the UI, and the machine learning module}
 * 
 * @author Gavin Abeele
 * @author Brayden Bowler
 * @author Karl Stencell
 * @author Thomas Horvath 
 * 
 * @version 1.0
 * 
 */
public class Controller
{

	static private MachineLearning learningModel = new MachineLearning();
	
	/**
	 * {@summary Facilitates the coordinates to a data point and prediction of orientation within the program}
	 * @param input
	 * @param classifier
	 * @return
	 */
	public static int coordinateController(String input, ClassifierNames classifier)
	{
		DataPoint dp = DataHandler.coordinatesToDataPoint(input);

		return learningModel.predictOrientation(dp, classifier);
		
	}
	
	/**
	 * {@summary Facilitates the creation of data sets based on the file name and classifier that it is provided}
	 * @param filename
	 * @param classifier
	 */
	public static void fileController(String filename, ClassifierNames classifier)
	{

		DataSet ds = DataHandler.fileToDataSet(filename);

		for (int i = 0; i < ds.points.size(); i++) {
			
			ds.points.elementAt(i).setOrientation(learningModel.predictOrientation(ds.points.elementAt(i), classifier));
			
		}
		
		DataHandler.dataSetToFile(ds, filename);
		
	}
	
	/**
	 * {@summary Facilitates the creation of data sets based on the file name that it is provided}
	 * @param filename
	 */
	public static void fileController(String filename)
	{

		DataSet ds = DataHandler.fileToDataSet(filename);

		learningModel.setTrainingData(ds);
		
	}
	
	
}
