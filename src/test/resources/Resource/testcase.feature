Feature: Validate launch site
  Scenario Outline: 
  Given Launch site using "chrome"
    Then enter user id as '<x>'
    And enter valid password as '<y>'
    Then click on signin
    Then click on departed

    Examples: 
      | x               | y      | 
      | igi@zestiot.io  | igi@zestiot.io |
     