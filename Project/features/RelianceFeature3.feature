
Feature:  Drops Page Functionality

  Scenario: User navigates through Drops page and completes purchase workflow

    When the user3 validates the "logo" of reliance

    And the user3 hovers over "Earrings" on menubar

    When the user3 clicked on "Drops" under Earrings

    And the user3 verifies  "Dropstitle" in dropsresult

    When the user3 clicks on "Categories" in result page

    And the user3 selects "Gold" under category

    Then user3 verifies text "MoreFiltersText" for filter

    When the user3 clicked  filter "More Filters"

    And the user3 verifies text "MetalpurityText" under MoreFilters

    And the user3 selected "Metal Purity" under MoreFilters

    When the user3 selects purity "22Kt purity" under metalPurity

    And user verifies the text "22ktText" under Metalpurity

    And user3 clicked on the "first product" in results page

    When the user3 verified the "keyfeatures" text

    And the user3 clicked upon "Buy Now" in product page

    Then the screenshot is taken
 
 
  Scenario: User navigates through Platinum page and completes purchase workflow

    When user3 validated the reliance "logo"

    And  user3 hovers on "Rings"

    When  user3 clicks  "Casual Wear"

    And  user3 verifies the "casualWearURL"

    When  user3 clicks upon "Categories"

    And  user3 selects "Platinum" category

    And the user verifies the filter text "Filters"

    When  user3 clicks on "More Filters" filter

    And user3 verifies available text "Availabletext"

    And  user3 selects "Available" available

    And user3 verifies the yes text "Yestext"

    When user3 clicks "Yes" yes

    And user3 clicked the "first product" product

    And user3 verifies the product text "product"

    When user3 clicked the buy option "Buy Now"

    Then user3 takes screenshot

 