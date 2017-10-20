$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("googleCalculator.feature");
formatter.feature({
  "line": 2,
  "name": "Calculations in google calculator",
  "description": "",
  "id": "calculations-in-google-calculator",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@googleCalc"
    }
  ]
});
formatter.before({
  "duration": 6258880185,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "",
  "description": "",
  "id": "calculations-in-google-calculator;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Navigate to www.google.com (Links to an external site.)Links to an external site. search for keyword: calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "On result page verify the calculator displayed",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Test the calculator with one set of data",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Get the data and operation from excel sheet to create data driven testing as you did in task 1.",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleCalculator.navigate_to_www_google_com_Links_to_an_external_site_Links_to_an_external_site_search_for_keyword_calculator()"
});
formatter.result({
  "duration": 3516108864,
  "status": "passed"
});
formatter.match({
  "location": "GoogleCalculator.on_result_page_verify_the_calculator_displayed()"
});
formatter.result({
  "duration": 54929541,
  "status": "passed"
});
formatter.match({
  "location": "GoogleCalculator.test_the_calculator_with_one_set_of_data()"
});
formatter.result({
  "duration": 2488243840,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 93
    }
  ],
  "location": "GoogleCalculator.get_the_data_and_operation_from_excel_sheet_to_create_data_driven_testing_as_you_did_in_task(int)"
});
formatter.result({
  "duration": 4615436562,
  "status": "passed"
});
formatter.after({
  "duration": 183090,
  "status": "passed"
});
});