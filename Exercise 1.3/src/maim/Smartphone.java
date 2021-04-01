package maim;

public class Smartphone {
	
	String model []= {"Huawei P30", "Samsung Galaxy S21", "iPhone 12 Pro"}; 
	String OS [] = {"Android 9.0 \"Pie\"", "One UI 3.1, Android 11","iOS 14.1"};
	int releasedyear [] = {2019, 2021, 2020};
	String brand[] = {"Huawei", "Samsung","Apple"};

	void notification() {
		System.out.println("You have 99+ unread messages.");
	}
	
	void mute() {
		boolean muted = true;
		System.out.println("Status of mute: " + muted);
	}
	
	void screenshot() {
		boolean button1 = true;
		System.out.println("Your screen has been captured: " + button1);
	}
	
	void alarm() {
		boolean setalarm = true;
		System.out.println("Your alarm time has been seted: " + setalarm);
	}
}
