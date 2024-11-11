## Description

This project represents a Test Automation Framework, primarily focused on web testing using Selenium and the Page Object Model (POM). The main components are organized as follows:

### Core Package
- `BaseApiService.java`: Contains base methods for API services.
- `BaseApiTest.java`: Includes common setup and teardown methods for API tests.
- `BaseWebPage.java`: Contains base methods for web page interactions.
- `BaseWebTest.java`: Includes common setup and teardown methods for web tests.

### Enums Package
- `BrowserMode.java`: Enum for different browser modes (e.g., headless, normal).
- `BrowserType.java`: Enum for supported browser types.
- `FrameworkSettings.java`: Enum for framework configuration settings.
- `Driver.java`: Class for managing the WebDriver instance.
- `DriverManager.java`: Manages WebDriver creation and lifecycle.
- `PropertiesManager.java`: Manages framework properties and configurations.

### Resources
The `resources` folder configuration files, test data, or other non-Java resources.

### Test
The `test` folder is where test classes would be placed, following a similar package structure as the `main` folder.

## Usage
This framework is designed for web testing using Selenium and follows the Page Object Model (POM) approach for better test maintainability and scalability. 
To get started with the framework, extend the provided base classes in the test folder and utilize the POM structure for creating test cases. The framework supports various browser modes (headless and normal) and configurations, making it easy to run tests across different environments.
