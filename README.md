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
```

### 2. Commit the Changes

Once you have created the `.yml` file, push it to your repository to enable GitHub Actions:

```bash
# Add the workflow file to Git
git add .github/workflows/ci.yml

# Commit the changes
git commit -m "Added GitHub Actions for CI"

# Push the changes to the main branch
git push origin main
```

### 3. View CI Results

After pushing the changes to GitHub, you can monitor the status of your CI pipeline:

1. Navigate to the **Actions** tab in your GitHub repository.
2. Select the latest workflow run.
3. View the logs and results of the pipeline to ensure all tests have passed successfully.

This allows you to verify that your tests run automatically with every code change.

## Folder Structure

```bash
TestAutomationFramework/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/
│   │   │       └── pages/          # Page Object classes
│   │   └── resources/
│   ├── test/
│   │   ├── java/
│   │   │   └── steps/              # Step definitions for Cucumber
│   │   ├── resources/
│   │   │   ├── features/           # Cucumber .feature files
│   │   │   └── cucumber.properties # Cucumber config
│   └── pom.xml                     # Maven POM file with dependencies
│
├── .gitignore                       # Git ignore file
├── README.md                        # Project README
└── .github/workflows/ci.yml         # GitHub Actions CI configuration
```

## Contributing

We welcome contributions! Feel free to fork this repository, make your changes, and create a pull request. Before contributing, please ensure:

1. Your changes pass all tests.
2. You follow best practices for code structure and comments.
3. Tests are included for any new features or bug fixes.

## Author

- [**Okunta Braide**](https://github.com/maaxxxx22)  

## License

This project is licensed under the MIT License.







