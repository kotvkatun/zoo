import animal.*;
import staff.*;
public class Main {
    public static void main(String[] args) {
        Slon s = new Slon("Васёк", true);
        Govnochist Sleh = new Govnochist("Слех", 1, s);
        s.makeSound();
        System.out.println(s.getNameOfSlon());
        Shwainokaras shwainokaras = new Shwainokaras("Швайнокарась", false);
        Govnochist Gena = new Govnochist("Гена", 2, shwainokaras);
        System.out.println(shwainokaras.toString());
        System.out.println(s.toString());
    }
}