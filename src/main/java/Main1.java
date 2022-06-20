import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main1 {
    public static void main(String[] args) {
        File file = new File("Names.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (InputStream inputStream = new FileInputStream(file)) {
            byte[] array = new byte[8];
            int count = inputStream.read(array);
            StringBuilder result = new StringBuilder();
            while (count > 0) {
                result.append(new String(array, 0, count));
                count = inputStream.read(array);
            }
            System.out.println(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


