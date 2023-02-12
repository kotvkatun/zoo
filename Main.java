import animal.Animal;
import staff.Staff;
import staff.Veterinar;
import zoo.Zoo;

import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        Zoo z = new Zoo();
        z.makeZoo();
        z.printCages();
    }
}