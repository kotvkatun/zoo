package staff;
import animal.Animal;
public class Govnochist extends Staff {
    private String name;
    private int id;
    private Animal caredFor;

    public Govnochist(String nameOfGovnochist, int idOfGovnochist, Animal animal) {
        name = nameOfGovnochist;
        id = idOfGovnochist;
        caredFor = animal;
    }

    public String getName() {
        return name;
    }

    public Animal getCaredFor() {
        return caredFor;
    }

    public int getId() {
        return id;
    }

    public void performCheckup() {

    }

}

