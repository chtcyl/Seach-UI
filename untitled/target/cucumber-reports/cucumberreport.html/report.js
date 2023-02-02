$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/testing/Search.feature");
formatter.feature({
  "name": "Search Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "successful search",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Ciceksepeti homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCases.MyStepdefs2.ciceksepetiHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "çs or extra \"extra\"",
  "keyword": "When "
});
formatter.match({
  "location": "TestCases.MyStepdefs2.çsOrExtra(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search \"cicek\"",
  "keyword": "When "
});
formatter.match({
  "location": "TestCases.MyStepdefs2.search(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click search button",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.MyStepdefs2.clickSearchButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check search result",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCases.MyStepdefs2.checkSearchResult()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Past searches and searchbar remove button",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Ciceksepeti homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCases.MyStepdefs2.ciceksepetiHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "çs or extra \"extra\"",
  "keyword": "When "
});
formatter.match({
  "location": "TestCases.MyStepdefs2.çsOrExtra(java.lang.String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d97.0.4692.99)\n  (Driver info: chromedriver\u003d97.0.4692.71 (adefa7837d02a07a604c1e6eff0b3a09422ab88d-refs/branch-heads/4692@{#1247}),platform\u003dMac OS X 11.2.0 arm64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 6 milliseconds\nBuild info: version: \u00272.48.2\u0027, revision: \u002741bccdd10cf2c0560f637404c2d96164b67d9d67\u0027, time: \u00272015-10-09 13:08:06\u0027\nSystem info: host: \u0027techmac122.local\u0027, ip: \u0027127.0.0.1\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002711.2\u0027, java.version: \u002718.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{mobileEmulationEnabled\u003dfalse, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, hasTouchScreen\u003dfalse, platform\u003dMAC, acceptSslCerts\u003dfalse, goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:61927}, webauthn:extension:credBlob\u003dtrue, acceptInsecureCerts\u003dfalse, webStorageEnabled\u003dtrue, browserName\u003dchrome, takesScreenshot\u003dtrue, javascriptEnabled\u003dtrue, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, unexpectedAlertBehaviour\u003dignore, applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d97.0.4692.71 (adefa7837d02a07a604c1e6eff0b3a09422ab88d-refs/branch-heads/4692@{#1247}), userDataDir\u003d/var/folders/8y/grlb68mj4cs_84kvmfkqpm6d3sz2dc/T/.com.google.Chrome.BkohnD}, takesHeapSnapshot\u003dtrue, pageLoadStrategy\u003dnormal, strictFileInteractability\u003dfalse, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d97.0.4692.99, browserConnectionEnabled\u003dfalse, proxy\u003d{}, nativeEvents\u003dtrue, locationContextEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 1f3bdb98f0c7f6f0221734ee619680e1\n*** Element info: {Using\u003dxpath, value\u003d//*[text()\u003d\u0027İzin ver\u0027]}\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:67)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:483)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:206)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:158)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:647)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:378)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementsByXPath(RemoteWebDriver.java:494)\n\tat org.openqa.selenium.By$ByXPath.findElements(By.java:356)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElements(RemoteWebDriver.java:341)\n\tat Step.braze.braze(braze.java:18)\n\tat TestCases.MyStepdefs2.çsOrExtra(MyStepdefs2.java:45)\n\tat ✽.çs or extra \"extra\"(file:///Users/cihat.cayli/IdeaProjects/untitled/src/test/java/testing/Search.feature:12)\n",
  "status": "failed"
});
formatter.step({
  "name": "search \"cicek\"",
  "keyword": "When "
});
formatter.match({
  "location": "TestCases.MyStepdefs2.search(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click search button",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.MyStepdefs2.clickSearchButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click searchbar",
  "keyword": "When "
});
formatter.match({
  "location": "TestCases.MyStepdefs2.clickSearchbar()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click removebutton",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.MyStepdefs2.clickRemovebutton()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click searchbar",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.MyStepdefs2.clickSearchbar()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click past search",
  "keyword": "And "
});
formatter.match({
  "location": "TestCases.MyStepdefs2.clickPastSearch()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "check search result",
  "keyword": "Then "
});
formatter.match({
  "location": "TestCases.MyStepdefs2.checkSearchResult()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Empty search",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Ciceksepeti homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "TestCases.MyStepdefs2.ciceksepetiHomepage()"
});
