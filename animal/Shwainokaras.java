package animal;

public class Shwainokaras extends Animal {


    public Shwainokaras(String nameOfShawainokaras, boolean isHealthy) {
        health = isHealthy;
        name = nameOfShawainokaras;
    }

    public String getName() {
        return super.getName();
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
