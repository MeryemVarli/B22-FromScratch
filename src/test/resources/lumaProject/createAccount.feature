Feature: Create account functionality

  Scenario Outline: Happy path
    Given user is on main page of luma user clicks on create account button
    When user is on create account page user enters name as '<firstName>' and lastname as '<lastName>'
    And user enters email as '<email>' and password as '<password>' and confirm password as '<confirmPassword>'
    Then user clicks on create account button and validates success message as '<successMessage>'
    Examples: test data for luma
    |firstName|lastName|email|password|confirmPassword|successMessage|
    |meryem   | Nowak  |mer@gmail.com|test.123|test.123 |Thank you for registering with Main Website Store.|





#