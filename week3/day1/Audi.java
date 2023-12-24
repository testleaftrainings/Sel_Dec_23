package week3.day1;

public class Audi extends Car{
	
	public void openRoofTop() {
		System.out.println("Roof top opened --->Audi class ");

	}
	
	public static void main(String[] args) {
		Audi au = new Audi();
		au.openRoofTop();
		au.applyGear();
		au.applyBrake();
	}

}
