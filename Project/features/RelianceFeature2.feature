Feature: Vivaham page functionality
Scenario: Exploring vivaham page actions
When user2 hover on "What's trending"
And user2 verify "Vivaham" is displayed
Then user2 click "Vivaham"
And user2 verify "Vivaham url" is displayed
When user2 click "Locate A Store"
And user2 select "Andhra Pradesh" from dropdown
And user2 select "Guntur" from dropdown
And user2 verify "Store Locator url"
When user2 click "Search"
And user2 switch to "main" window
When user2 scroll to "Delhi"
And user2 click "Delhi"
Then user2 verify "Delhi page title"
And user2 verify "Sort By"
 
Scenario: Diamond earrings Add to cart
When user2 hover over "earrings"
And user2 validate "METAL" text isDisplayed
Then user2 click over "Diamond"
And user2 verify "Diamond" text
When user2 click over "Gender"
And user2 validate "Gender" isExpanded
Then user2 click over "Women"
And user2 validate "Women" text isDisplayed
When user2 hover over "Popularity"
And user2 validate "New Arrivals" text isDisplayed
Then user2 click over "New Arrivals"
And user2 validates "New Arrivals" filter is applied
When user2 click over "First Product"
And user2 verify "Earrings" text
Then user2 click over "Add to cart"
And user2 verify "Other" text