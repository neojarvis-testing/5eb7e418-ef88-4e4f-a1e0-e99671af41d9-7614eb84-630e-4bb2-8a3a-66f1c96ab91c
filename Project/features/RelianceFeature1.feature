
Feature: Reliance Jewels
Background: user is on Reliance HomePage

Scenario Outline: Rings Module
When user1 click on "search field" textbox
And user1 enter value as "<ring input>"
And user1 verifies the entered "ring value"
When user1 click on "Gender" button
And user1 click on "Men" link
When user1 verifies "Men" click action
And user1 click on "Metal" button
And user1 click on "Gold" link
And user1 verifies "Gold" click action
When user1 click on "ring product" link
And user1 verifies "ring product" click action
Then user1 click on "cart" button
And user1 verifies "cart" text

Examples:
|ring input|
|Rings|


Scenario Outline: Necklace Module
When user1 click on "search field" textbox
And user1 enter value as "<necklace input>"
And user1 verifies the entered "necklace value"
When user1 hover on "first product"
And user1 click on "Quick view" button
And user1 verifies "Quick view" click action
And user1 click on "close" button
When user1 click on "first product" link
And user1 verifies "first product" click action
And user1 select "gross weight" from dropdown
When user1 click on "buy now" button
And user1 verifies "buy now" click action
Then user1 click on "proceed to pay" button
And user1 verifies "proceed to pay" click action

Examples:
|necklace input|
|Necklace|
