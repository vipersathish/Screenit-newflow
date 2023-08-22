Feature: Test Screenit functionality

  Scenario Outline: check the Screenit functionality of the SelectedFlow
    Given Open browser as "<BROWSER>"
    And User enter the Url as "<URL>"
    When user enter the email as "<EMAIL>" and password as "<PASSWORD>"
    And click the login button
    Then navigate to the homepage
    When click the uploadID button
    And upload job description as "<FILE>"
    Then click the submit button
    And select the candidate year as "<YEARS>"
    And select the candidate month as "<MONTHS>"
    When select the primary skills as "<PRISKILLS>"
    And select the secondary skill as "<SECSKILLS>"
    And user enter the jobdescription as "<JD>"
    Then user enter the Remark as "<REMARK>"
    And click the post button
    When click the profile button
    Then navigate to the candidateprofilepage
    And click the SelectInterviewer icon
    #Then Search the interviewer as "<SEARCHINTERVIEWER>"
    And click Done button
    When click the uploadResume
    And upload the candidateresume as "<RESUME>"
    Then click Submit button
    And verify the status
    When click the setavailability button
    And click the Select date button
    And choose select date as "<DATE>"
    Then choose select time as "<TIME>"
    And choose select sec as "<SEC>"
    Then choose suffix as "<SUFFIX>"
    And verify the candidate status
    Given open new tab
    When enter the url as "<GMAILURL>"
    And enter the email id as "<GMAILID>"
    And click Next button
    Then enter the password as "<GMAILPASSWORD>"
    Then click signin button
    And click the SentItem
    Then click the scheduleRequest
    When click the link
    

    Examples: 
      | BROWSER | URL                              | EMAIL                  | PASSWORD         | FILE                                                                                                 | YEARS   | MONTHS   | PRISKILLS | SECSKILLS   | JD                                  | REMARK | RESUME                                                                                        | DATE | TIME | SEC | SUFFIX | GMAILURL                         | GMAILID           | GMAILPASSWORD  |
      | chrome  | https://demo.screenit.io/#/Login | sathish151@screenit.in | Viper@Sathish151 | C:\\Users\\TTS-USER\\workspace\\com.TrueTech.ScreenIT.NewFlow\\sample\\samplejd\\Java Developer.docx | 5 years | 3 months | Core Java | Spring Boot | i am good in framework construction | good   | C:\\Users\\TTS-USER\\workspace\\com.TrueTech.ScreenITFlow.DDD\\sample\\samplejd\\Sathish.docx |   12 |   11 |  30 | am     | https://outlook.office.com/mail/ | genie@screenit.io | 56ohsQivC4nyFR |
      #| chrome  | https://demo.screenit.io/#/Login | sathish151@screenit.in | Viper@Sathish151 | C:\\Users\\TTS-USER\\workspace\\com.TrueTech.ScreenIT.NewFlow\\sample\\samplejd\\Java Developer.docx | 7 years | 7 months | Core Java | Spring Boot | i am good in framework construction | good   | C:\\Users\\TTS-USER\\workspace\\com.TrueTech.ScreenITFlow.DDD\\sample\\samplejd\\Sathish.docx |
