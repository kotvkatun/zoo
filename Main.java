import animal.*;
import staff.*;
public class Main {
    public static void main(String[] args) {
        Slon s = new Slon("Васёк", true);
        s.makeSound();
        System.out.println(s.getNameOfSlon());
        Shwainokaras shwainokaras = new Shwainokaras("Швайнокарась", false);
        System.out.println(shwainokaras.toString());
        System.out.println(s.toString());
    }
}