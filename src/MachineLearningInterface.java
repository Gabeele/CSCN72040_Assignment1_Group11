
public interface MachineLearningInterface
{
	public int predictOrientation(DataPoint dataPoint, ClassifierNames classifier);
	public void setTrainingData(DataSet dataSet);
}
