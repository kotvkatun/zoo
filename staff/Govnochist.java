package staff;

import cage.Cage;

import java.util.Scanner;

public class Govnochist extends Staff {
    private Cage assignedCage;

    public Govnochist(String nameOfGovnochist, Cage cage) {
        setName(nameOfGovnochist);
        assignId();
        assignedCage = cage;
    }

    public Cage getAssignedCage() {
        return assignedCage;
    }

    public void performCheckup(String... strings) {
        if (this.assignedCage.getIsClean()) {
            System.out.println("Клетка чистая");
        } else {
            System.out.println("Клетка грязная");
            System.out.println("Почистить клетку? (y/n)");
            Scanner input = new Scanner(System.in);
            String yesOrNo = input.nextLine();
            if (yesOrNo.startsWith("y")) {
                assignedCage.setClean(true);
                System.out.println("Клетка почищена");
            }
        }
    }

}

