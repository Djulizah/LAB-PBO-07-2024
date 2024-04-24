class Shoes{
    String brand;
    String colour;
    int size;
    Extrapoint extrapoint;

    //construktor
    Shoes(String brand, String colour, int size){
        this.brand = brand;
        this.colour = colour;
        this.size = size;
    }

    Shoes(String brand, String colour){
        this.brand = brand;
        this.colour = colour;
    }

    void shopping(){
        if(this.extrapoint.popularity <= 5){
            System.out.println(" Not Recommended");
        }else if(this.extrapoint.popularity >= 6){
            System.out.println("Recommended");
        }else{
            System.out.println("Highly Recommended");
        }

    }

    void takeExtrapoint(Extrapoint extrapoint){
        this.extrapoint = extrapoint;
    }


    void display(){
        System.out.println("\nBrand\t: " + this.brand);
        System.out.println("Colour\t: " + this.colour);
        System.out.println("Size\t: " + this.size);
        this.extrapoint.display();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Extrapoint getExtrapoint() {
        return extrapoint;
    }

    public void setExtrapoint(Extrapoint extrapoint) {
        this.extrapoint = extrapoint;
    }

    
}

class Extrapoint{
    double popularity;

    Extrapoint(double popularity){
        this.popularity = popularity;
    }

    void display(){
        System.out.println("Popularity\t: " + this.popularity);
    }

}

public class TP3_1_H071231014{
    public static void main(String[] args) {
        Shoes shoes1 = new Shoes("New Balance", "Grey", 40);
        Shoes shoes2 = new Shoes("Converse", "Black and White");
        Extrapoint extra1 = new Extrapoint(8.6);
        Extrapoint extra2 = new Extrapoint(5);

        shoes1.takeExtrapoint(extra1);
        shoes2.takeExtrapoint(extra2);
        shoes2.setSize(42);

        shoes1.display();
        shoes1.shopping();
        shoes2.display();
        shoes2.shopping();

        
    }
}