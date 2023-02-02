package animal;


public abstract class Animal {
    public String name;
    public boolean health;

    public Animal() {
        health = Math.round(Math.random()) > 0;
    }

    public abstract String toString();

    public abstract void makeSound();
}