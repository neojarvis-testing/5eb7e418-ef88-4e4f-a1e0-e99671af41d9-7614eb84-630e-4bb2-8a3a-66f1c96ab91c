Feature: Verify Policies and Features on Reliance Jewels Website
  Scenario: Verify footer policy links, page titles, and key elements

    When user5 click on the "Return and Refund Policy" link in the footer

    And user5 verify the redirected "Return and Refund Policy" page title

    And user5 verify the "Return and Refund Policy" page URL

    And user5 click on the "Shipping policy" link in the footer

    And user5 verify the redirected "Shipping policy" page title

    And user5 verify the "Shipping policy" page URL

    And user5 click on the "Privacy policy" link in the footer

    And user5 verify the redirected "Privacy policy" page title

    And user5 verify the "Privacy policy" page URL

    And user5 click on the "Old Gold Exchange Policy" link in the footer

    And user5 verify the redirected "Old Gold Exchange Policy" page title

    And user5 verify the "Old Gold Exchange Policy" page URL 

    And user5 click on the "Fees and Payments policy" link in the footer

    And user5 verify the redirected "Fees and Payments policy" page title

    And user5 verify the "Fees and Payments policy" page URL

    And user5 click on the "Terms and Conditions" link in the footer

    And user5 verify the redirected "Terms and Conditions" page title

    And user5 verify the "Terms and Conditions" page URL 

    And user5 click on the "RelianceOne Loyalty T & C" link in the footer

    And user5 verify the redirected "RelianceOne Loyalty T & C" page title

    And user5 verify the "RelianceOne Loyalty T & C" page URL

    When user5 click on the "Disclaimer" link in the footer

    And user5 verify the redirected "Disclaimer" page title

    And user5 verify the "Disclaimer" page URL

    Then user5 verify the presence of the keyword "Call Back"
 
  Scenario: Select and filter Pendants for Kids

    When user5 hover on "Pendants" present on the navigation bar

    And user5 clicks on "Gifting" link

    Then user5 verify that the URL contains "pendant"

    And user5 click on "Gender" button

    And user5 clicks on the "Kids" link

    Then user5 verify the "label" of the resultant page

    When user5 click on the button "More Filters"

    And user5 clicks on "Type" button

    And user5 click on "Pendant" checkbox

    Then user5 verify the "pendant result page" title

    When user5 click on link "product"

    Then user5 verify the "product code"

    When user5 clicks on the "Add To Cart" button

    Then user5 verify the presence of keyword "Price"

 