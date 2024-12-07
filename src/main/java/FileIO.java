import java.io.*;
import java.nio.file.*;

/**
 * FileIO class provides methods to handle file input and output operations.
 */
public class FileIO {

    /**
     * Writes the given content to a file.
     *
     * @param filename the name of the file
     * @param content  the content to write
     * @throws IOException if an I/O error occurs
     */
    public static void writeToFile(String filename, String content) throws IOException {
        Files.writeString(Path.of(filename), content, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }

    /**
     * Reads and returns the content of a file as a string.
     *
     * @param filename the name of the file
     * @return the content of the file
     * @throws IOException if an I/O error occurs
     */
    public static String readFromFile(String filename) throws IOException {
        return Files.readString(Path.of(filename));
    }

    /**
     * Appends the given content to a file.
     *
     * @param filename the name of the file
     * @param content  the content to append
     * @throws IOException if an I/O error occurs
     */
    public static void appendToFile(String filename, String content) throws IOException {
        Files.writeString(Path.of(filename), content, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
    }
}
