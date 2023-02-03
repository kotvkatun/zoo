package animal;

public class Kaban extends Animal {
    public Kaban(String nameOfKaban) {
        super(nameOfKaban);
    }

    public void makeSound() {
        System.out.println("Купи хитман 3 плз");
    }

    public String toString() {
        return "Kaban{" +
                "name='" + getName() + '\'' + ", healthy=" + getHealth() +
                '}';
    }
}
