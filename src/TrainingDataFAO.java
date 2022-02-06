import java.io.*;
import java.util.*;

public class TrainingDataFAO extends TrainingData {

	private static String fileName = "trainingData.txt";
	
	public static TrainingData readData(Vector<TrainingData> td) {
		
		
		try {
			File trainFile = new File(fileName);
			
			Scanner reader = new Scanner(fileName);
			
			
			
			while(reader.hasNextLine()) {
				double x, y, z;
				int orientation;
				
				String data = reader.nextLine();
				
				 String[] parseData = data.split(",");
				 
				 
				 
				 x = Double.parseDouble(parseData[0]);
				 y = Double.parseDouble(parseData[1]);
				 z = Double.parseDouble(parseData[2]);
				 orientation = Integer.parseInt(parseData[3]);
				
			}
			
		}
		
		
		
		return td;

	}
	
	
}
