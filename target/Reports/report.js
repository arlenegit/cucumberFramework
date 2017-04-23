$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featureFirst.feature");
formatter.feature({
  "line": 1,
  "name": "My first feature",
  "description": "",
  "id": "my-first-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "My first scenario",
  "description": "",
  "id": "my-first-feature;my-first-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open Google search page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I search for cucumber",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see some results",
  "keyword": "Then "
});
formatter.match({
  "location": "FirstFeatureTest.i_open_Google_search_page()"
});
formatter.result({
  "duration": 37065721037,
  "status": "passed"
});
formatter.match({
  "location": "FirstFeatureTest.i_search_for_cucumber()"
});
formatter.result({
  "duration": 588361358,
  "status": "passed"
});
formatter.match({
  "location": "FirstFeatureTest.i_should_see_some_results()"
});
formatter.result({
  "duration": 3065048992,
  "status": "passed"
});
});