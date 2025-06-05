import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        // Define the file name
        String fileName = "output.txt";
        
        // Content to write in the file
        String content = "Hello, this is a sample text written using FileWriter in Java.\n"
                       + "File handling is an important concept in Java.\n"
                       + "This file is successfully written!";
        
        try {
            // Create a FileWriter object
            FileWriter writer = new FileWriter(fileName);

            // Write content to the file
            writer.write(content);

            // Close the writer to save changes
            writer.close();

            System.out.println("File written successfully: " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
            e.printStackTrace();
        }
    }
}
