import java.io.File;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        File directory = new File("folder");
        File file = new File(directory, "names.txt");
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw")) {
            byte[] pageText = new byte[3000];
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter next page or \"stop\" to exit: ");
            String input = scanner.nextLine();
            while (!input.equals("stop")) {
                int page = Integer.parseInt(input);
                randomAccessFile.seek(pageText.length * (page - 1));
                int count = randomAccessFile.read(pageText);
                System.out.println(new String(pageText, 0, count));
                System.out.println("Enter next page or \"stop\" to exit: ");
                input = scanner.nextLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
