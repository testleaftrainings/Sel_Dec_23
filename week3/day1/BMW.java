package week3.day1;

public class BMW extends Car{
	
	public void applyGear() {
		System.out.println("Auto GEar applied ---> BMW class");
	}
	
	public void turnOnAc() {
		System.out.println("AC turned on --->BMW class");
	}
	
	public void autoPilotMode() {
		System.out.println("Auto Pilot Mode ON --> BMW class");
	}
	
	public static void main(String[] args) {
		BMW bm = new BMW();
		bm.applyGear();
		
	}

}
