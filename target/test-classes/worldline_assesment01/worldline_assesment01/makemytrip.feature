Feature: New user on Makemytrip

  Scenario: Create a new user via the https://www.makemytrip.com/railways/irctc-create-account.html
    Given I will navigate to the Admissions Portal login page
   	Then I click the Create an Account link
    Then I will be on the Register page
    Given I have entered a Title
    And I have entered a First Name
    And I have entered a Surname
   	And I have entered a Date of Birth
    And I have entered a Gender
    And I have entered an Email
    And I have entered a Mobile
    And I have entered a Password
    And I have entered a Password Reminder Question
    And I have entered a Password Reminder Answer
    Then I have entered residential address
    And I have entered pincode
    Then I have entered alternate number
    When I click on the Create Account button
    Then User should display error message
    
    
