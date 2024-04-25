package Nomor2;

class Laptop extends Product{
	int ramSize;
	String processorType;
	
	public Laptop(String brand, int seriesNumber, double price, int ramSize, String processorType) {
		super(brand, seriesNumber, price);
		this.ramSize = ramSize;
		this.processorType = processorType;
	}

	public void displayInfo(){
		super.displayInfo();
		System.out.println("RamSize : "+ ramSize);
		System.out.println("Processoratype: " + processorType);
	}

}
