/**
 * {@summary Class blueprint for a machine learning object and functions.}
 * 
 * @author Gavin Abeele
 * @author Brayden Bowler
 * @author Karl Stencell
 * @author Thomas Horvath 
 * 
 * @version 1.0
 * 
 */
public class MachineLearning 
{

	protected DataSet trainingDataSet;
	
	/**
	 * Method to predict the orientation of a single data point using a specified classifier
	 * @param Data Point A single data point to determine the orientation
	 * @param Classifier The ML classifier to use
	 * @return The orientation of the best matched object
	 */
	public int predictOrientation(DataPoint dataPoint, ClassifierNames classifier) {
		
		int closestIndex = -1;		
		
		if (classifier == ClassifierNames.NEAREST_NEIGHBORS) {
			closestIndex = NearestNeighbor.Calculate(dataPoint, trainingDataSet);
		}
		else if (classifier == ClassifierNames.ANOTHER_CLASSIFIER) {
			closestIndex = AnotherClassifier.Calculate(dataPoint, trainingDataSet);
		}
		
		return trainingDataSet.points.elementAt(closestIndex).getOrientation();		//Returns the orientation of the best matched 
	}
	
	/**
	 * Sets the training data set of ML
	 * @param dataSet The trained data
	 */
	public void setTrainingData(DataSet dataSet) {
		trainingDataSet = dataSet;
	}
	
	
}
