package zoo;

import animal.*;
import cage.Cage;
import staff.*;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import static utils.AnimalListMaker.makeAnimalList;
import static utils.NameParser.loadNames;

public class Zoo {
    private final static List<Class<? extends Animal>> animalClasses = new ArrayList<>(List.of(Kaban.class, Manul.class, Shwainokaras.class, Slon.class, Barash.class));
    private final static List<Class<? extends Staff>> staffClasses = new ArrayList<>(List.of(Govnochist.class, TicketOffice.class, Veterinar.class, Security.class));
    private final Random randomNumber = new Random();
    private HashMap<Class<?>, List<String>> animalNames;
    private HashMap<Class<?>, List<String>> staffNames = new HashMap<>();

    private final int STAFF_ROLES = 4;
    private static final List<String> nameList = new ArrayList<>();
    private List<Cage> cages = new ArrayList<>();

    public static List<Class<? extends Animal>> getAnimalClasses() {
        return animalClasses;
    }

    public static List<Class<? extends Staff>> getStaffClasses() {
        return staffClasses;
    }

    public Zoo() {
        animalNames = loadNames(Entity.ANIMAL);
        staffNames = loadNames(Entity.STAFF);
    }


    private Cage makeCage(int order) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        return new Cage(makeAnimalList(animalNames, order));
    }

    public void makeZoo() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        for (int i = 0; i < 5; i++) {
            cages.add(makeCage(i));
        }
    }

    public void printCages() {
        int i = 1;
        for (Cage cage : cages) {
            System.out.println("Клетка номер " + i);
            for (Animal animal : cage.getAnimalList()) {
                System.out.print(animal.getName() + " " + animal.getClass().toString() + " | ");
            }
            System.out.println();
            i++;
        }
    }
}
