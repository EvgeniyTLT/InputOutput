import java.io.File;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        File directory = new File("folder");
        File file = new File(directory, "names.txt");
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a+b);
    }
}
