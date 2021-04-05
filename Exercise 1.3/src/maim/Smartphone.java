package maim;

public class Smartphone {
	
	String model;
	String OS ;
	int releasedyear;
	String brand;
	double totalPrice, totalWeight;

	void printSpec(String model, String brand, String OS, int releasedyear) {
		System.out.println("Model: " + model);
		System.out.println("Brand: " + brand);
		System.out.println("Operating System: " + OS);
		System.out.println("Released Year: " + releasedyear);
	}
	
	void printTotal(int p, int q, String b){
        totalPrice = (p*q);
        
        System.out.println("The Unit Price of "+b+" is : RM "+p);
        System.out.println("The Total Unit Purchased is : " + q + " units.");
        System.out.println("The Total Price for "+q+" units of "+b+" is : RM"+totalPrice);
    }
	
	void weight(String brand, double weight, int quantity) {
		totalWeight = (quantity*weight);
		
		System.out.println("The Unit Weight of " + brand + " is :" + weight +"kg");
		System.out.println("The Total Unit Purchased is : " + quantity + " units.");
		System.out.println("The total weight for " + quantity + " " + brand + " is :" + totalWeight + "kg");
	}
	
	void alarm(int hour, int minute, int second) {
		System.out.println("Your alarm time has been set to " + hour + ":" + minute + ":" + second);
	}
}
