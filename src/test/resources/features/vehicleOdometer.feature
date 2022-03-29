@wip
Feature: View car odometer info on Vehicles Odometer page
  Agile story:As a user, I want to view car odometer info on the Vehicles Odometers page.
  Scenario: Drivers should see the view per page is 25 by default
    Given Drivers logged in using "user39" and "UserUser123" to the homepage
    And Click the "Vehicle Odometer" option under Fleet
    Then Verify if drivers can see the view per page is 25 by default