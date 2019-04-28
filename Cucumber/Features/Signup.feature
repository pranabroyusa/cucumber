Feature: Sign Up



@SmokeTest 
Scenario Outline: Facebook Login 
Given I login Facebook 
	When I enter firstName <F_Name>
	Then I enter lastName <L_Name>
	Then I enter email <email>
	
	Examples: 
		|F_Name|L_Name|email|
		|"Prachi"|"Roy"|"prachi@yahoo.com"|
		|"Aditri"|"Roy"|"Aditri@yahoo.com"|
		
	