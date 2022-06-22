import java.io.File;
import java.io.RandomAccessFile;

public class Main6 {
    public static void main(String[] args) {
        File directory = new File("folder");
        File file = new File(directory, "names.txt");
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")) {
            randomAccessFile.seek(10);
            randomAccessFile.writeBytes("*****************************************");
            randomAccessFile.seek(1000);
            randomAccessFile.writeBytes("*****************************************");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
