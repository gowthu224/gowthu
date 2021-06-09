#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios

Feature: Login 
Scenario: Login into the application
Given User is on login page
When The user gives "gowthu224@gmail.com" and "AK@2504" in corresponding field and click on submit
Then user should be able to login succesfully

 Scenario Outline: Negative Login into the application
Given User is on login page
When The user gives "<username>" and "<password>" in corresponding field and click on submit
Then user should not be able to login succesfully.
Examples:
|username|password|
||AK@2504|
|gowthu||
|gowthu|AK|



