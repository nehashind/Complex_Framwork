@tag
Feature: This feature to test registartion process
 

  @tag1
  Scenario: page one valid test for correct user data
  * As a user,i want to open "chrome" browser
  * As a user i want to enter "https://www.knowledgeware.in/final.html" url
  * AS a user i want to enter "Neha" using locator type "name"with value "name"
  * AS a user i want to enter "piyush" using locator type"name"with value "password"
  * AS a user i want to enter "piyush" using locator type "name"with value "confirmpassword"
  * AS a user i want to click button using locator type "linkText"with value "LOGIN"
  * AS a user i want to i want to validate page title "Reg2"