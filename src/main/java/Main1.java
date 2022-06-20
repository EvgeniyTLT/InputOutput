import java.io.*;

public class Main1 {
    public static void main(String[] args) {
        File file = new File("Names.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (Reader reader = new InputStreamReader(new FileInputStream(file))) {

            int a = reader.read();
            StringBuilder result = new StringBuilder();
            while (a > 0) {
                result.append((char) a);
                a = reader.read();
            }
            System.out.println(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}


