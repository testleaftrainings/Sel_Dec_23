package week1.day2;

public class LearnMethods {

	/*Method - Signature
	 * access Modifier
	 * 
	 * return type
	 * 
	 * arguments
	 * 
	 * method name 
	 */

	public void addTwoNumbers(int a,float b,int c){

		System.out.println(a+b+c);

	}

	private int noOfBicycle() {
		return 2;
	}

	  String bicycleData(String brandName,String brandColor) {

		return brandName+" "+brandColor;

	}

	public static void main(String[] args) {

		//ClassName objectName = new ClassName();
		LearnMethods  obj = new LearnMethods();
		obj.addTwoNumbers(89, 98.9f, 98);
		// shortcut to assign to a variable is ctrl+2,l
		int noOfBicycle = obj.noOfBicycle();
		System.out.println(noOfBicycle);

		String bicycleData = obj.bicycleData("Honda", "Blue");
		System.out.println(bicycleData);


	}



}
