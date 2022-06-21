import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class Main3 {
    public static void main(String[] args) throws IOException {
        File directory = new File("folder");
        File file = new File(directory, "names.txt");
        directory.mkdir();
        file.createNewFile();
        try (OutputStream outputStream = new FileOutputStream(file)) {
            String names = "John Max Nick Thomas Andrew Roman Herbert Alex";
            outputStream.write(names.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
