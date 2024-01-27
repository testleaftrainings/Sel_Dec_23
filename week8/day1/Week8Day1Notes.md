### Todays Agenda
    > 2:30 to 3:15 -> Cucumber - Parameterization
    > 3:15 to 3:30 -> Breakout
    > 3:30 to 3:45 -> Break
    > 3:45 to 4:45 -> Passing multiple data
    > 4:45 to 5:00 -> Breakout
    > 5:00 to 6:00 -> Hooks Implementation
    > 6:00 to 6:30 -> Tags

# Steps to Parameterize:
1. Create 2 Scenarios in the feature file
      - Positive Scenario
      - Negative Scenario
2. Find the datas which has to be parameterized in both the scenarios
    ex: Demosalesmanager,crmsfa
3. Surrond the data with ''
   ex:  Enter the username as 'Demosalesmanager'
4. In the StepDefintion class replace the data with {string}
5. Pass input arguments to the method and replace the hardcoded data
6. Use Background keyword in the feature file and put the common precondition for multiple scenarios

# Exceptions:
 - DuplicateStepDefinitionException
 - UndefinedStepException

# Steps to pass mutliple data using ScenarioOutline
1. Create CreateLead.feature
2. Create CreateLeadStepdefintion class and map all the steps in the feature file by creating ethods
3. Create a BaseClass inside steps package and declare the driver as static
4. All the StepDefintion should extends BaseClass
5. In CreateLead.feature file to pass multiple data to a scenario use ScenarioOutline keyword
   followed with Examples to pass inputs
6. Replace the datas with <>
    ex: <companyname>
7. In StepDefinition on the top of the method parameterize the data with (.*)$
    ex: And("Enter the firstname as (.*)$")
8. Pass input arguments to the method and replace the hardcoded data             

        
# Hooks
  - In Cucumber the annotations are called as Hooks 
     - @Before
        - to execute the common preconditions before  each Scenario 
     - @After
        - to execute the common postconditions after each Scenario

# Steps to implement Hooks
1. Create  a package called hooks and create a Class called HooksImplementation
2. Create 2 methods preCondition and postCondition and use hooks on top of each method
   like @Before and @After
3. The HooksImplementation class should extends BaseClass to access the driver variable
4. In the runner class mention the hooks package name with glue attribute
    ex: glue = {"steps","hooks"}

Note:
1. Remove Background keyword in both the feature files
2. Remove the methods to loadURL and launchBrowser in the StepDefintion class  

# Simplified Approach
1. In the BaseClass put the common preCondition and postCondition 
   and annotate with TestNG annotations like @BeforeMethod and @AfterMethod
2. The Runner class should extend BaseClass
3. The BaseClass should extends AbstractTestNGCucumberTests

Note:
 - Remove Hooks Implementation

# Tags
    - to categorize the Scenarios
    
     positive Scenario - @Smoke
     CreateLead
     negative Scenario - @Functional


