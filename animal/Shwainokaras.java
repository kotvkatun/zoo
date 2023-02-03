package animal;

public class Shwainokaras extends Animal {


    public Shwainokaras(String nameOfShwainokaras) {
        super(nameOfShwainokaras);
    }

    public String toString() {
        return "Shwainokaras{" +
                "name=" + getName() +
                ", healthy=" + getHealth() +
                '}';
    }

    public void makeSound() {
        System.out.println("Рыба не издает звуков, дурак");
    }

}
