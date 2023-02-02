Feature: Search

  Scenario: Successful search
    Given Ciceksepeti homepage
    When çs or extra "extra"
    When search "cicek"
    And click "searchbutton"
    Then check search result

  Scenario: Past searches and searchbar remove button
    Given Ciceksepeti homepage
    When   çs or extra "extra"
    When search "cicek"
    And click "searchbutton"
    When click "searchbar"
    And click "removebutton"
    And click "searchbar"
    And click "pastsearch"
    Then check search result

  Scenario: Empty search
    Given Ciceksepeti homepage
    When   çs or extra "extra"
    When click "searchbutton"
    Then check search pop up
    And click "emtypopupbutton"

  Scenario: Past searches clear button
    Given Ciceksepeti homepage
    When   çs or extra "extra"
    When search "cicek"
    And click "searchbutton"
    When click "searchbar"
    And click "removebutton"
    And click "searchbar"
    When click "cleanbutton"
    And click "searchbar"
    Then Check Past searches

  Scenario: successful search press ENTER
    Given Ciceksepeti homepage
    When   çs or extra "extra"
    When search "cicek"
    And press "enter"
    Then check search result

  Scenario: search suggest noresult
    Given Ciceksepeti homepage
    When   çs or extra "extra"
    When search "...."
    Then check noresult

  Scenario: search suggest show all button
    Given Ciceksepeti homepage
    When   çs or extra "extra"
    When search "ayakkabı"
    And click "showallbutton"
    Then check search result

  Scenario: suggest search
    Given Ciceksepeti homepage
    When   çs or extra "extra"
    When search "ayakkabı"
    And click "suggest"
    Then check search result


