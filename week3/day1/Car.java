package week3.day1;

public class Car extends Vehicle{

	public void applyGear() {
		System.out.println("GEar applied ---> Car class");
	}
	
	
	public static void main(String[] args) {
		
	
		Car car = new Car();
		car.applyBrake();
		car.soundHorn();
		car.applyGear();
	}

}
