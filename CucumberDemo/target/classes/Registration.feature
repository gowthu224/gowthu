Feature: Registration process
Scenario: Registering into an application
Given User is on login page
When The user gives the details
|user|Gowthami|
|Password|12345|
|Mobile|984***7489|
|Company|CG|
And The user enters submit
Then user should be able to login succesfully

