package utils;

import animal.*;
import staff.Staff;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
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

    public static List<Animal> makeAnimalList(HashMap<Class<?>, List<String>> animalNamesMap, int order) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException{
        List<Animal> list = new ArrayList<>();
        Class<?> c =(Class<?>) animalNamesMap.keySet().toArray()[order];
        Constructor<?> constructor = c.getConstructor(String.class);
        for (int i = 0; i < animalNamesMap.get(c).size(); i++) {
            String name = animalNamesMap.get(c).get(i);
            list.add((Animal) constructor.newInstance(name));
        }
        return list;
    }
}