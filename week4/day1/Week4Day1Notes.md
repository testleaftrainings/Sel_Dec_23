### Todays Agenda:
- Day1
    2:30 to 3:00 - List continuation
    3:00 to 3:45 - Collection - Set
    3:45 to 4:00 - Breakout
    4:00 to 4:15 - Break
    4:15 to 5:00 - Target Locators - Alert
    5:00 to 5:15 - Breakout
    5:15 to 6:00 - Frames
    6:00 to 6:15 - Breakout
    6:15 to 7:00 - Window Handling


### Waits:
  1. **ImplicitlyWait**
     - Global wait
     - It is a Selenium Wait
     - It affects all the findElement() and findElements() in a class
max-10
if the element is available in the dom within 2 secs
 - it will not wait for another 8s
 - it will proceed with the next findElement()
 - Even after the maximum duration of time -> if it couldnt find the element in the Dom
 - It will throw NoSuchElementException










### Collection: `Set`

#### Definition:
 - The `Set` interface in Java is a part of the Java Collections Framework. 
 - It represents a collection that cannot contain duplicate elements. 

#### Properties of `Set`:
1. **No Duplicate Elements**: Ensures that each element in the `Set` is unique.
2. **Unordered Collection**: Except for some specific implementations like `LinkedHashSet` or `TreeSet`, the `Set` does not guarantee the order of its elements.


#### Implementation Classes:

1. **HashSet**:
   - Maintains a random order

2. **LinkedHashSet**:
   - Maintains insertion order of elements.
   
3. **TreeSet**:
   - Maintains sorted order 

#### Why There is No `get()` in `Set`:
The `Set` interface does not have a `get()` method, and this is by design, due to the following reasons:
1. **Uniqueness Over Indexing**: The `Set` is designed to ensure uniqueness rather than maintain an index-based system like `List`. Elements in a `Set` are not accessed by an index.
2. **Undefined Ordering**: In most implementations of `Set`, the order of elements is not fixed. Therefore, retrieving an element by a specific index or position does not make sense.

### What is an Alert in Selenium?
 - An Alert in Selenium WebDriver is a small message box that appears on the screen to give the user information or ask for permission to perform an operation. 
 - It's typically a JavaScript-based window that can show warnings, ask for confirmations, or prompt for information.

### Why are Alerts Used?
Alerts are used in web applications to:
1. **Notify users**: Provide important information or warnings.
2. **Get confirmations**: Confirm user actions before proceeding.
3. **Collect input**: Gather information or feedback from users.

#### Types of Alerts

1. **Modal Alerts**: These are traditional JavaScript alerts that are not part of the HTML DOM.
   - **Simple Alert**: Displays an information message with an OK button.
   - **Confirmation Alert**: Presents a message with OK and Cancel buttons to accept or reject an option.
   - **Prompt Alert**: Offers an input field along with OK and Cancel buttons, allowing user input.

2. **Non-Modal Alert (Sweet Alert)**: These are more modern, customizable alerts that are part of the HTML DOM and can be inspected.

#### Handling Alerts in Selenium

- **Focus Transfer**: To interact with an alert, Selenium transfers focus to the alert box using `driver.switchTo().alert()`.
- **Return Type**: The return type for this operation is the `Alert` interface.
- **Implementation Class**: Selenium implements this functionality through the `RemoteAlert` class.

#### Alert Interface Actions
1. **accept()**: Clicks the 'OK' button on the alert.
2. **dismiss()**: Clicks the 'Cancel' button, used for dismissing the alert.
3. **getText()**: Retrieves the text displayed on the alert box.
4. **sendKeys(String keysToSend)**: Sends a string input to the alert, used in prompt alerts.

#### Special Case: Handling Sweet Alerts
- Sweet Alerts are part of the HTML content and can be handled like any other web element. They require standard methods for interacting with web elements, unlike traditional JavaScript alerts.

### Exceptions Related to Alerts in Selenium:
1. **NoAlertPresentException**: This exception is thrown when an operation is attempted on an alert, but there is no alert present.
2. **UnhandledAlertException**: This exception is thrown when there is an alert that Selenium is unable to handle, either because it wasn’t expected, or because the driver cannot interact with it.

