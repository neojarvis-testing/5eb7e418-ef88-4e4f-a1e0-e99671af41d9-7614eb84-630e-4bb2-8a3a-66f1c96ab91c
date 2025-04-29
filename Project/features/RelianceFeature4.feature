Feature: Platform Test Cases for Home Page
  Scenario: User interacts with the Home Page options and performs actions
    When the "home page logo" is verified
    When the user4 hovers over the "Chains" section
    And the user4 verifies the "Silver" link is displayed
    When user4 clicks on the "Silver" link
    And verifiess the "Categories" text
    When user4 clicks on the "Gender" link
    When user4 clicks on the "Women" link
    And verify the "Women" text
    When user4 clicks on the "More Filters" link
    When user4 clicks on the "Try On Available" link
    When user4 clicks on the "Yes" checkbox
    And user4 verifies the "Yes" text
    And user4 clicks on the "first product" link
    And verifies the product code "508198" text
    Then user4 clicks on the "Buy Now" button
 
  Scenario: Validate all links and navigation on the Home Page
 
  When the user4 clicks on the "Why Reliance" link in the footer
    And the user4 verifies the "Why Reliance" page title
    And the user4 verifies the "Why Reliance" page and URL
 
    When the user4 clicks on the "Certifications" link in the footer
    And the user4 verifies the "Certifications" page title
    And the user4 verifies the "Certifications" page and URL
 
  When the user4 clicks on the "Media" link in the footer
  And the user4 verifies the "Media" page title
  And the user4 verifies the "Media" page and URL
 
 
  When the user4 clicks on the "Blogs" link in the footer
  And the user4 verifies the "Blogs" page title
  And the user4 verifies the "Blogs" page and URL
  When the user4 clicks on the "Track your order" link in the footer
  And the user4 verifies the "Track your order" page title
  And the user4 verifies the "Track your order" page and URL
 
  When the user4 clicks on the "FAQs" link in the footer
  And the user4 verifies the "FAQs" page title
  And the user4 verifies the "FAQs" page and URL
    Then the user4 verifies the presence of the keyword "Fast Shipping"