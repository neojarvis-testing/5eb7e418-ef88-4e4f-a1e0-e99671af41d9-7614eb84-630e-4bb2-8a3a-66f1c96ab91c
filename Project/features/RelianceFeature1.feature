Feature: Reliance Jewels

Scenario Outline: Rings Module
Given user1 is on Reliance Home Page
When user1 click on "search"
And user1 enters value as "<ring input>"
And user1 verifies the entered "value"
And user1 click on "Gender"
And user1 click on "Men" 
And user1 verifies "Men text"
And user1 click on "Metal"
And user1 click on "Gold"
And user1 click on "ring product"
Then user1 clicks on "cart"

Examples:
|ring input|
|Rings| 


Scenario Outline: Necklace Module
When user1 click on the "search"
And user1 enter value as "<necklace input>"
And user1 hover on "product"
And user1 click on the "Quick View"
And user1 click on the "Close"
And user1 click on the "necklace product"
And user1 click on the "Buy now"
Then user1 clicks on the"proceed to pay"

Examples:
|necklace input|
|Necklace|