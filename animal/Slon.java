package animal;

public class Slon extends Animal {
    private String nameOfSlon;
    private boolean health;

    public Slon(String name, boolean isHealthy) {
        nameOfSlon = name;
        health = isHealthy;
    }

    public String getNameOfSlon() {
        return nameOfSlon;
    }

    public void makeSound() {
        System.out.println("Давай родненький");
    }

    public String toString() {
        return "Slon{" +
                "nameOfSlon='" + nameOfSlon + '\'' +
                '}';
    }
}