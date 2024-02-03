### Todays Agenda:
      > 2:30 to 3:30 -> Extent Report Integration
      > 3:30 to 3:45 -> Break
      > 3:45 to 6:30 -> Framework

# TestNG annotation hierarchy:

@BeforeSuite                 - startReport()     - PSM

    @BeforeTest              - setValues()       - Each Testcase

       @BeforeClass          - testcaseDetails() - PSM

          @DataProvider      - sendData()        - PSM

             @BeforeMethod   - preCondition()    - PSM

                @Test        - runLogin, runCreateLead   - Each Testcase

             @AfterMethod    - postCondition()    - PSM

         @AfterClass         - Nil

     @AfterTest              - Nil

@AfterSuite                  - stopReport()       - PSM


# Steps to integrate ExtentReport:
  1. Create startReport() in ProjectSpecificMethods with ExtentReport declaring the ExtentReport extent as 
     a global variable
         - Add all the common codes for all the testcases (Step1 -Step 3)
         - Annotate startReport() with @BeforeSuite
  2. Create stopReport() in PSM and annotate with @AfterSuite
        - Add the step to save the report(extent.flush())    
  3. Create testCaseDetails() with test details 
        - Declare testName, testDescription, testAuthor, testCategory as global variables in the PSM
        - Replace the hardcoded values with these variables
        - Apply @BeforeClass annotation for this method
  4. Assign all the values for these variables in setValues() in each testcase   
  5. Create reportStep() with 2 arguments (msg,status) in PSM
  6. Call the reportStep in each methods inside each pages inside the try-catch block
       - try block with pass status
       - catch block with fail status   

# Framework
1. **Description:**
        - Hybrid framework -> TestNG + BDD 
        - Selenium Webdriver -> Automation tool -> interact with web applications
        - PageObjectModel -> Design pattern
        - Apache POI -> To read data from Excel sheet
        - Extent Report -> To generate a basic HTML automation summary report

2. **Components:**
        - com.framework.selenium.api.design
            - Browser (all the unimplemented methods related to browser activities)
            - Element (all the unimplemented methods related to Element activities)
        - com.framework.selenium.api.base
            - DriverInstance 
            - SeleniumBase
                - Wrapper class for our framework
                - libraray for our framework where we have the reusable codes for easy maintenance
                  - we have applied try-catch block for each method for proper exception handling
        - com.framework.testng.api.base
            - ProjectSpecificMethods
                 We have the common methods specific to the project
                  like preCondition() , postCondition(), fetchData()
            - RetryEngine
                To run the failed testcases automatedly
        - com.framework.api.utils
            - DataLibrary
               - To read the data from the excel sheet using Apache Poi library
            - Reporter
               - To generate automation html summary report using Extent Report library
        - com.framework.pages
            - We have classes for each pages
        - com.framework.testcases
            - We have classes for each testcase  

3. **Hierarchy**  

        AbstractTestNGCucumberTests
           DriverInstance
             Reporter
               SeleniumBase
                  ProjectSpecificMethods
                     Pages 
                     Testcases 
                     
4. **Execution Flow:**                     
@BeforeSuite                 - startReport()     - Reporter

    @BeforeTest              - setValues()       - Each Testcase

       @BeforeClass          - startTestCase()   - Reporter

          @DataProvider      - fetchData()       - PSM

             @BeforeMethod   - preCondition()    - PSM

                @Test        - runLogin, runCreateLead   - Each Testcase

             @AfterMethod    - postCondition()    - PSM

         @AfterClass         - Nil

     @AfterTest              - Nil

@AfterSuite                  - stopReport()       - Reporter
  






