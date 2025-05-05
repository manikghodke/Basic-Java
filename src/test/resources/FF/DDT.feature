Feature: Test Login

  @smoke
  Scenario Outline: Test Login
    Given Test Login page
    When Test Enter <username> and <password>
    And Test Click on login button
    Then Test Landed on homepage
    
    Examples:
    |username|password|
    |user1|password1|
    |standard_user|secret_sauce|
    