#Author: your.email@your.domain.com

@tag
Feature: Test case of Demo_Blaze application

  @tag1
  Scenario: To verify the URL for Demo_blaze on Google browser
  Given user opens the browser
  When user navigates to Demo_Blaze application
  Then verify home page is displayed
  And close the browser
  
  
   @tag1
  Scenario: To verify whether the site displays Greetings to the user
  Given user opens the browser
  When user navigates to Demo_Blaze application
  Then Verify if landing page is 'PRODUCT STORE'
  And close the browser
  
  
  @tag1
  Scenario: To verify that the user redirects to the sign up page
  Given user opens the browser
  When user navigates to Demo_Blaze application
  Then Verify if landing page is 'PRODUCT STORE'
  When I click on 'LinkSignUpButton'
  Then I should see the 'LinkSignUpPopup' present on the page
  And close the browser
  
  @tag123
  Scenario Outline: To verify  that the user enters the valid user name
  Given user opens the browser
  When user navigates to Demo_Blaze application
  Then Verify if landing page is 'PRODUCT STORE'
  When I click on 'LinkSignUpButton'
  Then I should see the 'LinkSignUpPopup' present on the page
  And login with user '<username>' and password '<password>'
  When I click on 'BtnSignUp' button
  And close the browser
  
  Examples:
  |username|password|
  |TEST111  |Welcome123|
  |TEST121  |Welcome999|
  