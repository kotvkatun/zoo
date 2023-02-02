package animal;

public class Shwainokaras extends Animal {


    public Shwainokaras(String nameOfShwainokaras) {
        name = nameOfShwainokaras;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Shwainokaras{" +
                "name=" + name +
                ", healthy=" + health +
                '}';
    }

    public void makeSound() {
        System.out.println("Рыба не издает звуков, дурак");
    }

}
