package animal;


public abstract class Animal {
    int quantity = 1;

    public Animal() {
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract String toString();

    public abstract void makeSound();
}