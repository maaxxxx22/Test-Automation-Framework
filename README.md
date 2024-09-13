# Test Automation Framework

A Java-based Test Automation Framework built using Selenium WebDriver, Cucumber, JUnit, and WebDriverManager. This framework supports Behavior Driven Development (BDD) and Test Driven Development (TDD) approaches for automating UI testing. The framework is easily extensible, allowing seamless integration with CI/CD pipelines like GitHub Actions.

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Setup](#setup)
  - [Step-by-Step Project Setup](#step-by-step-project-setup)
- [Running Tests](#running-tests)
  - [Using IntelliJ](#using-intellij)
  - [Using Maven CLI](#using-maven-cli)
- [CI/CD Integration](#cicd-integration)
- [Folder Structure](#folder-structure)
- [Contributing](#contributing)
- [License](#license)

## Features

- Supports BDD and TDD-based testing using **Cucumber** and **JUnit**
- Utilizes **Selenium WebDriver** for automating browser actions
- Automatic browser driver management with **WebDriverManager**
- Includes test reporting and logs
- Seamless integration with CI/CD pipelines (e.g., **GitHub Actions**)
- Cross-browser support for Edge, Chrome, and Firefox

## Prerequisites

Ensure you have the following installed:

- **Java Development Kit (JDK)** (Version 17+ recommended)
- **Maven** (Version 3.6+ recommended)
- **IntelliJ IDEA** (or any other IDE that supports Java and Maven)
- **Git** (optional, for version control and CI/CD integration)
  
## Setup

### Step-by-Step Project Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/your-repository.git
   cd your-repository

2. **Open the project in IntelliJ:**
   - Import the project as a Maven project to download dependencies.

3. **Configure Maven:**
   - Maven will automatically resolve and download dependencies as specified in the `pom.xml` file.

4. **Install WebDriverManager:**
   - WebDriverManager handles browser driver management, eliminating the need to manually download browser drivers like ChromeDriver or EdgeDriver.

5. **Run Initial Test:**
   - Use JUnit runner or Maven CLI (`mvn test`) to verify if the framework is set up correctly.

## Running Tests

### Using IntelliJ

1. **Run Feature Files:**
   - Navigate to the `src/test/resources/` directory, where `.feature` files are stored.
   - Right-click on the `.feature` file and select **Run**.

2. **Run Entire Test Suite:**
   - Open the `TestRunner.java` (or equivalent) file.
   - Click on the green run button in the IDE to execute the entire test suite.

### Using Maven CLI

1. **To run all tests, use:**
   ```bash
   mvn clean test

2. **To run a specific test or feature:**
   ```bash
   mvn test -Dcucumber.options="src/test/resources/login.feature"

## CI/CD Integration

This framework is designed to integrate with **GitHub Actions** for continuous integration and delivery. Follow these steps to set up CI:

### 1. Create GitHub Actions Workflow

In your repository, add a `.github/workflows/ci.yml` file with the following configuration:

```yaml
name: Java CI

on:
  push:
    branches:
      - main
  pull_request:
    branches:
      - main

jobs:
  build:
    runs-on: ubuntu-latest

    steps:
      - uses: actions/checkout@v3

      - name: Set up JDK 17
        uses: actions/setup-java@v3
        with:
          java-version: '17'
          distribution: 'temurin'

      - name: Install Dependencies
        run: mvn install

      - name: Run Tests
        run: mvn test



