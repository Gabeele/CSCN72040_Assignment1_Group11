import java.util.*;

public abstract class Classifiers
{

	public abstract int Calculate(DataPoint dataPoint, DataSet trainingDataSet);

	protected abstract double distanceBetweenDataPoints(DataPoint predictingPoint, DataPoint testPoint);
}
