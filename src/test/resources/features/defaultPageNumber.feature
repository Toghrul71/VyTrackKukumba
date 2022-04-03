
Feature: View car odometer info on Vehicles Odometer page
  Agile story:As a user, I want to view car odometer info on the Vehicles Odometers page.


  Scenario: Drivers can see the default page number as 1
    Given Drivers logged in using "user39" and "UserUser123" to the homepage
    And Click the "Vehicle Odometer" option under Fleet
    Then Verify if drivers can see the default page number as 1