import java.io.*;
import java.util.Scanner;

public class DataHandler
{

	static DataSet fileToDataSet(String fileName)
	{

		DataSet fileDataSet = new DataSet();

		try
		{
			File file = new File(fileName);
			
			Scanner reader = new Scanner(file);

			while (reader.hasNextLine())
			{
				DataPoint point = new DataPoint();

				String data = reader.nextLine();
				point = coordinatesToDataPoint(data);

				fileDataSet.addPoint(point);
			}
			reader.close();

		} catch (Exception e)
		{
			System.out.println("Error reading Trained Data file.");
		}

		return fileDataSet;
	}
	
	static void dataSetToFile(DataSet ds, String fileName) 
	{
		
		try {
			FileWriter file = new FileWriter(fileName);
			
			for (int i=0; i < ds.points.size(); i++) {
				
				file.write(ds.points.elementAt(i).getX() + "," + ds.points.elementAt(i).getY() + "," + ds.points.elementAt(i).getZ() + ds.points.elementAt(i).getOrientation());
			}
			file.close();
		}
		catch(Exception e) {
			System.out.println("Error writing Data file.");
		}
		
	}

	static DataPoint coordinatesToDataPoint(String coordinates)
	{
		String[] strArr = coordinates.split(",");

		DataPoint point = new DataPoint();

		point.setX(Double.parseDouble(strArr[0]));
		point.setY(Double.parseDouble(strArr[1]));
		point.setZ(Double.parseDouble(strArr[2]));

		if (strArr.length == 4)
		{
			point.setOrientation(Integer.parseInt(strArr[3]));
		}

		return point;
	}
}
