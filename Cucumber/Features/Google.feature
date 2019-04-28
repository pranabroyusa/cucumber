Feature: Google Search

@GoogleTest
Scenario Outline: Seach an item

Given User navigate to google
When user enter an <Item>
When user click search
Then user click on

Examples: 
		|Item|
		|"cnn"|
		|"bbc"|
		
@FaceBookTest
Scenario: Signup Facebook

Given User navigate to facebook
When user fillup the field

|f_Name|l_Name|mobile|
|pranab|roy|34352455|
|pranab|roy|34352455|


@FaceBookMultipleDataTest
Scenario Outline: Signup Facebook

Given User navigate to facebook
When user fillup the fields <f_Name><l_Name><mobile>

Examples:
|f_Name|l_Name|mobile|
|"pranab"|"roy"|"34352455"|
|"chandan"|"basu"|"47766553"|



		

