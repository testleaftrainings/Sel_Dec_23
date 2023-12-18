### Todays Agenda:
1. Day2
      2:30 to 3:00 : Absolute Xpath
      3:00 to 4:00 : Basic Relative Xpath
      4:00 to 4:15 : Breakout
      4:15 to 4:30 : Break
      4:30 to 6:00 : Advanced Xpath
      6:00 to 6:30 : Implicit Wait, Thread.sleep()

















1. **Definition and Structure**:
   - **Absolute XPath**: It starts from the root (`html`) and traverses down to the desired element, detailing every single element in the hierarchy. The path starts with a single forward slash `/`, indicating the root. For example: `/html/body/div[2]/div[2]/div/form/p[1]/input`.
`.
   - **Relative XPath**: It starts from anywhere within the document and typically focuses on identifying elements based on attributes, indexes, or specific tags, not necessarily detailing the entire path from the root. It starts with a double forward slash `//`, indicating the search can begin anywhere. 
   For example: `//input[@id=‘username’]`.

2. **Robustness**:
   - **Absolute XPath**: It is less robust because if there are any changes in the path or structure of the web page, the XPath would break, leading to failed element location.
   - **Relative XPath**: It is more robust as it usually focuses on specific attributes or elements, making it less susceptible to changes in the overall structure of the webpage.

3. **Length and Complexity**:
   - **Absolute XPath**: These tend to be longer . They map the entire path from the root to the element, making them more complex.
   - **Relative XPath**: They are generally shorter and more concise, targeting specific elements directly without detailing the entire path, reducing complexity.

4. **Flexibility and Use Cases**:
   - **Absolute XPath**: It's less commonly used in dynamic web environments where page structures can change frequently.
   - **Relative XPath**: More commonly used in web automation and scraping because of its adaptability to web page changes and ability to precisely target elements.

5. **Performance**:
   - **Absolute XPath**: It can be slower in performance as it requires traversing the entire hierarchy of the DOM (Document Object Model) from the root.
   - **Relative XPath**: Generally offers better performance as it allows for more direct queries and doesn't necessarily traverse from the root.


2. **Relative Xpath:**

    a.*Basic xpath*
    1. Attribute based xPath:
       Syntax:
       `//tagname[@attributename='attributeValue']`
       Example:
      ` //input[@id='password']`
      `//input[@id='twotabsearchtextbox']`

    2. Text based xPath:
       Syntax:
       ` //tagname[text()='textvalue'] ` 
       Example:
       ` //a[text()='Leads']`
       `//span[text()='Hello, sign in']`

    3. Partial Attribute based xpath:
       Syntax:
       `//tagname[contains(@attributename,'partialattributevalue')]`
       Example:
         `//input[contains(@class,'decorative')]`
         `//input[contains(@id,'twotab')]`

    4. Partial Text based xpath:  
       Syntax:
         `//tagname[contains(text(),'partialtextvalue')] `
       Example:
        `//a[contains(text(),'SFA')]`  
        `//span[contains(text(),'Hello')]`

    5. Index based xpath:
       Syntax:
        `(//tagname[@attributename='attributeValue'])[2]`        
        ` (//tagname[text()='textvalue'])[3] `
       Example:
         `(//a[contains(text(),'Lead')])[3] `

      
    b.*Advanced xPath(Axes based xPath)*
     1. Parent to Child:
        Syntax:
         `BasicRelativeXpathforParent/childTagname`
        Example:
          `(//form[@id='login']/p)[2] `

     2. Child to Parent:
        Syntax:
         ` BasicRelativeXpathforChild/parent::parenttagname` 
        Example:
        ` //label[text()='Password']/parent::p`
         `//p[@class='top']/parent::form`    

     3. GrandParent to GrandChild:
        Syntax:
          `BasicRelativeXpathforGrandParent//grandchildTagname` 
        Example:
          `(//form[@id='login']//input)[3] `     

     4. GrandChild to GrandParent:
        Syntax:
            ` BasicRelativeXpathforGrandChild/ancestor::Grandparenttagname`   
        Example:
          `//input[@class='decorativeSubmit']/ancestor::form` 

     5. ElderCousin to YoungerCousin:
        Syntax:
           `BasicRelativeXpathforElderCousin/following::youngerCousintagname`   
        Example:
           `//span[text()='Company Name']/following::input  
           
     6. YoungerCousin to ElderCousin:
        Syntax:
            `BasicRelativeXpathforYoungerCousin/preceding::ElderCousintagname`   
        Example:
           `//input[@id='createLeadForm_firstName']/preceding::input[2] ` 


     7. ElderSibling to YoungerSibling:
        Syntax:      
           `BasicRelativeXpathforElderSibling/following-sibling::youngerSiblingtagname`
        Example:
           `//label[text()='Username']/following-sibling::input`
      
     8. YoungerSibling to ElderSibling:
        Syntax:
          `BasicRelativeXpathforYoungerSibling/preceding-sibling::ElderSiblingtagname`
        Example:  
           `//input[@id='username']/preceding-sibling::label`    
              `       
     
### Exceptions:
### InvalidSelectorException
1. **Definition**: 
   - This exception occurs when the format of a given selector is incorrect or unsupported. 
2. **Common Causes**:
   - Syntax errors in the selector string.
3. **Handling Tips**:
   - Double-check the syntax of your selector.
   

### NoSuchElementException
1. **Definition**: 
     - This exception is thrown when an element could not be found on the page.
     - It indicates that the search operation did not locate the element within the current webpage.
2. **Common Causes**:
     - The element does not exist on the page at the time of search.
     - The selector used does not correctly identify the desired element.
     - The element is not loaded yet due to web page's dynamic loading or delays.
3. **Handling Tips**:
   - Ensure the correctness of the selector.
   - Use waits ( implicit) to allow time for the element to load.
   
