# Selenium Java First Project

This repository contains a Selenium WebDriver automation practice project built with Java, Maven, and TestNG.  
The project is created as part of learning Selenium automation, browser interactions, and test execution using IntelliJ IDEA.

It includes multiple automated UI tests against demo websites and covers common Selenium scenarios such as alerts, frames, windows, keyboard actions, date pickers, and element interactions.

---

## Technologies Used

- Java 21
- Selenium WebDriver
- TestNG
- Maven
- IntelliJ IDEA
- Chrome Browser
- Selenium Manager (for automatic driver handling)

---

## 📁 Project Structure

```text
selenium-java-first-project
│
├── src
│   ├── main
│   │   └─ java
│   │       ├── com
│   │       │   ├── base
│   │       │   │    └─ BasePage.java     
│   │       │   ├── demoqa.pages
│   │       │   │    ├── alerts_frames_windows
│   │       │   │    │    │── Alerts_Frames_WindowsPage.java 
│   │       │   │    │    │── AlertsPage.java
│   │       │   │    │    │── BrowserWindowsPage.java
│   │       │   │    │    │── FramesPage.java
│   │       │   │    │    └── ModalDialogsPage.java
│   │       │   │    ├── elements
│   │       │   │    │    │── DynamicPropertiesPage.java
│   │       │   │    │    │── ElementsPage.java
│   │       │   │    │    │── LinksPage.java
│   │       │   │    │    │── TextBoxPage.java
│   │       │   │    │    └── WebTablesPage.java
│   │       │   │    ├── forms     
│   │       │   │    │    │── FormsPage.java
│   │       │   │    │    └── PracticeFormPage.java
│   │       │   │    ├── widgets
│   │       │   │    │    │── DatePickerMenuPage.java
│   │       │   │    │    │── ProgressBarPage.java
│   │       │   │    │    │── SelectMenuPage.java
│   │       │   │    │    │── SliderPage.java
│   │       │   │    │    └── WidgetsPage.java     
│   │       │   │    └── HomePage.java
│   │       │   └── saucedemo.pages
│   │       │        ├── LoginPage.java
│   │       │        └── ProductsPage.java
│   │       └── utilities
│   │            │── ActionsUtility.java
│   │            │── DropDownUtility.java
│   │            │── GetUtility.java
│   │            │── JavaScriptUtility.java
│   │            │── SwitchToUtility.java
│   │            │── Utility.java
│   │            └── WaitUtility.java            
│   └── test
│       └── java
│           │── part1
│           │    │── FirstSeleniumTes.java
│           │    └── LogInShouldFailTest.java
│           │── part2.com.saucedemo
│           │    │── base
│           │    │    └── BaseTest.java
│           │    └── tests
│           │         │── login
│           │         │    └── LoginTests.java
│           │         └── products
│           │              └── Products.java
│           │── part3_4.com.demoqa
│           │    │── base
│           │    │    └── BaseTest.java
│           │    └── tests
│           │         │── part3
│           │         │    │── elements
│           │         │    │    │── LinksTest.java                           
│           │         │    │    └── LoginTests.java
│           │         │    │── forms
│           │         │    │    │── CheckboxTest.java
│           │         │    │    └── RadioButtonTest.java
│           │         │    │── javascript      
│           │         │    │    └── JavaScriptTest.java
│           │         │    └── widgets
│           │         │         │── DateTest.java
│           │         │         └── SelectDropDownTests.java
│           │         └── part4
│           │              │── alerts                           
│           │              │    └── AlertsTest.java
│           │              │── dynamic_wait
│           │              │    └── DynamicWaitTests.java
│           │              │── frames      
│           │              │    └── FramesTes.java
│           │              │── interactions
│           │              │    │── KeyboardTest.java
│           │              │    └── SliderTest.java
│           │              │── modals
│           │              │    └── ModalTest.java
│           │              │── screenshot      
│           │              │    └── CapturreFailedScreenshotTest.java
│           │              └── windows
│           │                   └── WindowsTest.java
├── resources   
│   └── screenshots
│
├── pom.xml
├── .gitignore
└── README.md
```

---
## What this Project Covers
- Browser setup and teardown
- Page Object–like structure
- Keyboard actions
- Alerts handling
- Frames & windows handling
- Date picker interaction
- Explicit waits for stability
- Screenshot capturing
- TestNG test execution

---

## How to Run the Tests

1. Open the project in IntelliJ
2. Wait for Maven dependencies to load
3. Navigate to src/test/java
4. Right-click any test class
5. Click Run

---

## Purpose Of The Project

This project is intended for:
- Practicing Selenium WebDriver with Java
- Understanding test structure with TestNG
- Building a public learning portfolio on GitHub

--- 

## Author

**<i>Arber Zylyftari</i>**
- **GitHub:** https://github.com/arberzylyftariGIT
