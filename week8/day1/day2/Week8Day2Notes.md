### Todays Agenda
   > 2:30 to 3:30 -> POM with Cucumber
   > 3:30 to 4:00 -> ThreadLocal Integration
   > 4:00 to 4:15 -> Break
   > 4:15 to 4:45 -> Exception Handling
   > 4:45 to 5:15 -> Extent Report
   > 5:15 to 6:30 -> Extent Report Integration


For TestNG_POM:
 - driver -> static
    -> sequential execution is possible
    -> Parallel execution is not possible
- To have both sequentian and parallel execution 
    -> Constructor congiguration is made     

For Cucumber_POM:
  - driver -> static
      -> sequential execution is possible
      -> Cucumber will not support Constructor declaration

# Steps to integrate Cucumber with POM:
# Prerequisite
     - base
     - pages
     - testcases
Note: The driver should be static in ProjectSpecificMethods    
1. Have 3 layers of cucumber inside the project of POM
2. Have features package inside src/main/java
3. pages package denotes the steps package
4. Inside each pages map each step in the feature file with each methods
Note: Remove Constructor declaration in each pages
5. Have the runner class inside the testcases package
Note: Check the path of the feature file and the package name of the glue atttribute 
6. The Runner class should extend ProjectSpecificMethods
7. The ProjectSpecificMethods should extend AbstractTestNGCucumberTests  
8. Finally, execute from the CucumberRunner class 

# Encapsulation
    private String name;
   - using setter and getter methods
   public void setName(){

   }

   public void getName(){

   }



# ThreadLocal Integration
  *Step1:*  private static final ThreadLocal<ChromeDriver> cDriver = new ThreadLocal<ChromeDriver>();
   1. private 
         - The variable is accessible only within the class
   2. static
        - Shared among all the instances of the class
   3. final
       - variable once initialized cannot be changed           
   
   static+final -> constant
   4. ThreadLocal:
        - To ensure that each thread has its own instance of the driver

   *Step2:*  
      - Use setter and getter method

       public void setDriver(){
           cDriver.set(new ChromeDriver());
      }

     *Purpose of setDriver():*
        - Initialize the ThreadLocal variable with a new instance of ChromeDriver

      set():
        - Sets the current thread's copy of this thread-local variable(cDriver)
     
     *Purpose of getDriver():*
     public ChromeDriver getDriver() {
		return cDriver.get();
		
	}
	      - Retrieve the current thread (ChromeDriver  instance) from the ThreadLocal variable

    get():
      - Returns the value in the current thread's copy of this thread-local variable 

  *Step3:*  
   1. In preCondition() call the setDriver() to initialize the value each time
   2. Replace the driver variable with getDriver() in each classes.


# Exception:
    - Abnormal behavior whcih disrupts the program execution
1. Compile Time Exception or Checked Exceptions
2. RunTime Exception or Unchecked Exceptions
    - NoSuchElementException
    - NoSuchFrameException
    - StaleElementReferenceExceptions
    - ArrayIndexOutOfBoundException
    - NoSuchWindowException
    - NoAlertPresentException
    - ElementClickInterceptedException
   

     
# Exception Handling: 
   - Exception Handling  can be done using try/catch block  
   - catch block wil be executed only when there is an exception
   - We cannot have try block alone
   - We cannot have catch block alone
   - All the Exceptions are classes which extends RunTimeException
   - Exception is the super class for all the Exceptions
   - Finally block will be getting executed irrespective of the exceptions
   - To handle exceptions catch block is mandatory
   - try should be followed either with the catch/finally / catch and finally


try        try      try         try        try
catch      catch       try      catch      finally
           catch       catch    finally
           catch    catch

# throw:
   - It is used within the method body
   - It throws an exception
   - If a method uses throw keyword it doesnt handle the exception itself(though it can be surrounded with try
      -catch block ) 

# throws:
   - It is used in the method signature
   - Declares that an exception might be thrown
   - Indicates that the exception needs to be handled by accepting

# Extent Report:  - Aventstack 
   
<!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
<dependency>
    <groupId>com.aventstack</groupId>
    <artifactId>extentreports</artifactId>
    <version>3.1.5</version>
</dependency>

    - Can  attach screenshot for each step
    - Can have report based on different author
    - Can have report based on different category
    - Can have consolidated dashboard with graphs

# Extent Classes:
  ExtentHTMLReporter
  ExtentReport
  ExtentTest
  MediaEntityBuilder
    








