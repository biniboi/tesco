@search
Feature: Groceries Search
	
  In order to find grocerie items
  As a user
  I want to be able to search using the search functionality
      
    Scenario: Using search button only
      Given I'm on the homepage
      When I click search button
      Then I should see Please enter a search term alert message
    
    Scenario Outline: Empty Search
      When user search for <InvalidSearchTerms>
      Then the results should indicate, No result found
	  Examples:
      | InvalidSearchTerms  | 
      | "lorem Ipsum"       | 
	  
    Scenario Outline: Spell mistake
      When user search for <SpellMistakeSearchTerms>
      Then search page should be updated and indicate We didn't find any products to match X
	  Examples:
      | SpellMistakeSearchTerms  | 
      | "Orangee"       | 
	  
	Scenario Outline: Search for groceries
      When user search for <SingleSearchTerms>
      Then search page should be updated and indicate X amount results for product found
	  Examples:
      | SingleSearchTerms  | 
      | "Orange"         | 
	  
	Scenario Outline: Multi search
      When user search for <MultiSearchTerms>
      Then search page should be updated and indicate X and X amount results for product found
	  Examples:
      | MultiSearchTerms  | 
      | "Orange; Apple"         | 
  
    