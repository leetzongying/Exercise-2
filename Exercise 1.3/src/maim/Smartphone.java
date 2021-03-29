package maim;

public class Smartphone {
	
	String model = "Huawei P30"; 
	String OS = "Android 9.0 \"Pie\"";
	int releasedyear = 2019;
	String brand = "Huawei";

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
