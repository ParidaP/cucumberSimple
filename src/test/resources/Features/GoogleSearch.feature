 Feature: feature to test google search functionality

 Scenario: Validate google search is working 
 Given browser is open
 And user is on google search page
 When insert enters a text in search box 
 And hits enter
 Then user is navigate to search results
 