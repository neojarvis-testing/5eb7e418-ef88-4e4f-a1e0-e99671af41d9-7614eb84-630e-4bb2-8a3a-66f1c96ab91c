Feature: Platform Test Cases for Home Page

  Scenario: User interacts with the Home Page options and performs actions
    Given the user4 is on the Home Page
    When the Home Pagee logo is verified
    And the user4 hovers over the "Chains" section
    And clickss on the "Silver" option
    And verifiess the "Categories" text
    And clickss on the "Gender" option
    And clickss on the "Women" option
    And clickss on the "More Filters" option
    And clickss on the "Try On Available" option
    And clickss on the "Yes" option
    And clickss on the "first product"
    And verifiess the product code "508198"
    And clickss on the "Buy Now" button
    Then a screenshot is taken, the actions are logged, and the operations are reported successfully

  Scenario: Validate all links and navigation on the Home Page
    Given the user4 is on Reliance Jewels home page
    When the user4 clicks on the "About Us" link in the footer
    And the user4 verifies the "About Us" page title
    And the user4 verifies the "About Us" page and URL

    When the user4 clicks on the "Why Reliance" link in the footer
    And the user4 verifies the "Why Reliance" page title
    And the user4 verifies the "Why Reliance" page and URL

    When the user4 clicks on the "Certifications" link in the footer
    And the user4 verifies the "Certifications" page title
    And the user4 verifies the "Certifications" page and URL

  When the user4 clicks on the "Our Showrooms" link in the footer
  And the user4 verifies the "Our Showrooms" page title
  And the user4 verifies the "Our Showrooms" page and URL

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

    Then the user4 verifies the presence of the keyword "Call Back" 
