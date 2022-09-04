@tag
Feature: In this feature calculating numbers


	Background:
		Given I am background
	
  @tag1 @Regression @Smoke
  Scenario: Add two integer number and verify result
    Given I have two interger values 3 and 4
    When I add both values
    Then I verify result is 7

	@tag1 @Regression
  Scenario Outline: Add two integer number and verify result using data driven
    Given I have two interger values <FirstValue> and <secondValue>
    When I add both values
    Then I verify result is <result>

    Examples: 
      | FirstValue | secondValue | result |
      |          3 |           5 |      8 |
      |         10 |          11 |     21 |
      |          4 |          10 |     15 |
      |         10 |          20 |     30 |

    Examples: 
      | FirstValue | secondValue | result |
      |         10 |          15 |     25 |
