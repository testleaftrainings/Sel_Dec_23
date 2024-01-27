Feature: Login functionality of Leaftaps Application

#Background:
#Given Launch the Browser
#And Load the url

@Smoke
Scenario: Login with positive credentials
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then HomePage should be displayed

@Functional @Regression
Scenario: Login with invalid credentials
Given Enter the username as 'Demosales'
And Enter the password as 'crmsfa'
When Click on the Login button
But ErrorMessage should be displayed

