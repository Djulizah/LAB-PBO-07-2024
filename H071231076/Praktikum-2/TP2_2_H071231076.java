public class TP2_2_H071231076 {
    private String id;
    private String name;
    private int stock;
    private double price;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean cekKetersediaan() {
        return stock > 0;
    }

    public static void main(String[] args) {
        TP2_2_H071231076 product = new TP2_2_H071231076();
        product.setId("H07076");
        product.setName("Ipad");
        product.setStock(3);
        product.setPrice(1300);

        System.out.println("Product ID: " + product.getId());
        System.out.println("Product Name: " + product.getName());
        System.out.println("Stock: " + product.getStock());
        System.out.println("Price: $" + product.getPrice());

        if (product.cekKetersediaan()) {
            System.out.println("Produk tersedia");
        } else {
            System.out.println("Produk habis");
        }
    }
}
