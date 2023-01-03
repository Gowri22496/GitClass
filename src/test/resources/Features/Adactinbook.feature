Feature: Verifying Adactin Booking Confirmation Details

  Scenario Outline: Verifying Adactin Booking Confirmation with valid order id display
    Given User is on the login page
    When User should enter "<username>", "<password>"
    And User should click the login button
    And User should search hotel select for Location, Hotels, Room Type
    And User should click the search button
    And User should select hotel and click the select radio button
    And User should click the continue button
    And User should Book A Hotel "<First Name>", "<Last Name>", "<Billing Address>", "<Credit Card No.>", next select the Credit Card Type, Expiry Date, "<CVV Number>"
    And User should click the Book Now
    Then User should print the valid Order No. display

    Examples: 
      | username  | password     | First Name | Last Name | Billing Address | Credit Card No.  | CVV Number |
      | Gowrimaya | Gowri@224996 | Gowri      | G         | Chennai         | 4554644222244444 |        564 |
      | Gowrimaya | Gowri@224996 | Maya       | M         | Chennai         | 4554644224444444 |        561 |
      | Gowrimaya | Gowri@224996 | Viji       | V         | Chennai         | 4554644554444444 |        555 |
      | Gowrimaya | Gowri@224996 | Sudha      | S         | Chennai         | 4554646644444444 |        465 |
      | Gowrimaya | Gowri@224996 | Lakshmi    | L         | Chennai         | 4554654444444444 |        565 |
      | Gowrimaya | Gowri@224996 | Poorani    | P         | Chennai         | 4554642244444444 |        896 |
      | Gowrimaya | Gowri@224996 | Vijay      | V         | Chennai         | 4554644444334444 |        564 |
      | Gowrimaya | Gowri@224996 | Nandhini   | N         | Chennai         | 4554644334444444 |        865 |
      | Gowrimaya | Gowri@224996 | Pooja      | P         | Chennai         | 4554644444445555 |        556 |
      | Gowrimaya | Gowri@224996 | Malathi    | M         | Chennai         | 4554644444222244 |        693 |
