import java.io.File;
import java.util.*;

public class DataSet extends DataPoint{

	public Vector<DataPoint> dataSet = new Vector<DataPoint>();
	
	public void readData(String fileName) {
		
		try {
			File trainFile = new File(fileName);
			
			Scanner reader = new Scanner(fileName);
			
			while(reader.hasNextLine()) {
				DataPoint point = new DataPoint();
				
				String data = reader.nextLine();
				
				 String[] parseData = data.split(",");
				 
				 point.setX(Double.parseDouble(parseData[0]));
				 point.setY(Double.parseDouble(parseData[1]));
				 point.setZ(Double.parseDouble(parseData[2]));
				 
				 if (parseData.length == 4) {
					 point.setOrientation(Integer.parseInt(parseData[3]));
				 }
			
				 dataSet.add(point);
				 
			}
			
		}catch(Exception e) {
			System.out.println("Error reading Trained Data file.");
		}

	}
	
	
	
}
