package Java_File_Handing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Creating_file_in_java {
	public static void main(String[] args) {
		
		File file = new File("D:\\my_hashtags_data\\page1.html"); // initialize File object and passing path as argument
		boolean result;
		try {
			result = file.createNewFile(); // creates a new file
			if (result) // test if successfully created a new file
			{
				FileWriter myWriter = new FileWriter(file);
			    myWriter.write("Files in Java might be tricky, but it is fun enough!");
			    myWriter.close();
			    
				System.out.println("file created " + file.getCanonicalPath()); // returns the path string
			} else {
				System.out.println("File already exist at location: " + file.getCanonicalPath());
			}
		} catch (IOException e) {
			e.printStackTrace(); // prints exception if any
		}
		
	}
}