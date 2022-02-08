
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
