package utils;

import zoo.Zoo;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static utils.AnimalListMaker.makeAnimalListSkeleton;
import static utils.AnimalListMaker.makeStaffListSkeleton;
import static utils.RandomName.randomName;

public class NameParser {
    private static final HashMap<Class<?>, Integer> animalListSkeleton = makeAnimalListSkeleton(Zoo.getAnimalClasses());
    private static final HashMap<Class<?>, Integer> staffListSkeleton = makeStaffListSkeleton(Zoo.getStaffClasses());

    public static HashMap<Class<?>, List<String>> loadNames(String animal_or_staff) {
        if (animal_or_staff.startsWith("a")) {
            return makeNameMap("animal_names", animalListSkeleton);
        } else if (animal_or_staff.startsWith("s")) {
            return makeNameMap("staff_names", staffListSkeleton);
        }
        return null;
    }

    private static void cache(String filename) throws IOException {
        File allNames = new File("resource/" + filename + ".txt");
        BufferedReader reader = new BufferedReader(new FileReader(allNames));
        File cache = new File("cache/" + filename + "_cache.txt");
        if (cache.createNewFile()) {
            BufferedWriter bufferedWriterA = new BufferedWriter(new FileWriter(cache));
            List<String> allNamesList = parseTXT(reader);
            for (Class<?> c : animalListSkeleton.keySet()) {
                for (int l = 0; l < animalListSkeleton.get(c); l++) {
                    bufferedWriterA.write(randomName(allNamesList));
                    bufferedWriterA.write(" ");
                }
                bufferedWriterA.newLine();
            }
            bufferedWriterA.close();
        }
    }

    private static HashMap<Class<?>, List<String>> makeNameMap(String filename, HashMap<Class<?>, Integer> skeleton) {
        HashMap<Class<?>, List<String>> output = new HashMap<>();
        skeletonizeHashMap(output, skeleton);
        try {
            cache(filename);
        } catch (IOException e) {
            System.out.println("IO exception on " + filename + " LOLE");
        }
        try {
            BufferedReader fileOutput = new BufferedReader(new FileReader("cache/" + filename + "_cache.txt"));
            for (Class<?> c : output.keySet()) {
                output.put(c, parseTXT(fileOutput));
            }
            fileOutput.close();
            return output;
        } catch (IOException e) {
            System.out.println("File not found:" + filename + "_cache");
        }
        return null;
    }

    private static void skeletonizeHashMap(HashMap<Class<?>, List<String>> stringListHashMap, HashMap<Class<?>, Integer> skeleton) {
        for (Class<?> c : skeleton.keySet()) {
            stringListHashMap.put(c, null);
        }
    }

    private static List<String> parseTXT(BufferedReader textScan) throws IOException {
        return new ArrayList<>(Arrays.asList(textScan.readLine().split(" ")));
    }
}
