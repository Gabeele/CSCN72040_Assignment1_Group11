import java.util.*;

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
