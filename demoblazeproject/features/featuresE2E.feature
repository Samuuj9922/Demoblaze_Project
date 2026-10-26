Feature: DemoBlaze Website Flow

   Scenario: To verify User sign up successfully
   Given launched demoblaze website
 	When user enter username
  	And user enter password
  	Then signup should be successful
  
  
  
  Scenario: To verify User log in successfully
  Given launched demoblaze website
  	When user enters username 
  	And user enters password
  	Then login should be successful
  	 
  
  
  Scenario: To verify products are added to cart
  Given launched demoblaze website
  	When user clicks on phones
  	And click on add to cart
  	Then product should be added in cart
  
  
  
  Scenario: To verify user logs out successfully
  Given launched demoblaze website
    When user clicks on log out
    Then user should log out