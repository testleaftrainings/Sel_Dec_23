### Today's Agenda:

    > 2:25 to 2:40 -> Live Quiz
    > 2:49 to 3:30 -> How to read data from excel
    > 3:30 to 3:45 -> Breakout
    > 3:45 to 4:00 -> Break
    > 4:00 to 4:45 -> ReadExcel Integration
    > 4:45 to 5:00 -> Breakout
    > 5:00 to 5:45 -> Constructor
    > 5:45 to 6:30 -> Explicit Wait


## How to read data from Excel?

    - Microsoft Excel
    - Apache POI - access MS office software 
    - Excel extensions : .xls, .xlsx


 - Workbook (CreateLead.xlsx)
 -  WorkSheet (Sheet1, Sheet 2)
   - Rows
    - Column (cell)


How to integrate Apache POI with TestNG?
1. Convert the method with return type as String[][] and keep the method as a static
2. Push all the excel data to the array
3. Inside the String[][] remove the hardcoded value and mention the rowCount and columnCount
4. Close the workbook and return the data


Steps:
  1. Pass input argument to the readExcel method and replace the hardcoded excel sheet name
  2. Create sendData() and annotate with @DataProvider
      -Inside this method call readExcel() and parameterize the filename by creating the fileName globally in the BaseClass
         @DataProvider
	public String[][] sendData() throws IOException { 
		
		return ReadExcelDataIntegration.readExcel(fileName);
         

	}
  3. Create setValues() and annotate with @BeforeTest in each testcase to mention the fileName
      @BeforeTest
	public void setValues() {
		fileName="CreateLead";
	}
	
  4. Finally, run different classes from the xml file    

### How to retry Failed Testcases?
1.  Inside test-ouptut -> from testng-failed.xml  we can retry the failed testcases
2.  IRetryAnalyzer
    IAnnotationTransformer

Steps:
1. Create a  user-defined class called RetryFailedTests which implements IRetryAnalyzer    



























###  Constructor

**Definition:**
    - A constructor  is a special type of method used to initialize objects. 
    - It shares its name with the class and has no return type, not even void.
**Use Cases:**
- **Object Initialization:** The primary purpose of a constructor is to set initial values for object attributes.
- **Default Configuration:** A default constructor is used if no explicit constructor is provided. It gives default values to the object like 0, null, etc., depending on the type.
- **Resource Allocation:** Constructors can also be used for allocating resources when an object is created.

#### **Constructor Overloading:**
- **Definition:** Constructor overloading in Java is a technique where a class includes more than one constructor with different parameters lists.
- **Purpose:** It allows the creation of objects in different ways, depending on the information available at the time of object creation.

#### **Constructor Chaining:**
- **Definition:** Constructor chaining is the process of calling one constructor from another constructor with respect to the current object.
- **How it's Done:** 
  - **Within the Same Class:** Using `this()` to call a constructor from another overloaded constructor in the same class.
  - **From Base Class:** Using `super()` to call a superclass's constructor.
- **Purpose:** Constructor chaining is used to perform multiple tasks in a single constructor rather than duplicating code in several constructors.
