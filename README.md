
- Interactive Quiz**: Get questions dynamically loaded from a REST API.
- Password Checker**: Check the strength of your password.
- Email Validator**: Check if your email is valid.

---

## Requirements:
To get started, make sure you have the following installed on your system:
- Java 17 or higher**
- Maven 3.6+**
- Internet connection** (for downloading dependencies)

---

## How to Use:

### 1. Clone the Project:
First, download the project:
```bash
git clone <repository-url>
cd <repository-folder>

2. Build the Project:
Use Maven to set up the project:
./mvnw clean install

3. Run the Application:
Start the app:
./mvnw spring-boot:run

Backend Code (src/main/java):
QuizController.java: Provides the quiz questions through a REST API.
WebController.java: Handles rendering of the Thymeleaf HTML pages.
Frontend Templates (src/main/resources/templates):
home.html: The main page.
password.html: The password strength check page.
email.html: The email validation page.
quiz.html: Displays the quiz questions.
Static Files (src/main/resources/static/css):
CSS: Custom styles for the UI.

Running Tests:

To test the app, simply run:
./mvnw test
