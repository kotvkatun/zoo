package animal;

public class Manul extends Animal {
    public Manul(String nameOfManul) {
        super(nameOfManul);
    }

    public void makeSound() {
        System.out.println("Погладь кота, сука");
    }

    public String toString() {
        return "Manul{" +
                "name='" + getName() + '\'' + ", healthy=" + getHealth() +
                '}';
    }
}
