/**
 * {@summary Class blueprint for a single data point}
 * 
 * @author Gavin Abeele
 * @author Brayden Bowler
 * @author Karl Stencell
 * @author Thomas Horvath 
 * 
 * @version 1.0
 * 
 */
public class DataPoint
{

	private double x;
	private double y;
	private double z;
	private int orientation = 0;

	DataPoint()
	{
	}

	public double getY()
	{
		return y;
	}

	public void setY(double y)
	{
		this.y = y;
	}

	public double getX()
	{
		return x;
	}

	public void setX(double x)
	{
		this.x = x;
	}

	public double getZ()
	{
		return z;
	}

	public void setZ(double z)
	{
		this.z = z;
	}

	public int getOrientation()
	{
		return orientation;
	}

	public void setOrientation(int orientation)
	{
		this.orientation = orientation;
	}

}
