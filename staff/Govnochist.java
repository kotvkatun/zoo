package staff;
import animal.Animal;
import cage.Cage;

public class Govnochist extends Staff {
    private Cage assignedCage;
    public Govnochist(String nameOfGovnochist, int idOfGovnochist, Cage cage) {
        name = nameOfGovnochist;
        id = idOfGovnochist;
        assignedCage = cage;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void performCheckup() {

    }

}

