package NewProj;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreate {
	 public static void main(String[] args) {
	        // Specify the file's name
	        File file = new File("example.txt");

	        try (FileWriter writer = new FileWriter(file)) {
	            // Write content to the file
	            writer.write("Hello, World!");
	            System.out.println("File created successfully.");
	        } catch (IOException e) {
	           
	            e.printStackTrace();
	        }
	    }

}
