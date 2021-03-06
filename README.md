# Applitools Hackathon Submission

This repository contains the following:
- `TraditionalTestsV1`  —> traditional Test code for V1 of the app
- `TraditionalTestsV2`  —> traditional Test code for V2 of the app 
- `ModernTestsV1`     —> UFG Test code for V1 of the app 
- `ModernTestsV2`      —> UFG Test code for V2 of the app 
- `Traditional-V1-TestResults.txt`  -> Placed in the root folder
- `Traditional-V2-TestResults.txt`  -> Placed in the root folder
- `README.md` –> Details about how to execute test project 

## Aim

Goal of this test framework is to keep test-code:
- test visually using `Eyes` framework
- simple
- short
- readable
- optimised
- maintainable
- reusable (to avoid test code duplication)

## Design Patterns & Principles

Each Test follows the following design patterns & principles in the test framework:
- `AAA Pattern` (Arrange, Act, Assert)
- `POM Pattern` (Page Object Model)
- `DRY`principle (Do not Repeat Yourself)

## Instructions: How to run the tests?

Note: 
**This test framework uses `Junit5` for running the tests**

- Did not integrate with maven

### Steps to run tests in each test class:

#### Set up in ECLIPSE:

- Import the test project in Eclipse IDE 

- Used JRE: `JAVA SE 14` (Older version of JRE may not be compatible with this test project)

	(In project -> Right click on "JRE System Library" -> Select 'Properties' -> Select "Environment" button -> Select JRESE-14 in the list -> Check the same on the right side of the compatible JREs window -> Apply and close -> Select radio button "Execution Environment" and choose JRE14 again from the list -> Apply & close)

- Add external JAR files such as `Selenium`, `Junit 5`, `Eyes` into your project
	(Build path -> Configure Build path -> 'Libraries' tab -> "Add External Jars" button -> Add all jars -> Apply & close)
	
	Download the selenium & eyes jars from here: https://jar-download.com/artifact-search/eyes-selenium-java3 
	
	Download `JUnit5 jars`: 
	Add JUnit5 library to build path (make sure to crosscheck presence of org.hamcrest.core jar exists in junit5 jars) 
	(If JUnit5 is undetected, hover over any @Test annotation in test class, and click on "Add Junit5 library to Build path")

### Run tests with any of the below mentioned 2 approaches:

#### 1st Approach 

1. Go to "AllTestSuite" test class
2. Right click on the test class "AllTestSuite"
3. Select `Run as` 
4. Click on `Junit Test`

#### 2nd Approach

First run the v1 test classes using traditional & modern approaches:

 1. Go to any v1 test class (such as: TraditionalTestsV1, ModernTestsV1) 
 2. Right click on test class 
 3. Select `Run as` 
 4. Click on `Junit Test`

When both v1 test classes are run using both the above modern & traditional approaches, run the below: 

 1. Go to any v2 test class (such as: TraditionalTestsV2, ModernTestsV2) 
 2. Right click on test class 
 3. Select `Run as` 
 4. Click on `Junit Test`

Analyse the generated test results in dashboard & local files

### Steps to run traditional tests across different viewport sizes:

1. Go to classes: TraditionalTestsV1 / TraditionalTestsV2
2. In each of the class instance variables, update the below values for different viewport sizes and run junit tests each time. 

- public static String browser = "Chrome";  
- public static String viewport = "768x700";         // 1200x700 | 768x700 | 500x700
- public static String device = "Tablet";            // Laptop   | Tablet  | Mobile
- public static RectangleSize viewportSize = new RectangleSize(768, 700);  // 1200x700 | 768x700 | 500x700

3. After each test run, test report shall be locally generated/updated with latest test result in the txt file automatically. 

## Components of the Test Framework

### 1. Tests

Consists of:

- Task 1 
	- cross browser test
	- Fails the test, when search icon or search bar is incorrectly displayed in any viewport size

- Task 2 
	- filter black shoe test
	- Fails the test, when count of black shoes exceeds 2 (In ideal case, this should be mocked for accuracy)

- Task 3 
	- product details test 
	- Fails the test, when product details such as shoe size & large image is incorrectly displayed


Other features of JUnit utilised in test classes are:

- @BeforeClass  - to run `before all tests` in the class 
- @AfterClass   - to run `after all tests` in the class 
- @Before 	- to run `before every test` in the class
- @After	- to run `after every test` in the class 


### 2. Actions 

Consists of beautiful `reusable logics`.

In this test framework, `actions` package covers the following reusuable function calls:

- `Filter black shoe` in home page is correctly working for all viewport sizes such as: 
    - Laptop
    - Tablet  
    - Mobile
    
- Tap on first black shoe & navigate to its details page

- Verify `search bar / search icon` is correctly displayed in: 
    - Laptop
    - Tablet  
    - Mobile

- Verify the `count` of black shoes displayed on filtering black shoe

- Verify the default `shoe-size` & `large shoe image` displayed in product details page

### 3. Test Data management

#### Common Elements
  Consists of all the `expected common strings` used in test framework across modern & traditional tests

#### Common Driver Functions
  Consists of all the commonly used `selenium web driver command calls with webpage identifiers` used in modern & traditional tests

### 4. Set up 

Consists of 

- Browser configurations 
- Check 
	- by Region
	- Full Window
- Test Report Generator


DASHBOARD URL for Test Results:
https://eyes.applitools.com/app/test-results/00000251808165066526/?accountId=h-V_AQvpwESjB4eFLnNTtg~~
