import java.io.IOException;

/**
 * Main class to demonstrate the FileIO functionality.
 */
public class Main {
    public static void main(String[] args) {
        String filename = "example.txt";

        try {
            // Write to file
            System.out.println("Writing to file...");
            FileIO.writeToFile(filename, "Hello, world!");

            // Read from file
            System.out.println("Reading from file...");
            String content = FileIO.readFromFile(filename);
            System.out.println("File content: " + content);

            // Append to file
            System.out.println("Appending to file...");
            FileIO.appendToFile(filename, "\nThis is an appended line.");
            content = FileIO.readFromFile(filename);
            System.out.println("Updated file content: " + content);

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
