import java.io.Serializable;

public class Cat implements Serializable {
    private String nickname;
    private String breed;
    private int weight;

    public Cat(String nickname, String breed, int weight) {
        this.nickname = nickname;
        this.breed = breed;
        this.weight = weight;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "nickname='" + nickname + '\'' +
                ", breed='" + breed + '\'' +
                ", weight=" + weight +
                '}';
    }
}
