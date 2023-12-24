package week3.day1;

public class Bajaj extends Auto{
	
	public void selfStart() {
		System.out.println("Auto Started--> BAjaj class");
	}
	
	public static void main(String[] args) {
		Bajaj bj = new Bajaj();
		
		
		bj.selfStart();
		bj.applyMeter();
		bj.applyBrake();
	}

}
