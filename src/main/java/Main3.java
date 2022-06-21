import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main3 {
    public static void main(String[] args) throws IOException {
        File directory = new File("folder");
        File file = new File(directory, "names.txt");

//        try (OutputStream outputStream = new FileOutputStream(file, true)) {
//            String names = "\nJohn Max Nick Thomas Andrew Roman Herbert Alex";
//            outputStream.write(names.getBytes());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(file))) {
            long before = System.currentTimeMillis();
            int a = inputStream.read();
            StringBuilder result = new StringBuilder();
            while (a != -1) {
                result.append((char) a);
                a = inputStream.read();
            }
            long after = System.currentTimeMillis();
            System.out.println(after - before);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
