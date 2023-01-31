package staff;
import animal.Animal;
import cage.Cage;

public class Govnochist extends Staff {
    private Cage assignedCage;
    public Govnochist(String nameOfGovnochist, Cage cage) {
        name = nameOfGovnochist;
        assignId();
        assignedCage = cage;
    }
    public String getName() {
        return name;
    }

    public void performCheckup() {

    }

}

