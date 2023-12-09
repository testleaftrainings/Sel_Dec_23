### Agenda:
1. Day1 
      2:30 to 2:45 : Course Instruction
      2:45 to 3:45 : Core Java Introduction
      3:45 to 4:00 : First Program
      4:00 to 4:15 : Classroom Activity 
      4:15 to 4:30 : Break
      4:30 to 5:15 : Data types and Variables
      5:15 to 5:30 : Break
      5:30 to 6:00 : Operators
      6:00 to 6:30 : Conditional Statements
      6:30 to 6:45 : Breakout












### Java Introduction:

1. **What is Java?**
      - Java is a computer programming language. 
      - Java is a versatile and widely-used programming language. 
      - It allows developers to write code that can run on different types of devices, from computers to mobile phones.
      - Java is strong and reliable.
      - Robustness in Java refers to its ability to handle errors and unexpected situations gracefully. 
      - It includes features like strong memory management.
      - Java uses a way of organizing code based on objects.
      - Object-oriented programming is a programming principle that organizes code into objects, which are instances of classes. This approach promotes code reuse, modularity, and easier maintenance.

2. **Why Java?**

     -  Java is known for being flexible.
     -  Java's adaptability means that it can be used in various scenarios. 
     -  Whether you're building a small application or a large-scale system, Java provides the flexibility to adapt to different requirements and environments.
     - Java works on different types of devices.
     - Being ''platform-independent'' means that Java code can run on various devices, such as computers, smartphones, and other gadgets. This is possible because Java programs are compiled into an intermediate form (bytecode), which can be executed on any device with a Java Virtual Machine (JVM).
     - Java is versatile and excels in a wide range of applications.
     - It is commonly used in web development, mobile app development (Android), enterprise systems, scientific applications, and more. 
     - Its broad applicability makes it a popular choice for developers working on diverse projects.

### Java Architecture:
   
1. **JDK (Java Development Kit):**
    - JDK is like a toolkit for Java developers.
    - The JDK includes everything a developer needs to write, compile, and run Java applications.
    - It contains the Java compiler, libraries, and other tools to help create software. 
    - If you want to build Java applications, you need the JDK.

2. **JRE (Java Runtime Environment):**
    - JRE is like a package to run Java programs.
    - The JRE is necessary for running Java applications. 
    - It includes the Java Virtual Machine (JVM) and essential libraries. If you only want to run Java programs and not develop them, you just need the JRE. It allows your computer to execute Java applications.

3. **JVM (Java Virtual Machine):**
   - JVM is like a virtual computer for Java.
   - The JVM is a virtualized environment that runs Java bytecode.
   - When you compile your Java code, it turns into bytecode, a set of instructions for the JVM. 
   - The JVM, in turn, translates these instructions into machine code that your computer understands. 
   - It makes Java programs "write once, run anywhere" by enabling them to run on any device with a compatible JVM.

### IDE:
  1. *Definition:*
      An IDE, or Integrated Development Environment, is like a digital workspace where programmers write, edit, and manage their code. It provides tools such as a code editor, debugger, and compiler, all in one place, making it easier for developers to create and maintain their software.

### Package:
   1. *Definition:*
      In Java, a package is a way to organize and group related classes and interfaces. It helps in avoiding naming conflicts and enhances the overall structure of a program.

### Class:
   1. *Definition:*
      In Java, a class is a blueprint or template that defines the properties (attributes) and behaviors (methods) that objects created from the class will have.

### Variables:
   1. *Definition:*
     Variables in Java are like containers that store data. They have a type (int, double, String) and a name. Use variables to store and manipulate data.

### Datatypes:
   1. *Definition:*
       Datatypes specify the type of data a variable can hold. 

### Conditional Statements:
   1. Conditional statements  are used to control the flow of the program based on certain conditions. These statements allow the program to make decisions and execute different blocks of code depending on whether a specified condition evaluates to true or false. The primary conditional statements in Java include:

