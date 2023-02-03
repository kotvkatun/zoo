package staff;

import java.util.HashMap;

public abstract class Staff {
    private String name;
    private static HashMap<String, Integer> idList = new HashMap<>();
    private static int idCounter = 0;

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

    public void setName(String name) {
        this.name = name;
    }

    public static void printStaffList() {
        for (String i : idList.keySet()) {
            System.out.println("name: " + i + " id: " + idList.get(i));
        }
    }

    public abstract void performCheckup(String... a);
}