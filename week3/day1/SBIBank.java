package week3.day1;

public class SBIBank implements RBI{

	public void knowYourCustomer() {
		System.out.println("AADHAR");
		
	}

	public void withDrawalLimit() {
		System.out.println("25k");
		
	}
	
	public void goldLoanInterestRate() {
		System.out.println("6%");

	}

	public void cibilScore() {
		System.out.println("7%");
		
	}
	
	public static void main(String[] args) {
		SBIBank cb =new SBIBank();
		cb.knowYourCustomer();
		cb.cibilScore();
		cb.withDrawalLimit();
		cb.goldLoanInterestRate();
	}

	

}
