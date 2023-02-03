package animal;

public class Barash extends Animal {
    public Barash(String nameOfBarash) {
        super(nameOfBarash);
    }

    public void makeSound() {
        System.out.println("Бээ");
    }

    public String toString() {
        return "Barash{" +
                "name='" + getName() + '\'' + ", healthy=" + getHealth() +
                '}';
    }
}
