Feature: Vivaham page functionality
Scenario: Exploring vivaham page actions
Given user2 is on Reliance Jewels page
When user2 hover on "What's trending"
And user2 click "Vivaham"
And user2 verify "Vivaham url"
And user2 click "Locate A Store"
And user2 verify "Store List Page"
And user2 select "Andhra Pradesh" from dropdown
And user2 select "Guntur" from dropdown
And user2 verify "Store Locator url"
And user2 click "Search"
And user2 switch to "main" window
#verify url of home window
And user2 scroll "Delhi"
And user2 click "Delhi"
And user2 verify "Delhi page title"
Then user2 verify "Sort By"

Scenario: Diamond earrings Add to cart
Given user2 is on Reliance Jewels page
When user2 hover over "earrings"
And user2 click over "Diamond"
And user2 verify "Diamond" text
And user2 click over "Gender"
And user2 click over "Women"
And user2 hover over "Popularity"
And user2 click over "New Arrivals"
#verify if results are filtered
And user2 click over "First Product"
And user2 verify "Earrings" text
And user2 click over "Add to cart"
Then user2 verify "Other" text