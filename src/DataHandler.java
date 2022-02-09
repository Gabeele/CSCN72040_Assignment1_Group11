import java.io.*;
import java.util.Scanner;
/**
 * {@summary Class provides static methods data handling such as IO converting, converting file to a data set, and writing a data set to a file }
 * 
 * @author Gavin Abeele
 * @author Brayden Bowler
 * @author Karl Stencell
 * @author Thomas Horvath 
 * 
 * @version 1.0
 * 
 */

public class DataHandler
{
	/**
	 * {@summary Takes a filename, opens the file and reads it and takes the formatted data within and creates a new data set based
	 * on the information within the file}
	 * @param fileName File name to open
	 * @return A compelete dataset to of the file
	 */
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
			System.out.println("Error reading file data.");
		}

		return fileDataSet;
	}
	
	/**
	 * {@summary Does the inverse of file to data set, where you give a file name to be written to and a source dataset that the data
	 *  is coming from}	
	 * @param ds Data set to write
	 * @param fileName The location of the dataset to write
	 */
	static void dataSetToFile(DataSet ds, String fileName) 
	{
		
		try {
			FileWriter file = new FileWriter(fileName);
			
			for (int i=0; i < ds.points.size(); i++) {
				
				file.write(ds.points.elementAt(i).getX() + "," + ds.points.elementAt(i).getY() + "," + ds.points.elementAt(i).getZ() + "," + ds.points.elementAt(i).getOrientation() + "\n");
			}
			file.close();
		}
		catch(Exception e) {
			System.out.println("Error writing Data file.");
		}
		
	}

	/**
	 * {@summary Takes a specifically formatted string and parses the information which is then used to create a new data point that is returned}
	 * @param coordinates A string of coordinates unparsed
	 * @return A single data point
	 */
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
