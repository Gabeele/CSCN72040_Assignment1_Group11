
public class MachineLearning
{

	protected DataSet trainingDataSet;
	
	int predictOrientation(DataPoint dataPoint, ClassifierNames classifier) {
		
		int orientation = -1;
		
		if (classifier == ClassifierNames.NEAREST_NEIGHBORS) {
			orientation = NearestNeighbor.Calculate(dataPoint, trainingDataSet);
		}
		
		return orientation;
	}
}
