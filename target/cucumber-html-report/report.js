$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/LostPassport.feature");
formatter.feature({
  "line": 1,
  "name": "Reporting lost or stolen passport",
  "description": "  As an Automation Test Team\n  In order to test the lost or stolen user interface \n  I want a web driver project driven by BDD story",
  "id": "reporting-lost-or-stolen-passport",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Connect to LSR ui",
  "description": "",
  "id": "reporting-lost-or-stolen-passport;connect-to-lsr-ui",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "an instance of \"firefox\" browser",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "the url \"https://www-preprod-lsr.pex.ips.gov.uk/\" is opened",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the lost or stolen user interface is presented",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "the user clicks start now",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "selects child under 16 and clicks continue",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "enters valid name and telephone number",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "clicks submit",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "firefox",
      "offset": 16
    }
  ],
  "location": "LostorStolenStepDefinitions.anInstanceOfBrowser(String)"
});
formatter.result({
  "duration": 3709690392,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www-preprod-lsr.pex.ips.gov.uk/",
      "offset": 9
    }
  ],
  "location": "LostorStolenStepDefinitions.theUrlIsOpened(String)"
});
formatter.result({
  "duration": 1296437736,
  "status": "passed"
});
formatter.match({
  "location": "LostorStolenStepDefinitions.theLostOrStolenUserInterfaceIsPresented()"
});
formatter.result({
  "duration": 145132709,
  "status": "passed"
});
formatter.match({
  "location": "LostorStolenStepDefinitions.theUserClicksStartNow()"
});
formatter.result({
  "duration": 596278854,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "16",
      "offset": 20
    }
  ],
  "location": "LostorStolenStepDefinitions.selectsChildUnderAndClicksContinue(int)"
});
formatter.result({
  "duration": 688587353,
  "status": "passed"
});
formatter.match({
  "location": "LostorStolenStepDefinitions.entersValidNameAndTelephoneNumber()"
});
formatter.result({
  "duration": 217271184,
  "status": "passed"
});
formatter.match({
  "location": "LostorStolenStepDefinitions.clicksSubmit()"
});
formatter.result({
  "duration": 712481159,
  "status": "passed"
});
formatter.match({
  "location": "LostorStolenStepDefinitions.closeTheBrowser()"
});
formatter.result({
  "duration": 83298385,
  "status": "passed"
});
});