### What is a Frame?
 - A frame is a part of a web page or browser window which displays content independent of its container, with its own scroll and navigation. 
 - It's essentially a document within a document, commonly used to embed a separate document within a web page.

### Why Handle Frames?
 - Frames must be handled because Selenium WebDriver operates on a single document context. 
 - If a web page contains frames, WebDriver cannot automatically access the content of these frames.
 - To interact with elements within a frame, WebDriver must switch to it explicitly.

### How to Identify a Frame?
 - Frames can be identified by right-clicking on the element and selecting "View Frame Source" for direct URLs or by searching for the `frame` or `iframe` tags within the HTML DOM.

### Structure of Frame
 - When you inspect a web page, you'll notice that the `frame` or `iframe` tags define the frame structure. Each frame will have its own HTML document, which can be navigated and manipulated independently of the main page.

### How to Handle Frames?
To handle frames, use the `switchTo()` method provided by WebDriver. 
- By index: `driver.switchTo().frame(int index)`
- By Name or ID: `driver.switchTo().frame(String nameOrId)`
- By Reference: `driver.switchTo().frame(WebElement frameElement)`

Once you're done with the frame and need to switch back to the main content, use:
- `driver.switchTo().defaultContent()`

And to switch to the immediate parent frame, use:
- `driver.switchTo().parentFrame()`

### How to Handle Nested Frames
- Nested frames are handled by switching into each frame sequentially. After interacting with the deepest frame, you need to switch back to the parent frame or main document to continue the automation tasks.
- For handling nested frames, you would use a sequence of `switchTo().frame()` calls to drill down into the nested structure, and use `switchTo().parentFrame()` or `switchTo().defaultContent()` to navigate back up.

### Exception:
 - `NoSuchFrameException` in Selenium is thrown when the WebDriver attempts to switch to a non-existent frame. - This can happen if the frame has been removed or if it never existed in the DOM at the point of the attempt. - It indicates that the specified frame is not present in the current page context, and the automation script needs to ensure that the frame name, ID, or reference being used to switch to is correct and available. 
 - This exception is a signal to check the frame's existence, its correct identification, or if the page has fully loaded before attempting to switch frames.


### Window Handling:

#### What is a Window Handle?
- A Window Handle is a unique identifier, a string, that Selenium WebDriver assigns to each open window or tab. It acts much like a unique address for a house, allowing WebDriver to navigate to and control a specific window.

#### Why Window Handles are Important
- Web applications can open multiple windows or tabs. 
- To perform actions on elements within these windows, Selenium needs to know which window to interact with. - - Window handles enable this by providing a unique ID for each window.

#### How to Handle Windows
- To handle windows, WebDriver provides two methods:
  - `getWindowHandle()`: Retrieves the ID of the current window.
  - `getWindowHandles()`: Retrieves a set of all open windows' IDs.
- To switch to a different window, the syntax is `driver.switchTo().window(windowHandle);` where `windowHandle` is the unique identifier of the target window.

#### Handling Multiple Windows
1. Retrieve the set of window handles using `driver.getWindowHandles()`.
2. Convert the set to a list to handle windows in a sequential manner.
3. Use the `driver.switchTo().window(windowHandle)` to switch control to the desired window.
4. After operations are completed, windows can be closed using `driver.close()`, and control can be switched back to the main window.

#### Practical Example
- A practical exercise involves navigating to a website, interacting with elements that open new windows, and then closing specific windows while keeping others open.

#### Summary
- Window handles are key to managing multiple browser instances in Selenium.
- They are used to switch focus between windows, allowing for interactions with web elements in multiple browser contexts.
- It is essential to handle window operations properly to avoid losing control of the browser session or leaving unwanted windows open.

#### Mind Map for Quick Reference
- The mind map visualizes the relationship between different window operations, their methods, and potential exceptions like `NoSuchWindowException`.

---

This document serves as a guide to understanding and implementing window handling strategies in Selenium WebDriver to manage multiple browser windows efficiently. 





   
  
