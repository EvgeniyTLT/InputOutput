import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main9 {
    public static void main(String[] args) {

        File collectionCats = new File("collectionCats.txt");
        List<Cat> cats = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cats.add(new Cat("Cat" + i, "Pers" + i, i));
        }
        try {
            collectionCats.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(collectionCats))) {
            objectOutputStream.writeObject(collectionCats);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(collectionCats))) {
            List<Cat> savedCat = (List<Cat>) objectInputStream.readObject();
            for (Cat u : savedCat
            ) {
                System.out.println(u.getNickname());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
