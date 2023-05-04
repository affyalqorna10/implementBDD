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
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@EditProfile
Feature: Edit profile picture
  Upload file Edit profile

  @tag
  Scenario Outline: User edits their profile picture
  	When The user navigates to My Info
  	And User clicks on the Current Profile Picture
    And User upload the <file>
    And User click save
    Then User success change picture profile
    
        Examples: 
      | file  |
      | /keyboard.jpg |