import java.lang.Math;

public class NearestNeighbor extends Classifiers {
	
	boolean PredictDataSet () {
		
		for (int i=0; i < unknownData.dataSet.size(); i++) {
			PredictPoint(unknownData.dataSet.elementAt(i));
		}
		
		return true;
	}

	boolean PredictPoint (DataPoint dataPoint) {
				
		double closestDistance =  Double.POSITIVE_INFINITY, currDistance = Double.POSITIVE_INFINITY;
		int indexClosest = -1;
		
		for (int i = 0; i < td.dataSet.size(); i++) {
	
			currDistance = distanceBetweenDataPoints(dataPoint, td.dataSet.elementAt(i));
			if (currDistance < closestDistance) {
				closestDistance = currDistance;
				indexClosest = i;
			}
			
		}
		
		dataPoint.setOrientation(td.dataSet.elementAt(indexClosest).getOrientation());
		
		return false;
		
	}
	
	double distanceBetweenDataPoints(DataPoint predictingPoint, DataPoint testPoint) {
		
		// sqrt((x2 - x1)^2 + (y2 - y1)^2 + (z2 - z1)^2)
		
		double xDistance = Math.pow(predictingPoint.getX() - testPoint.getX(), 2);
		double yDistance = Math.pow(predictingPoint.getY() - testPoint.getY(), 2);
		double zDistance = Math.pow(predictingPoint.getZ() - testPoint.getZ(), 2);
		
		return Math.sqrt(xDistance + yDistance + zDistance);
			
	}
	
	
	
}
