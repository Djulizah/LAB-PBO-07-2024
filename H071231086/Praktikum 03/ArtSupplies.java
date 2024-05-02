package Tugas3;

public class ArtSupplies {
    //Attribute
    String itemName;
    double price;
    String category;

    //Instance variable bertipe data objek
    Store store;

    //Constructors
    public ArtSupplies(String itemName, double price, String category) {
        this.itemName = itemName;
        this.price = price;
        this.category = category;
    }

    public ArtSupplies(String itemName, double price, String category, Store store) {
        this.itemName = itemName;
        this.price = price;
        this.category = category;
        this.store = store;
    }

    // Behaviour
    public void displayInfo() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: $" + price);
        System.out.println("Category: " + category);
    }

    public void purchaseItem() {
        if (store != null) {
            store.sellItem(this);
            System.out.println("Purchased: " + itemName);
        } else {
            System.out.println("Store information not available.");
        }
    
    }
    public String getItemName() {
        return itemName;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }
}
