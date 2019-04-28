Feature: Facebook login feature 

@RegressionTest 
Scenario Outline: Faceebook Login 

	Given I login Facebook 
	When I enter userName <Userid1> 
	Then I enter passWord <Password1> 
	Then I click submit
	
	Examples: 
		|Userid1|Password1|
		|"user1"|"test1"|
		

		
		
	
