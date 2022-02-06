
public class DataPoint {

	private double x;
	private double y;
	private double z;
	private int orientation;
	
	public enum Orientation {ERROR, FACE_UP, FACE_DOWN, PORTRAIT, PORTRAIT_UPSIDEDOWN, LANDSCAPE_LEFT, LANDSCAPE_RIGHT}

	DataPoint(){
	}
	
	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public int getOrientation() {
		return orientation;
	}

	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}
	
	
	
	
}
