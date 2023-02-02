import animal.*;
import cage.Cage;
import staff.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Slon s = new Slon("Васёк");
        Shwainokaras shwainokaras = new Shwainokaras("Швайнокарась");
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(s);
        animalList.add(shwainokaras);
        Cage c = new Cage(animalList);
        Govnochist Gena = new Govnochist("Gena", c);
        Govnochist Sleh = new Govnochist("Sleh", c);
        Veterinar Lesha = new Veterinar("Леша", animalList);
        Lesha.performCheckup("Васёк");
    }
}