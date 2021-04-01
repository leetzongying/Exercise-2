package maim;

public class Main {

	public static void main(String[] args) {
		Smartphone Huawei = new Smartphone();
		 System.out.println("This is " + Huawei.model[0]);
		 System.out.println("The brand is "+ Huawei.brand[0]);
		 System.out.println("This phone is run in "+ Huawei.OS[0]);
		 System.out.println("This phone is released in " + Huawei.releasedyear[0]);
		 
		 System.out.println("\n");
		 
		 Huawei.notification();
		 Huawei.mute();
		 Huawei.screenshot();
		 Huawei.alarm();
		 
		 System.out.println("\n");
		 
		 Smartphone Samsung = new Smartphone();
		 System.out.println("This is " + Samsung.model[1]);
		 System.out.println("The brand is "+ Samsung.brand[1]);
		 System.out.println("This phone is run in "+ Samsung.OS[1]);
		 System.out.println("This phone is released in " + Samsung.releasedyear[1]);
		 
		 System.out.println("\n");
		 
		 Samsung.notification();
		 Samsung.mute();
		 Samsung.screenshot();
		 Samsung.alarm();
		 
		 System.out.println("\n");
		 
		 Smartphone Apple = new Smartphone();
		 System.out.println("This is " + Apple.model[1]);
		 System.out.println("The brand is "+ Apple.brand[1]);
		 System.out.println("This phone is run in "+ Apple.OS[1]);
		 System.out.println("This phone is released in " + Apple.releasedyear[1]);
		 System.out.println("\n");
		 Apple.notification();
		 Apple.mute();
		 Apple.screenshot();
		 Apple.alarm();
		

	}

}
