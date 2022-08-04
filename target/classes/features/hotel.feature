Feature: Hotel booking automation

  Scenario: opening hotel page
    Given open the homepage
    When click on hotel
    And click on search
    And click on a hotel
    And click on book this now
    And fill details
    And click pay now
    Then Assert pay now


