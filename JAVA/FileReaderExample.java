import java.io.*;

public class FileReaderExample {
    public static void main(String[] args) {
        // Define the file name
        String fileName = "output.txt"; // Ensure this file exists before running

        try {
            // Create FileReader and BufferedReader objects
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            System.out.println("Reading file: " + fileName);
            System.out.println("-----------------------------------");

            // Read file line by line
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Close resources
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading the file.");
            e.printStackTrace();
        }
    }
}
