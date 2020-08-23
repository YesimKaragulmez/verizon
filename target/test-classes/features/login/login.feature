@verizon
Feature:Smartphones feature

  Scenario: smartphones prices
    Given user on the verizonwireless.com
    Then user hoverover on the phones
    And clicks the smartphones

    And user choose the Auro glow colour
    And user clicks the continue button
    And user enter the zipcode
    Then user verify the price