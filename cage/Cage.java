package cage;

import animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    private List<Animal> animalNames = new ArrayList<>();
    private boolean isClean;

    public Cage(List<Animal> animalList) {
        isClean = Math.round(Math.random()) > 0;
        animalNames = animalList;
    }

    public List<Animal> getAnimalNames() {
        return animalNames;
    }

    public boolean getIsClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }
}
