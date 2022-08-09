Feature: Create a new actor
  The staff want add a new actor to the actors list

  Scenario: Staff member adds a new actor
    Given The actor does not already exist
    When The staff member submits the query
    Then The new actor should be added to the database