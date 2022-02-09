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
	
	public int predictOrientation(DataPoint dataPoint, ClassifierNames classifier) {
		
		int closestIndex = -1;
		
		if (classifier == ClassifierNames.NEAREST_NEIGHBORS) {
			closestIndex = NearestNeighbor.Calculate(dataPoint, trainingDataSet);
		}
		else if (classifier == ClassifierNames.ANOTHER_CLASSIFIER) {
			closestIndex = AnotherClassifier.Calculate(dataPoint, trainingDataSet);
		}
		
		return trainingDataSet.points.elementAt(closestIndex).getOrientation();
	}
	
	public void setTrainingData(DataSet dataSet) {
		trainingDataSet = dataSet;
	}
	
	
}
