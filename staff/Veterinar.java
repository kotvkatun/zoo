package staff;

import animal.Animal;

import java.util.List;

public class Veterinar extends Staff {
    private List<Animal> patients;

    public Veterinar(String nameOfVeterinar, List<Animal> patientsOfVeterinar) {
        setName(nameOfVeterinar);
        patients = patientsOfVeterinar;
    }
    public void performCheckup(String... patientName) {
        for (Animal animal : patients){
            for (String name : patientName){
                if (name.equals(animal.getName())){
                    if(animal.getHealth()){
                        System.out.println(name + " здоров");
                    } else {
                        System.out.println(name + " болен");
                    }
                    break;
                }
            }
        }
    }


}
