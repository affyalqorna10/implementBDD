$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "\tContains several test case related to login feature",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@test"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Positive"
    }
  ]
});
formatter.step({
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User input \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "User click login",
  "keyword": "And "
});
formatter.step({
  "name": "User is on dashboard",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario outline",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@test"
    },
    {
      "name": "@Positive"
    }
  ]
});
formatter.step({
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "login.on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User input Admin and admin123",
  "keyword": "When "
});
formatter.match({
  "location": "login.input_login_credentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click login",
  "keyword": "And "
});
formatter.match({
  "location": "login.click_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "login.on_dashboard()"
});
formatter.result({
  "status": "passed"
});
});