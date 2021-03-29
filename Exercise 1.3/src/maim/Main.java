package maim;

public class Main {

	public static void main(String[] args) {
	
		Smartphone c = new Smartphone();
		 System.out.println(c.model);
		 System.out.println(c.OS);
		 System.out.println(c.releasedyear);
		 System.out.println(c.brand);
		 c.notification();
		 c.mute();
		 c.screenshot();
		 c.alarm();

	}

}
