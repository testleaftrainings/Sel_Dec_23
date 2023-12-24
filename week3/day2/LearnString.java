package week3.day2;

public class LearnString {

	public static void main(String[] args) {

		//First way of declaration - String literal
		String str = "TestLeaf";
		str=str.toUpperCase();
		String strLiteral = "Testleaf";

		//Another way of declaration - String Instantiation
		String str1 = new String("TestLeaf");

		//String methods
		//to count the number of characters
		int actLength = str.length();
		System.out.println("Total length of the given String is : "+actLength);

		//to compare two Strings
		/**
		 * equals()-> checks the content of the String
		 * == -> Checks the memory references 
		 * 
		 */
		if(str.equals(strLiteral)) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Not Equal");
		}

		if(str==str1) {
			System.out.println("Both are equal");
		}
		else {
			System.out.println("Not Equal");
		}

		// to compares two String ignoring the case sensitivity
		boolean equalsIgnoreCase = str.equalsIgnoreCase(strLiteral);
		System.out.println(equalsIgnoreCase);

		//contains()
		if (str.contains("leaf") || str.contains("Leaf"))  {
			System.out.println("Present");
		}
		else {
			System.out.println("Not Present");
		}

		// toChararray
		char[] charArray = strLiteral.toCharArray();
		System.out.println(charArray);

		// 0 1 2 3 4 5 6 7
		System.out.println(strLiteral.charAt(7));// T,e,s,t,l,e,a,f

		// to print all the characters of the given String
		for (int i = 0; i < charArray.length; i++) {//i=1; i<8;

			System.out.print(charArray[i]);//faeltset

		}


	}

}
