@sanity
Feature: Facebook login page
  Scenario: Access facebook
    Given Facebook URL
    When I access facebook Url
    Then I land on facebook page

    Scenario: Verify email text box
      Given Facebook URL
      When I access facebook Url
      Then I see email text box

      Scenario: To verify if 'password' text box is displayed on the login page
        Given Facebook URL
        When I access facebook Url
        Then I see 'password' text box

  Scenario: To verify if 'login' button is present on the login page
    Given Facebook URL
    When I access facebook Url
    Then I see 'login' button

    Scenario: To verify if 'forgotten account?' link to reset account details is present on the login page
      Given Facebook URL
      When I access facebook Url
      Then I see link 'forgotten account?'
@signup
      Scenario: To verify if text box to enter 'first name' is available on the login page to create new account
        Given Facebook URL
        When I access facebook Url
        Then  I see text box to enter'first name'
  @signup
  Scenario: To verify if text box to enter 'Surname' is available on the login page to create new account
    Given Facebook URL
    When I access facebook Url
    Then  I see text box to enter'last name'
  @signup
  Scenario: To verify if text box to enter 'New Password' is available on the login page to create new account
    Given Facebook URL
    When I access facebook Url
    Then  I see text box to enter'new password'

  @signup
  Scenario: To verify if the drop down to choose date of birth is available on the login page to create new account
    Given Facebook URL
    When I access facebook Url
    Then  I see drop down to choose DOB'

  Scenario: To verify if 'sign up' button is available on the login page to create new account
    Given Facebook URL
    When I access facebook Url
    Then  I see 'Sign up' button



