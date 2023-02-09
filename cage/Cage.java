package cage;

import animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    private List<Animal> animalList = new ArrayList<>();
    private boolean isClean;

    public Cage(List<Animal> animalList) {
        isClean = Math.round(Math.random()) > 0;
        this.animalList = animalList;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public boolean getIsClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }
}
