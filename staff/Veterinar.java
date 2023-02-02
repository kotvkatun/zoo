package staff;

import animal.Animal;

import java.util.List;

public class Veterinar extends Staff {
    private List<Animal> patients;

    public Veterinar(String nameOfVeterinar, List<Animal> patientsOfVeterinar) {
        name = nameOfVeterinar;
        patients = patientsOfVeterinar;
    }

    public void performCheckup() {
    }


}
