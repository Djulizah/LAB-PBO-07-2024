package Tugas3;

import java.util.ArrayList;

public class Store {
    // Attribute
    String name;
    ArrayList<ArtSupplies> inventory;

    // Constructor
    public Store(String name) {
        this.name = name;
        this.inventory = new ArrayList<>();
    }

    // Behaviour
    public void addItem(ArtSupplies item) {
        inventory.add(item);
    }

    public void sellItem(ArtSupplies item) {
        inventory.remove(item);
    }

    public void displayInventory() {
        System.out.println("Inventory available at " + name + " store:");
        for (ArtSupplies item : inventory) {
            System.out.println("- " + item.getItemName());
        }
    }
}
