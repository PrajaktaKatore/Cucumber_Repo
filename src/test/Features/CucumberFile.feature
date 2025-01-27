Feature: Amazon create account page should have verification on all the fields

Scenario Outline: All of the fields should display an error when not populated on form submission

Given    I am on the site homepage
When     I click on "sign in link" on the "Home" Page
And      I click on "register" on the "Sign In" Page
And      I enter "tesT@test.com" into all the fields on the page
And      I clear the "<field>" field on the Create Account Page
And      I click on "submit" on the "Create Account" Page
Then     the "<error>" on the "create Account" Page should be "visible"

Examples:
| field     	 | error							|
| name      	 | missing_name_error				|
| email			 | missing_email_error			    |
| password		 | missing_password_error			|
| confirm_passwd | missing_confirm_password_error	|