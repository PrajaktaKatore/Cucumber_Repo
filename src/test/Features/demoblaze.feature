Feature:Demo site create account page should have verification on all the fields

Scenario Outline: All of the fields should display an error when not populated on form submission

Given    I am on the site homepage
When     I click on "Sign Up" on the "Home" Page
And      I enter "<email>" into user name field
And      I enter "<password>" into password field
Then     I click on "submit" 


Examples:
| name     	 |  email								| password	
| Prajakta   |	studymailid12@gmail.com				| abc@123	

