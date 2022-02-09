import java.util.*;

/**
 * {@summary Class blueprint for a data set}
 * 
 * @author Gavin Abeele
 * @author Brayden Bowler
 * @author Karl Stencell
 * @author Thomas Horvath 
 * 
 * @version 1.0
 * 
 * 
 */
public class DataSet
{

	public Vector<DataPoint> points;

	/**
	 * Constructs the empty points 
	 */
	public DataSet()
	{
		this.points = new Vector<DataPoint>();
	}

	/**
	 * Adds a point to the data set
	 * @param point Single data point 
	 */
	public void addPoint(DataPoint point)
	{
		points.add(point);
	}

}
