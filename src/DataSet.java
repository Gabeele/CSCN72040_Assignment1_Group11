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

	public DataSet()
	{
		this.points = new Vector<DataPoint>();
	}

	public void addPoint(DataPoint point)
	{
		points.add(point);
	}

}
