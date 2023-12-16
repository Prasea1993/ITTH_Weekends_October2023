Feature: To validate the consultation Observation


  @ConsultationObservation
  Scenario: To validate the patient registration with valid data
    Given user launches the application
    And user enters the "superman" and "Admin123" and click on login button
    Then user should be able to login to the app
    And user click on clinical button on home screen
    And user clicks on "Chandrika ITTH"
    And clicks on Consultation
    And select "20-12-2023" and "general checkup" and clicks on save