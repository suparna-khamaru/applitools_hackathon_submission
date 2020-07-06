# Applitools Hackathon Submission

This repository contains the following:
- “TraditionalTestsV1”  — traditional Test code for V1 of the app
- “TraditionalTestsV2”  — traditional Test code for V2 of the app 
- “ModernTestsV1”       — UFG Test code for V1 of the app 
- “ModernTestsV2”       — UFG Test code for V2 of the app 
- Traditional-V1-TestResults.txt  //Placed in the root folder
- Traditional-V2-TestResults.txt  //Placed in the root folder
- README.md – Details about how to execute test project 

## Aim

Goal of this test framework is to keep test-code:
- simple
- short
- readable
- optimised
- maintainable
- avoid duplication
- reusable

## Design Patterns & Principles

Each Test follows the following design patterns & principles in the test framework:
- AAA Pattern (Arrange, Act, Assert)
- POM Pattern (Page Object Model)
- DRY (Do not Repeat Yourself)

## Components of Test Framework

### 1. Tests

Consists of:
- Test 1 
- Test 2
- Test 3

### 2. Actions 

Usually consists of logics and test-step function calls.

In this test framework, `actions` folder covers the following reusuable function calls:
- Filter black shoe in home page 
  - Handles test for all viewport sizes such as: 
    - Laptop, 
    - Tablet  
    - Mobile
- Tap on first black shoe & navigate to its details page

### 3. Elements

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
