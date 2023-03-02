@RegisterPassword
Feature: Password_strength

  Background:

    Given Go to home page
    When Click Signin button at the top
    Then Click Register button
    And I wait "10000" ms

  Scenario Outline: TC001_User enters 4 digit password
    When User enters four digit "<password>"
    Then Assert that Password strength line is in the first line

    Examples:
      | password |
      | abcd     |
      | ABCD     |
      | 1234     |
      | @#€$     |
      | Ab1$     |

#  Scenario Outline: TC002_User enters a 7 digit password with at least 1 uppercase
#    Then User enters seven digit "<password>" with at least one uppercase
#    Then Assert that Password strength line is in the second line
#
#    Examples:test data
#      | password |
#      | Abcdefg  |
#      | 1234Abc  |
#      | 123A$@€  |



#  Scenario Outline: TC003_User enters a 7 digit pasword with at least 1 uppercase, 1 lowercase, 1 digit
#    Then User enters seven digit "<password>" with at least one uppercase, one lowercase, one digit
#    Then Assert that Password strength line is in the forth line
#
#    Examples:test data
#      | password |
#      | aBCDEF3  |
#      | 12345aB  |


#  Scenario Outline: TC004git_User enters a 7 digit pasword with at least 1 uppercase, 1 lowercase, 1 digit and 1 special char
#    Then User enters seven digit "<password>" with at least one uppercase, one lowercase, one digit and one special char
#    Then Assert that Password strength line is in the fifth line
#
#    Examples:test data
#      | password |
#      | aBCDEFG  |
#      | 1234ABc  |
#      | 123a$@€  |