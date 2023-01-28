package animal;

public class Shwainokaras extends Animal {
    private int q;
    private boolean healthy;

    public Shwainokaras(boolean isHealthy, int quantity) {
        healthy = isHealthy;
        q = quantity;
    }

    public int getQuantity() {
        return q;
    }

    public String toString() {
        return "Shwainokaras{" +
                "q=" + q +
                ", healthy=" + healthy +
                '}';
    }

    public void makeSound() {
        System.out.println("Рыба не издает звуков, дурак");
    }

}
