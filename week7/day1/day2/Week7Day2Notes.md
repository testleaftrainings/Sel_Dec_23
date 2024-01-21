### Todays Agenda:
     
     > 2:25 to 2:40 -> Live Quiz
     > 2:40 to 3:30 -> Excel Integration with POM
     > 3:30 to 3:45 -> Breakout
     > 3:45 to 4:00 -> Break
     > 4:00 to 5:00 -> POM-Multilingual
     > 5:00 to 6:30 -> Cucumber


### Steps for Excel Integration:
1. Create data folder inside the project and create the excel sheets inside it
     - Login
     - CreateLead
2. Create utils package inside the project and have the ReadExcel class inside this package   
     - ReadExcelDataIntegration class
3. Create sendData() in the ProjectSpecificMethods and annoatate with @DataProvider
     - Call ReadExcelDataIntegration.readExcel(fileName)
     - Create a global varible for fileName
4. Go to each page and replace all the hardcoded data with input arguments
     - LoginPage
     - CreateLeadPage
5. With @Test use dataProvider attribute and pass all the input arguments inside the test method to
   map the data in the excel sheet.
6. Create setValues() inside each testcase and annotate with @BeforeTest and mention the fileName
     - Login
     - CreateLead
7. Finally, run all the testcases from the testng.xml file.    

### POM with Multilingual Application:
# To create property file:
1.  Right click src/main/resources-> click New->
   -> Click Other -> Expand General -> click File -> Click Next->
   -> give filename with .properties as the extension -> Click Finish
### Cucumber:

## Gherkin keywords:

    Feature: Login functionality of Leaftaps Application
     - describe the functionlity of an application
    Scenario: Login with Negative Credentials
      - describes the particular functionality / testcase 
      Given Launch the browser
      And Load the url
      And Enter the username as Demosalesmanage
      And Enter the password as crmsfa
      When Click on the Login button
      But Errormessage should be displayed

### Steps to start with Cucumber:
1. Create 3 packages under src/test/java
     - features
        - Create Feature file with extension as .feature
     - steps
        - Create StepDefinition class and create methods for each step defined in the Scenario
          and integrate
     - runner
        - Create a user defined class whih should extends AbstractTestNGCucumberTests
        - On the top of this class use @CucumberOptions() and use attributes like


1. **features**: 
   - **Description**: This attribute specifies the path to the feature files.
   - **Usage**: You can provide a single path or multiple paths where Cucumber should look for feature files. Feature files are written in Gherkin language and contain the scenarios to be tested.
   - **Example**: `features = "src/test/resources/features"`

2. **glue**:
   - **Description**: This attribute defines the package(s) where Cucumber should look for the step definitions and hooks.
   - **Usage**: Step definitions are the Java methods that match the steps in the feature files. The glue path should be set to the package containing these definitions.
   - **Example**: `glue = "steps"`

3. **monochrome**: 
   - **Description**: This attribute is used to display the console output in a more readable way.
   - **Usage**: When set to `true`, it removes any unreadable characters from the output.
   - **Example**: `monochrome = true`

4. **publish**:
   - **Description**: When set to `true`, this attribute allows Cucumber to publish the test report 
   - **Usage**:  A URL is provided after the execution which can be shared. 
   - **Example**: `publish = true`
