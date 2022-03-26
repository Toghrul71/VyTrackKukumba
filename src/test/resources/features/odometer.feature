Feature: View car odometer info on Vehicles Odometer page
  Agile story:As a user, I want to view car odometer info on the Vehicles Odometers page.

  @wip
  Scenario: Managers can not have access to Vehicle Odometer

  Given Managers logged in using "salesmanager125" and "UserUser123" to the homepage
  And Click the "Vehicle Odometer" option under "Fleet"
  Then Verify managers see "You do not have permission to perform this action."


