import animal.*;
import cage.Cage;
import staff.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Slon s = new Slon("Васёк", true);
        Shwainokaras shwainokaras = new Shwainokaras("Швайнокарась", false);
        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(s);
        animalList.add(shwainokaras);
        Cage c = new Cage(animalList);
        Govnochist Gena = new Govnochist("Gena", c);
        Govnochist Sleh = new Govnochist("Sleh", c);
        Staff.printStaffList();
        System.out.println(Gena.getId());
    }
}