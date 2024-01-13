### Today's Agenda:

    > 2:30 to 3:30 -> TestNG Attributes
    > 3:30 to 3:45 -> Breakout
    > 3:45 to 4:00 -> Break
    > 4:00 to 5:00 -> Static parameterization
    > 5:00 to 5:15 -> Breakout
    > 5:15 to 6:15 -> Dynamic parameterization
    > 6:15 to 6:30 -> Breakout





### TestNG Attributes:
1. **priority**
   - **Definition**: This attribute sets the priority level for the methods; lower numbers indicate higher priority.
   - **Use case**: Used when you want to control the order of test method execution.
   - **Syntax**: `@Test(priority=2)`

2. **enabled**
   - **Definition**: This attribute determines whether a test method is enabled or disabled.
   - **Use case**: Used to enable or disable a test method without removing its code.
   - **Syntax**: `@Test(enabled=false)`

3. **invocationCount**
   - **Definition**: This attribute indicates how many times a test method should be invoked.
   - **Use case**: Used when you want to execute a test method multiple times for the same data.
   - **Syntax**: `@Test(invocationCount=10)`

4. **threadPoolSize**
   - **Definition**: The size of the thread pool for this method. The method will be invoked from multiple threads as specified by invocationCount. NOTE: this attribute is ignored if invocationCount is not specified
   - **Use case**: Used when you want to perform parallel execution of methods with invocationCount.
   - **Syntax**: `@Test(invocationCount=10,threadPoolSize=5)`

5. **invocationTimeOut**
   - **Definition**: The maximum number of milliseconds this test should take for the cumulated time of all the invocationcounts. This attribute will be ignored if invocationCount is not specified.
   - **Use case**: Used to limit the total time for repeated test method invocations.
   - **Syntax**: `@Test(invocationTimeOut=10000)`

6. **dependsOnMethods**
   - **Definition**: This attribute lists the methods a test method depends on.
   - **Use case**: Used when a test method depends on one or more methods and should only be run if the dependent methods pass.
   - **Syntax**: `@Test(dependsOnMethods={"methodA", "methodB"})`

7. **alwaysRun**
   - **Definition**: If set to true, this test method will always be run even if it depends on a method that failed.
   - **Use case**: Used to guarantee the execution of certain cleanup methods, regardless of test success or failure.
   - **Syntax**: `@Test(alwaysRun=true)`

8. **timeOut**
   - **Definition**: The maximum number of milliseconds this test should take.
   - **Use case**: Used to fail a test if it takes longer than a specified amount of time.
   - **Syntax**: `@Test(timeOut=3000)`

9. **Dependencies with Annotations**
     - You can use the attributes dependsOnMethods or dependsOnGroups, found on the @Test annotation. There are two kinds of dependencies:
     - **Hard dependencies**: All the methods you depend on must have run and succeeded for you to run. If at least one failure occurred in your dependencies, you will not be invoked and marked as a SKIP in the report.
     - **Soft dependencies**: You will always be run after the methods you depend on, even if some of them have failed. This is useful when you just want to make sure that your test methods are run in a certain order but their success doesn’t really depend on the success of others. A soft dependency is obtained by adding "alwaysRun=true" in your @Test annotation.


### Frequently asked Interview Questions on Attributes

  1. If a TestNG class contains multiple test methods without any specified priority or dependencies, in what order would you expect these methods to execute?

  2. In TestNG, if test methods within a class are assigned priorities, how does this affect their execution order?

  3. Consider a TestNG class with a mix of test methods where some have a specified priority and others don't. Explain the order in which these methods will execute.

  4. What happens in TestNG when two test methods have the same priority value? How does TestNG decide which method to run first?

  5. If test methods have a combination of `priority` and `dependsOnMethods` attributes. Explain the execution order of these methods and the reason behind it.

Classroom:
1. Schedule priorities between the testcases
2. disable a particular testcase from execution
3. Execute editLead testcase 5 times with cumulative timeperiod of 80s 

### Parameterization: 
  - No hardcoding of data 

 - static
 - dynamic

Steps to implement Static Parameterization:
1. Identify the data that are common data across all testcases
   ex: url,username,password
   <parameter name="url"
		value="http://leaftaps.com/opentaps/control/main"></parameter>
2. Add parameter tag for each one of the data in the testng.xml file
3. Map the parameters in the java class using @Parameters
   Note: The name should exactly match the names in the xml
   @Parameters({"url","username","password"})
4. Use that parameters inside the mathod using arguments
   Note: Sequence matters but the name of the argument doesnot matter
   public void preCondition(String url,String uName,String pWord)
5. Finally, replace it with arguments
       driver.get(url);

Note: You should always run from the xml file when you use parameters


### Dynamic Parameterization
Steps to implement Dynamic Parameterization:
1. Identify the datas that are specific to the particular testcase
   ex: CreateLead - compnayname, firstname, lastname, phonenumber
       EditLead - phonenumber,companyname
2. Create a method sendData() inside the CreateLead class 
3. Annotate that method with @DataProvider
4. Inside sendData() create 2-Dimensional array with number of rows and columns
     - Add all the sets of data into the array and make sure the index starts from 0
5. Return the data back to the calling method
6. Receive this data in the test method
    - use dataprovider attibute
    - use that arguments inside the method.
7. Finally, replace the hardcoded values


@BS
  @BT
    @BC
      @DP
        @BM
         @T
        @AM
     @AC
  @AT
@AS         


