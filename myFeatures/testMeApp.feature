Feature: My validations on TestMe

	Scenario Outline: Login validation for multiple users
		Given testme is launched by user
		When user clicks on SignIn link
		Then user provides the valid username "<uname>"
		And user provides the valid password "<pass>"
		Then user clicks for submission of credentials
		And verifies the login status for the account
		
		Examples:
		| uname | pass |
		| Christ123 | Christ123 |
		| thanmay22 | friends |
		