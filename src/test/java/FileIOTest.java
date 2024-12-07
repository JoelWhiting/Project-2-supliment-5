import org.junit.jupiter.api.*;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Unit tests for FileIO class.
 */
public class FileIOTest {
    private final String testFile = "testfile.txt";

    @AfterEach
    public void cleanUp() throws IOException {
        Files.deleteIfExists(Path.of(testFile));
    }

    @Test
    public void testWriteToFile() throws IOException {
        FileIO.writeToFile(testFile, "Hello, world!");
        String content = Files.readString(Path.of(testFile));
        assertEquals("Hello, world!", content);
    }

    @Test
    public void testReadFromFile() throws IOException {
        Files.writeString(Path.of(testFile), "Test content");
        String content = FileIO.readFromFile(testFile);
        assertEquals("Test content", content);
    }

    @Test
    public void testAppendToFile() throws IOException {
        FileIO.writeToFile(testFile, "Line 1\n");
        FileIO.appendToFile(testFile, "Line 2\n");
        String content = Files.readString(Path.of(testFile));
        assertEquals("Line 1\nLine 2\n", content);
    }
}
