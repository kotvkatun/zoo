package staff;

import animal.Animal;

import java.util.List;

public class Veterinar extends Staff{
    private List<Animal> patients;
    public Veterinar (String nameOfVeterinar, int idOfVeterinar, List<Animal> patientsOfVeterinar) {
        name = nameOfVeterinar;
        id = idOfVeterinar;
        patients = patientsOfVeterinar;
    }
    public void performCheckup() {
    }


}
