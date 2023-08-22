Feature: HRMsApplication

  Scenario: User Registeration
    Given user is on registration page
    When user enter the deatils
      | sathish | kumar  | sath@gmail.com | 266272283 | chennai |
      | baskar  | sankar | bas@gmail.com  | 788988928 | eraiyur |
    Then user successfully register
