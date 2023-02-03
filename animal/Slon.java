package animal;

public class Slon extends Animal {

    public Slon(String nameOfSlon) {
        super(nameOfSlon);
    }

    public void makeSound() {
        System.out.println("Давай родненький");
    }

    public String toString() {
        return "Slon{" +
                "name='" + getName() + '\'' + ", healthy=" + getHealth() +
                '}';
    }
}