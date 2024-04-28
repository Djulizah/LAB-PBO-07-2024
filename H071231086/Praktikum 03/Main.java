package Tugas3;

public class Main {
    public static void main(String[] args) {
        Store store = new Store("Art Supplies Emporium");
        
        ArtSupplies item1 = new ArtSupplies("Sketchbook", 15.000, "Paper",store);
        ArtSupplies item2 = new ArtSupplies("Acrylic Paint Set", 29.0000, "Paint");
        
        store.addItem(item1);
        store.addItem(item2);
        
        item1.purchaseItem();
        item2.purchaseItem();
        store.displayInventory();
    }
}

