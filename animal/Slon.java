package animal;

public class Slon extends Animal {

    public Slon(String nameOfSlon) {
        name = nameOfSlon;
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