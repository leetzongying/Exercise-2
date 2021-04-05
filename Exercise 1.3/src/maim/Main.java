package maim;

public class Main {

	public static void main(String[] args) {
		Smartphone Huawei = new Smartphone();
		Smartphone Samsung = new Smartphone();
		Smartphone Apple = new Smartphone();
		Smartphone Nokia = new Smartphone();
		
		System.out.println("Phone 1 Specifications");
		Huawei.printSpec("P30","Huawei","Android 9.0 \"Pie\"",2019);
		 
		System.out.println("\n");
		 
		 Huawei.printTotal(true);
		 Huawei.weight("P30",1.1,3);
		 Huawei.alarm(7,25,40);
		 
		 System.out.println("\n");
		 
		 System.out.println("Phone 2 Specifications");
		Samsung.printSpec("Samsung Galaxy S21","Samsung","One UI 3.1, Android 11",2021);
		 
		 System.out.println("\n");
		 
		 Samsung.printTotal(false);
		 Samsung.weight("Galaxy S21",0.8, 3);
		 Samsung.alarm(8,30,40);
		 
		 System.out.println("\n");
		 
		 System.out.println("Phone 3 Specifications");
		 Apple.printSpec("iPhone 12 Pro","Apple","iOS 14.1",2020);
		 
		 System.out.println("\n");
		 
		 Apple.printTotal(false);
		 Apple.weight("iPhone 12 Pro",1.2, 3);
		 Apple.alarm(9,10,25);
		 
         System.out.println("\n");
		 
		 System.out.println("Phone 4 Specifications");
		 Nokia.printSpec("Nokia 3310","Nokia","Yun OS",2020);
		 
		 System.out.println("\n");
		 
		 Nokia.printTotal(true);
		 Nokia.weight("Nokia 3310",1.5, 3);
		 Nokia.alarm(6,17,58);
		

	}

}
