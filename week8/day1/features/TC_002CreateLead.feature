Feature: CreateLead functionality of Leaftaps Application

#Background:
#Given Launch the Browser
#And Load the url

@Smoke
Scenario Outline: Create Lead with multiple data
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then HomePage should be displayed
When Click on crmsfa link
And Click on Leads Link
And Click on Create Lead Link
Given Enter the companyname as <companyname>
And Enter the firstname as <firstname>
And Enter the lastname as <lastname>
When Click on the CreateLead button
Then ViewLeadPage should be displayed as <companyname>

Examples:
|companyname|firstname|lastname|
|TestLeaf|Subraja|S|
|Qeagle|Princilla|R|


