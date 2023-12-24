### Today's Agenda:
- Day1:
    2:15 to 2:30 : Live Quiz
    2:30 to 3:30 : OOPs - Inheritance
    3:30 to 4:00 : Interview question
    4:00 to 4:15 : Breakout
    4:15 to 4:30 : Break
    4:30 to 5:15 : Polymorphism
    5:15 to 5:30 : Breakout
    5:30 to 6:30 : Abstraction
    6:30 to 6:45 : Breakout



















### Inheritance:

1. **Definition of Inheritance**: 
    - Inheritance is a fundamental principle in object-oriented programming that allows a class to inherit attributes and behaviors (methods) from another class. 
    - This uses `extends` keyword 

2. **Advantages of Inheritance**:
   - **Reusability**: Inheritance promotes the reuse of existing code without having to rewrite it.
   - **Readability**: It makes the code more simple by establishing clear relationships between classes.
   - **Hierarchy**: Establishes parent-child relationships between Classes and Interfaces, making the structure easier to understand and maintain.

3. **Types of Inheritance**:
   - **Single**: A class inherits from one parent class.
   - **Multiple**: A class inherits behaviors from more than one class, typically achieved through interfaces in Java.
   - **Multilevel**: A class inherits from a child class, creating a multilevel chain.
   - **Hierarchical**: Multiple classes inherit from a single parent class.
   - **Hybrid**: A combination of multilevel and hierarchical inheritance.

4. **Java Examples**:
    - Integer extends Number
    - RuntimeException extends Exception
    - List extends Collection
   
5. **Selenium WebDriver Examples**:
        - ChromeDriver extends ChromiumDriver
        - EdgeDriver extends ChromiumDriver
        - ChromiumDriver extends RemoteWebDriver
        ![Alt text](image.png)

### Interview Question
1. Could you explain Inheritance concept in Java?
   Answer:
     Definition, Types, Advantages, Examples
2. Give realtime examples in Java, Selenium  
3. Explain where have you applied Inheritance in your Framework? 

### Polymorphism:

- **Definition**
     - Polymorphism in Java is a concept by which we can perform a single action in different ways. 
     - It is derived from two Greek words: "poly" and "morphs". "Poly" means many and "morphs" means forms.

- **Types**
       - compile-time polymorphism 
       - runtime polymorphism. 
       _Compile-time polymorphism_ is achieved by _method overloading_, while _runtime polymorphism_ is achieved by _method overriding_. 
       - It allows objects of different classes to be treated as objects of a common super class for seamless interaction, typically through the use of method overriding within an inheritance hierarchy. 
       - This enables Java programs to be written more abstractly, promoting scalability and maintainability.

- **Overloading**: 
      - It refers to the ability to create multiple methods of the same name with different implementations.  -Calls to an overloaded method will run a specific implementation of that method appropriate to the context, based on the number and type of arguments passed.

- **Java Examples**: 
     - Methods like `add()` can be overloaded to accept different types of arguments. 
     - Similarly, `substring()` in the `String` class is overloaded to accept different starting and ending points for the substring.
     - println()

- **Selenium WebDriver Examples**: 
    - The `frame()` method in Selenium WebDriver is overloaded to allow different types of arguments like an integer (index of the frame), a String (name or ID of the frame), or a WebElement.



- **Advantages of Overloading**:
  - **Flexibility**: Allows methods to handle different data types and numbers of arguments.
  - **Readability**: It can make the code more readable  since the same method name can be used for similar actions on different types of input.
  - **Reduces Complexity**: Developers can use the same method name to perform similar actions, which simplifies code organization and maintenance.

**Overriding**
  - Method overriding in Java occurs when a subclass has a method with the same name, return type, and parameters as a method in its superclass. 
  - It's a key feature of runtime polymorphism and allows a subclass to provide a specific implementation for a method that is already provided by its parent class

Examples:
  - equals() of String class is overriden from the Object class
  - toString() of String class is overriden from the Object class
  - quit() of ChromiumDriver is overriden from the RemoteWebDriver Class  

### Abstraction:

1. **Definition**: 
   - Abstraction is an OOPs concept that focuses on hiding complex implementation details and exposing only the necessary parts of an object. It's about representing features without including background details.

2. **Advantages of Abstraction**:
   - **Simplicity**: Abstraction simplifies the view of an object, so you don't need to understand the internal workings to use it.
   - **Reusability**: Abstract classes and interfaces can be reused to implement common methods in multiple subclasses.

3. **Keyword**: The `implements` keyword is used to implement an Interface

4. **Types**:
   - **Interfaces**: Used for full abstraction, they cannot have any implementation.
   - **Abstract Classes**: Provide partial abstraction with some implemented methods.
   - **Concrete Classes**: Regular classes with full implementation.

5. **Java Examples**: 
   - **Interfaces**: `List`, `Set`, `Map` are interfaces providing a standard set of methods to be implemented by concrete collections.
   - **Abstract Classes**: `AbstractList`, `AbstractCollection` provide skeletal implementations that can be used as starting points for creating concrete collections.

6. **Selenium WebDriver Examples**:
   - **Interfaces**: `WebDriver`, `WebElement`, `Alert` are interfaces representing abstract concepts in browser automation.
   - **Abstract Classes**: `By` is an abstract class providing methods to locate elements.
   - **Concrete Classes**: `RemoteWebDriver` is a concrete implementation of the `WebDriver` interface.





    
  