import java.io.File;
import java.util.*;

public class TrainingData extends DataPoint{

	public Vector<DataPoint> trainedData = new Vector<DataPoint>();
	
	private String fileName = "trainingData.txt";
	
	public void readData() {
		
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
				 point.setOrientation(Integer.parseInt(parseData[3]));
			
				 trainedData.add(point);
				 
			}
			
		}catch(Exception e) {
			System.out.println("Error reading Trained Data file.");
		}

	}
	
	
	
}
