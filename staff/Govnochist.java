package staff;

import animal.Animal;
import cage.Cage;

import java.util.Scanner;

public class Govnochist extends Staff {
    public Cage assignedCage;

    public Govnochist(String nameOfGovnochist, Cage cage) {
        name = nameOfGovnochist;
        assignId();
        assignedCage = cage;
    }

    public void performCheckup(String... strings) {
        if (this.assignedCage.isClean) {
            System.out.println("Клетка чистая");
        } else {
            System.out.println("Клетка грязная");
            System.out.println("Почистить клетку? (y/n)");
            Scanner input = new Scanner(System.in);
            String yesOrNo = input.nextLine();
            if (yesOrNo.startsWith("y")) {
                assignedCage.isClean = true;
                System.out.println("Клетка почищена");
            }
        }
    }

}

