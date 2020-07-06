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

## How to run these tests?

Note: 
**This test framework uses `Junit` for running the tests**

### Steps to run tests in each test class:

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

## Components of Test Framework

### 1. Tests

Consists of:
- Task 1 -> cross browser test
- Task 2 -> filter black shoe test
- Task 3 -> navigate to product details page test

### 2. Actions 

Usually consists of logics and test-step function calls.

In this test framework, `actions` folder covers the following reusuable function calls:

- Filter black shoe in home page 
  - Handles test for all viewport sizes such as: 
    - Laptop, 
    - Tablet  
    - Mobile
    
- Tap on first black shoe & navigate to its details page

### 3. Test Data management

- #### Common Elements
  Consists of all common strings used in test framework across modern & traditional tests

- #### Common Driver Functions
  Consists of all driver command calls with webpage identifiers

### 4. Set up 

Consists of 

- Browser configurations 
- Open Eyes  
- Check by Region
- Check Full Window
- Test Report Generator
