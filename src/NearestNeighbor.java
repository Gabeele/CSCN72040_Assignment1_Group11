import java.lang.Math;

/**
 * {@summary Class provides static methods for nearest neighbor ML algorithm}
 * 
 * @author Gavin Abeele
 * @author Brayden Bowler
 * @author Karl Stencell
 * @author Thomas Horvath 
 * 
 * @version 1.0
 * 
 */

public class NearestNeighbor extends Classifiers
{
	
	/**
	 * 
	 * @param dataPoint The DataPoint of which to be calculated
	 * @param trainingDataSet The set of training data for ML
	 * @return The index of the closest data point
	 */
	public static int Calculate(DataPoint dataPoint, DataSet trainingDataSet)
	{
		
		double closestDistance = Double.POSITIVE_INFINITY, currDistance = Double.POSITIVE_INFINITY;	
		int indexClosest = -1;

		for (int i = 0; i < trainingDataSet.points.size(); i++)			//Loops through the training set to determine the closest point
		{

			currDistance = distanceBetweenDataPoints(dataPoint, trainingDataSet.points.elementAt(i));
			if (currDistance < closestDistance)
			{
				closestDistance = currDistance;
				indexClosest = i;
			}

		}

		return indexClosest;

	}

	/**
	 * 
	 * @param predictingPoint The point of the given value
	 * @param testPoint The point of the trained data
	 * @return The distance between the two points
	 */
	protected static double distanceBetweenDataPoints(DataPoint predictingPoint, DataPoint testPoint)
	{

		// Formula of distance between two points sqrt((x2 - x1)^2 + (y2 - y1)^2 + (z2 - z1)^2)

		double xDistance = Math.pow(predictingPoint.getX() - testPoint.getX(), 2);
		double yDistance = Math.pow(predictingPoint.getY() - testPoint.getY(), 2);
		double zDistance = Math.pow(predictingPoint.getZ() - testPoint.getZ(), 2);

		return Math.sqrt(xDistance + yDistance + zDistance);

	}

}
