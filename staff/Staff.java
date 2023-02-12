package staff;

import java.util.HashMap;

public abstract class Staff {
    private String name;
    private static HashMap<Integer, String> idList = new HashMap<>();
    private static int idCounter = 0;

    public Staff() {
    }

    public Staff(String nameOfStaff) {
        this.name = nameOfStaff;
        idCounter++;
    }

    protected void assignId() {
        idList.put(idCounter, this.name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void printStaffList() {
        for (Integer id : idList.keySet()) {
            System.out.println("name: " + idList.get(id) + " id: " + id);
        }
    }

    public abstract void performCheckup(String... a);
}