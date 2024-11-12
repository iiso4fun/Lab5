
---
## Spring Boot Quiz App

This is a simple app made with Spring Boot. It lets you take a quiz, check if your password is strong, and verify if your email is correct. The app uses Thymeleaf to show the pages and REST APIs to get the quiz questions.

 ## What It Can Do:
- API for Quiz: Get quiz questions and answers in JSON format.
- Web Pages: Uses Thymeleaf to show the pages you see in your browser.
- AJAX: Loads quiz questions without needing to refresh the page.
- Password Strength Check: Tells you if your password is strong enough.
- Email Validation: Checks if the email you entered is in the right format.

---

 ## Prerequisites:
Before you start, make sure you have these:
- Java 17 or higher.
- Apache Maven 3.6+.
---

## Project Structure:
Here’s how the project is organized:

src/main/java: This folder has the Java files that control the app and its behavior.
src/main/resources/templates: This folder holds the pages (HTML files) that make up the user interface.
src/main/resources/static/css: This folder has the style files (CSS) that make the app look good.
pom.xml: This file helps Maven set up the project and manage dependencies.


## Getting Started

1. Clone the Repository

$ git clone <repository-url>
$ cd <repository-folder>
2. Build the Project

Use Maven to set up the project and download everything it needs to run.

$ ./mvnw clean install
3. Run the Application

To run the Spring Boot application:

$ ./mvnw spring-boot:run


---

## Folder Structure

- Controllers: Manages how the app talks between the user interface and the backend.
  - QuizController.java: Handles the quiz questions.
  - WebController.java: Shows the pages on the screen.

- Templates: Contains the pages the user sees (HTML files).
  - home.html: The homepage.
  - password.html: Page for checking password strength.
  - email.html: Page for checking if an email is correct.
  - quiz.html: Page with the quiz questions.

- Static Files: Contains style files (CSS) that make the pages look nice.

---


## Resources Used
Spring Boot: A tool that helps build the backend of the app and manage its functions.
Thymeleaf: A tool that helps create the web pages you see in the app.
AJAX & jQuery: Used to get quiz data from the server and show it on the page without reloading.
Bootstrap: A tool that makes the app’s web pages look nice and neat.


Running Tests

To run the unit tests:

$ ./mvnw test
