package animal;


public abstract class Animal {
    private String name;
    private boolean health;

    public Animal() {
        health = Math.round(Math.random()) > 0;
    }

    public String getName() {
        return name;
    }
    public boolean getHealth() {
        return health;
    }
    public void setName(String name) {
        this.name = name;
    }

    public abstract String toString();

    public abstract void makeSound();
}