import java.io.*;

public class Main8 {
    public static void main(String[] args) {
        File file = new File("users.urs");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        User user = new User("John", "Smith", 25, new Address("Main", 10));
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            User savedUser = (User) objectInputStream.readObject();
            System.out.println(savedUser);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
