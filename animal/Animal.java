package animal;


public abstract class Animal {
    public String name;
    public boolean health;

    public Animal() {
    }

    public abstract String toString();

    public abstract void makeSound();
}