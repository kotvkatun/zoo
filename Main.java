import zoo.Zoo;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Zoo z = new Zoo();
        z.makeZoo();
        z.printCages();
    }
}