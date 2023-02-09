package utils;

import java.util.List;
import java.util.Random;

public class RandomName {
    private final static Random randomNumber = new Random();
    public static String randomName (List<String> stringList){
        int nameNum = randomNumber.nextInt(stringList.size());
        String randomName = stringList.get(nameNum);
        stringList.remove(nameNum);
        return randomName;
    }
}
