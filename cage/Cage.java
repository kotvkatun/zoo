package cage;

import animal.*;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    public List<Animal> animalNames = new ArrayList<>();
    public boolean isClean;

    public Cage(List<Animal> animalList) {
        isClean = Math.round(Math.random()) > 0;
    }
}
