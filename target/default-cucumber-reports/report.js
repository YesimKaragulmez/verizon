$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\login\\login.feature");
formatter.feature({
  "name": "Smartphones feature",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@verizon"
    }
  ]
});
formatter.scenario({
  "name": "smartphones prices",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@verizon"
    }
  ]
});
formatter.step({
  "name": "user on the verizonwireless.com",
  "keyword": "Given "
});
formatter.match({
  "location": "Verizon_Step_Def.user_on_the_verizonwireless_com()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user hoverover on the phones",
  "keyword": "Then "
});
formatter.match({
  "location": "Verizon_Step_Def.user_hoverover_on_the_phones()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks the smartphones",
  "keyword": "And "
});
formatter.match({
  "location": "Verizon_Step_Def.clicks_the_smartphones()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user choose the galaksi note10+",
  "keyword": "And "
});
formatter.match({
  "location": "Verizon_Step_Def.user_choose_the_galaksi_note(Integer)"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003ca aria-label\u003d\"Samsung Galaxy Note10+\" href\u003d\"https://www.verizon.com/smartphones/samsung-galaxy-note-10-plus/\"\u003e...\u003c/a\u003e is not clickable at point (50, 423). Other element would receive the click: \u003cdiv class\u003d\"swiper-wrapper\"\u003e...\u003c/div\u003e\n  (Session info: chrome\u003d85.0.4183.121)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-3IAPGKF\u0027, ip: \u0027192.168.1.3\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.121, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\user\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:53738}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 5c12489fdc05f85de3d0d709068e9954\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat com.verizon.ui.login.step_def.Verizon_Step_Def.user_choose_the_galaksi_note(Verizon_Step_Def.java:49)\r\n\tat ✽.user choose the galaksi note10+(src\\test\\resources\\features\\login\\login.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user clicks the continue button",
  "keyword": "And "
});
formatter.match({
  "location": "Verizon_Step_Def.user_clicks_the_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user enter the zipcode",
  "keyword": "And "
});
formatter.match({
  "location": "Verizon_Step_Def.user_enter_the_zipcode()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user verify the price",
  "keyword": "Then "
});
formatter.match({
  "location": "Verizon_Step_Def.user_verify_the_price()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});