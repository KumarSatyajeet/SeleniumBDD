Feature: Google Search functionality
 Scenario: Google search validation
   Given browser is open
   And User is on google search page
   When user enter a text in search bar
   And hits enter
   Then user is navigated to search results