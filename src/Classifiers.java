import java.util.*;

public abstract class Classifiers extends MachineLearning
{

	abstract boolean PredictPoint(DataPoint dataPoint);

	abstract double distanceBetweenDataPoints(DataPoint predictingPoint, DataPoint testPoint);
}
