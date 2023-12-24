package week3.day1;

public class Auto extends Vehicle{
	
	public void applyMeter() {
		System.out.println("Meter applied --> Auto class");
	}
	
	
   public static void main(String[] args) {
	Auto ac = new Auto();
	ac.applyBrake();
	ac.soundHorn();
	ac.applyMeter();
}
}
