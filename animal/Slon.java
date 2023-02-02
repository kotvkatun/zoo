package animal;

public class Slon extends Animal {

    public Slon(String nameOfSlon, boolean isHealthy) {
        name = nameOfSlon;
        health = isHealthy;
    }

    public String getNameOfSlon() {
        return name;
    }

    public void makeSound() {
        System.out.println("Давай родненький");
    }

    public String toString() {
        return "Slon{" +
                "name='" + name + '\'' + ", healthy=" + health +
                '}';
    }
}