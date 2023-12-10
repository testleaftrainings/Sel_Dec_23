package week1.day2;

public class LearnSwitchCase {

	public static void main(String[] args) {

		String browser="Chrome";

		switch(browser) {//Chrome
		case "Chrome": 
			System.out.println("Open Chrome browser");
			break;
		case "Edge":
			System.out.println("Open Edge browser");
			break;
		case "Firefox":
			System.out.println("Open Firefox browser");	
			break;
        default:
        	System.out.println("Open IE browser");

		}

	}

}
