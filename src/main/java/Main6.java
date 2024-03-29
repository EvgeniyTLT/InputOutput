import java.io.File;
import java.io.RandomAccessFile;

public class Main6 {
    public static void main(String[] args) {
        File directory = new File("folder");
        File file = new File(directory, "names.txt");
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")) {
            randomAccessFile.seek(10);
            randomAccessFile.writeBytes("*****************************************");
            randomAccessFile.seek(5000);
            byte[] array = new byte[1024];
            randomAccessFile.read(array);
            System.out.println(new String(array));
            randomAccessFile.seek(5000);
            randomAccessFile.read(array);
            System.out.println(new String(array));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
