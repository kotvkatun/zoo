package utils;

import animal.*;
import staff.Staff;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import static utils.RandomName.randomName;

public class AnimalListMaker {
    private final static Random randomNumber = new Random();
    private final static int SPECIES = 5;

    private static int randomCageSize() {
        return randomNumber.nextInt(1, 5);
    }

    public static HashMap<Class<?>, Integer> makeAnimalListSkeleton(List<Class<? extends Animal>> classList) {
        HashMap<Class<?>, Integer> animalListSkeleton = new HashMap<>();
        for (Class<?> c : classList) {
            animalListSkeleton.put(c, randomCageSize());
        }
        return animalListSkeleton;
    }

    public static HashMap<Class<?>, Integer> makeStaffListSkeleton(List<Class<? extends Staff>> classList) {
        HashMap<Class<?>, Integer> staffListSkeleton = new HashMap<>();
        for (Class<?> c : classList) {
            staffListSkeleton.put(c, randomNumber.nextInt(1, 3));
        }
        return staffListSkeleton;
    }

    public static List<Animal> makeAnimalList(HashMap<Class<?>, List<String>> animalNames) {
        List<Animal> list = new ArrayList<>();
        int listLength = 4;
        switch (randomNumber.nextInt(SPECIES)) {
            case 0 -> {
                for (int i = 0; i < listLength; i++) {
                    list.add(new Slon(randomName(animalNames)));
                }
            }
            case 1 -> {
                for (int i = 0; i < listLength; i++) {
                    list.add(new Shwainokaras(randomName(animalNames)));
                }
            }
            case 2 -> {
                for (int i = 0; i < listLength; i++) {
                    list.add(new Barash(randomName(animalNames)));
                }
            }
            case 3 -> {
                for (int i = 0; i < listLength; i++) {
                    list.add(new Manul(randomName(animalNames)));
                }
            }
            case 4 -> {
                for (int i = 0; i < listLength; i++) {
                    list.add(new Kaban(randomName(animalNames)));
                }
            }
        }
        return list;
    }
}