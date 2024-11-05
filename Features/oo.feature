Feature: Login with valid credentials
Scenario: Login with valid credentials
Given Open Chrome browser
And Open URL"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
When Login ID Login Password
And click on submit
Then Redirect to  Home page