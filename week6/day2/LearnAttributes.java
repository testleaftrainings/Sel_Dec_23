package week6.day2;

import org.testng.annotations.Test;

public class LearnAttributes {
	
  @Test(priority = -1)
  public void createLead() {
	  
	 System.out.println("Lead created successfully"); 
  }
  
  
  
  @Test(priority = 2)
  public void deleteLead() {
	  
	 System.out.println("Lead deleted successfully"); 
  }
  
  @Test(priority = 3)
  public void mergeLead() {
	  
	 System.out.println("Leads merged successfully"); 
  }
  
  @Test(priority=1)
  public void editLead() {
	  
	 System.out.println("Lead editted successfully"); 
  }
}
