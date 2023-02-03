package zoo;

import animal.*;
import cage.Cage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Zoo {
    private final Random randomNumber = new Random();
    private final List<String> names = new ArrayList<>();
    private final int SPECIES = 5;
    private final int STAFF_ROLES = 4;
    private static final List<String> nameList = new ArrayList<>();
    private List<Cage> cages = new ArrayList<>();

    public Zoo() throws FileNotFoundException {
        File namesTXT = new File("resource/names.txt");
        Scanner fileScan = new Scanner(namesTXT);
        names.addAll(Arrays.asList(fileScan.nextLine().split(" ")));
        fileScan.close();
    }

    private String randomName() {
        int nameNum = randomNumber.nextInt(names.size());
        String randomName = names.get(nameNum);
        names.remove(nameNum);
        return randomName;
    }

    private List<Animal> makeAnimalList() {
        List<Animal> list = new ArrayList<>();
        int listLength = randomNumber.nextInt(4) + 1;
        switch (randomNumber.nextInt(5)) {
            case 0 -> {
                for (int i = 0; i <= listLength; i++) {
                    list.add(new Slon(randomName()));
                }
            }
            case 1 -> {
                for (int i = 0; i <= listLength; i++) {
                    list.add(new Shwainokaras(randomName()));
                }
            }
            case 2 -> {
                for (int i = 0; i <= listLength; i++) {
                    list.add(new Barash(randomName()));
                }
            }
            case 3 -> {
                for (int i = 0; i <= listLength; i++) {
                    list.add(new Manul(randomName()));
                }
            }
            case 4 -> {
                for (int i = 0; i <= listLength; i++) {
                    list.add(new Kaban(randomName()));
                }
            }
        }
        return list;
    }

    private Cage makeCage() {
        return new Cage(makeAnimalList());
    }

    public void makeZoo() {
        for (int i = 0; i < 5; i++) {
            cages.add(makeCage());
        }
    }

    public void printCages() {
        int i = 1;
        for (Cage c : cages) {
            System.out.println("Клетка номер " + i);
            for (Animal a : c.getAnimalNames()) {
                System.out.print(a.getName() + " " + a.getClass().toString() + " | ");
            }
            System.out.println();
            i++;
        }
    }
}
