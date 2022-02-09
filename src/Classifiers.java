/**
 * {@summary Class provides static methods outline for classifiers}
 * 
 * @author Gavin Abeele
 * @author Brayden Bowler
 * @author Karl Stencell
 * @author Thomas Horvath 
 * 
 * @version 1.0
 * 
 */
public class Classifiers
{
	/**
	 * {@summary Method for other classes to implement and override so that the calculate function can change depending
	 * on the algorithm that is being used}
	 * @param dataPoint A single point to be referenced by 
	 * @param trainingDataSet The set of data to compare to 
	 * @return An integer 
	 */
	public static int Calculate(DataPoint dataPoint, DataSet trainingDataSet) {
		throw new IllegalArgumentException("Unexpected value");
	}

	/**
	 * {@summary Method for other classes to implement and override so that the distanceBetweenDataPoints function can change depending
	 * on the algorithm that is being used}
	 * @param predictingPoint a single predicted point 
	 * @param testPoint A compared predicted point 
	 * @return
	 */
	protected static double distanceBetweenDataPoints(DataPoint predictingPoint, DataPoint testPoint) {
		throw new IllegalArgumentException("Unexpected value");
	}
}
