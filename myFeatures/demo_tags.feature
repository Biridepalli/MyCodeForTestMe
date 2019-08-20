Feature: Understanding of tags

@Smoke @Sanity
Scenario: Login validation on flipkart
Given Application is up and running
Then User able to login

@Regression
Scenario: User access to items in the portal
Given User searching the product with code
Then User able to add it to cart

@Smoke
Scenario: User access to remove from cart
Given User able to see items count in cart
Then User decides to remove an item

@Sanity
Scenario: User wanted to track the order
Given User has active order
Then User verifies the status of the order



