import java.io.*;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        File directory = new File("folder");
        File file = new File(directory, "names.txt");
        Scanner scanner = new Scanner(System.in);
        String stop = "B";
        String result = "";
        while (stop.equals("B")) {
            System.out.println("enter name: ");
            String name = scanner.nextLine();
            if (name.equals("exit")) {
                stop = "a";
                try (InputStream inputStream = new BufferedInputStream(new FileInputStream(file))) {
                    int a = inputStream.read();
                    StringBuilder result1 = new StringBuilder();
                    while (a != -1) {
                        result1.append((char) a);
                        a = inputStream.read();
                    }
                    System.out.println(result1.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                try (OutputStream outputStream = new FileOutputStream(file, true)) {
                    String names = name + " ";
                    outputStream.write(names.getBytes());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
