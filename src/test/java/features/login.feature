 Feature:  Login into Application.
 
 Scenario Outline: Positive Test Validating Login.

 Given  Initialize the browser with Chrome
 And navigate to "https://www.facebook.com/" site
 And click on login link in home page to land on secure signin page.
 When User enter <username> and <password> and logs in
 Then Verify that User is successfully logged in.
 And close all the browsers.
     
 
Examples:
|username|                |password|
|anishayohannan@yahoo.com|     |9447963478|
|gghh@gg.com|                  |4556|