package staff;

import java.util.HashMap;

public abstract class Staff {
    public String name;
    public static HashMap<String, Integer> idList = new HashMap<>();
    static int idCounter = 0;

    public Staff() {
        idCounter++;
    }

    void assignId() {
        idList.put(this.name, idCounter);
    }

    public int getId() {
        return idList.get(this.name);
    }

    public String getName() {
        return this.name;
    }

    public static void printStaffList() {
        for (String i :
                idList.keySet()) {
            System.out.println("name: " + i + " id: " + idList.get(i));
        }
    }

    public abstract void performCheckup(String... a);
}