### 1. `if` Statement:

**Definition:**
The `if` statement is used to execute a block of code only if a specified condition is true.

**Syntax:**
```java
if (condition) {
    // Code to be executed if the condition is true
}
```

### 2. `if-else` Statement:

**Definition:**
The `if-else` statement is used to execute one block of code if the condition is true and another block of code if the condition is false.

**Syntax:**
```java
if (condition) {
    // Code to be executed if the condition is true
} else {
    // Code to be executed if the condition is false
}
```

### 3. `if-else if-else` Statement:

**Definition:**
The `if-else if-else` statement allows you to check multiple conditions in sequence. It executes the first block of code whose condition is true.

**Syntax:**
```java
if (condition1) {
    // Code to be executed if condition1 is true
} else if (condition2) {
    // Code to be executed if condition2 is true
} else {
    // Code to be executed if none of the conditions is true
}
```

### Switch-case statement:

1.  The switch-case statement in Java is a conditional statement used to make decisions based on the value of an expression. 
 - The switch statement evaluates the expression and then compares it against various case values. When a match is found, the associated block of code is executed.

**Syntax:**

```java
switch (expression) {
    case value1:
        // Code to be executed if expression equals value1
        break;
    case value2:
        // Code to be executed if expression equals value2
        break;
    // Additional cases as needed
    default:
        // Code to be executed if none of the cases match
}
```
*Key points about the switch-case statement:*
1. *Expression:*
    The expression is evaluated once and its value is then compared with the constant values specified in the case statements.
2. *Case Values:*
    Each case specifies a constant value that the expression is compared against. If there's a match, the code block following that case is executed.
3. *Break Statement:*
    The break statement is used to exit the switch statement after a match is found. Without break, the flow of execution would continue to subsequent case statements.
4. *Default Case:*
    The default case is optional and serves as a fallback if none of the case values match the expression. It is executed when no other matching case is found.

### Differences and Usage of If and Switch case Statements:
1. Expression Type:
if: Can handle complex conditions involving relational operators, logical operators, and method calls.
switch: Requires a simple expression that results in a value (e.g., numeric types, characters, or enumerated types).
2. Number of Conditions:
if: Suitable for handling a relatively small number of conditions or conditions that don't share a common expression.
switch: Especially useful when there are multiple conditions sharing the same expression.
3. Equality Comparison:
if: Allows for complex conditions involving equality, inequality, or other relational operators.
switch: Specifically designed for equality-based comparisons. Each case checks if the expression equals a constant value.
4. Complex Conditions:
if: Provides flexibility to handle more complex conditions with logical operators (AND, OR).
switch: Limited to simple equality conditions; each case checks if the expression equals a specific value.
5. Fall-Through Behavior:
if: Each if statement is independent, and there is no implicit fall-through behavior.
switch: Requires explicit break statements to exit the switch block. Without break, the control flow falls through to the next case. This can be leveraged for multiple case values executing the same block of code.
6. Default Case:
if: No default case; you can handle default behavior with an additional else statement.
switch: Has a built-in default case, which is executed when none of the case values match the expression.


## Steps to Create a Maven Project:
1. Right click File -> New Project ->
   Under Maven Folder -> Click Maven Project ->
   Click Next -> Click the checkbox (Create a simple Project) ->
   Click Next -> Enter Groupid-> Organization name
   -> Enter Artifact id -> ProjectName(Start with Uppercase)
   -> Click Finish
       
## Steps to Create a Package:
1. Right click src/main/java -> Click New -> Click Package

*Naming Convention:*
   - Package name should always start with Lowercase

## Steps to Create a Class:
1. Right click on the package -> Click New -> Click Class -> Provide a name -> Click Finish


*Naming Convention:*
   - Class name should always start with Uppercase

target folder:
  ->Right Click Project-> Show in System Explorer ->
-> Click target folder-? Double click -> classes folder -> week1-> day1 -> class file   

## Naming convention to be followed for declaring a variable is camelCase

