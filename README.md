# Password Strength Checker

This is a simple Java program that evaluates the strength of a password based on certain criteria.

## Getting Started

These instructions will help you compile and run the password strength checker program on your local machine.

### Prerequisites

Make sure you have Java Development Kit (JDK) installed on your machine.

### Usage

1. Clone the repository or download the source code files.
2. Open a terminal or command prompt and navigate to the project directory.
3. Compile the Java file using the following command:

 ```bash
 javac PasswordStrength.java
  ```
4. Run the program using the following command:

 ```bash
 java PasswordStrength
  ```

5. You will be prompted to enter a password. Type the password and press Enter.

6. The program will evaluate the strength of the password based on the following criteria:
- Length: A password with a length of 8 or more characters receives 2 points.
- Uppercase and lowercase letters: A password containing both uppercase and lowercase letters receives 2 points.
- Digits: A password containing at least one digit receives 1 point.
- Special characters: A password containing at least one special character receives 1 point.

7. The program will display the strength of the password:
- If the strength is 5 or higher, it is considered "very strong."
- If the strength is between 3 and 4 (inclusive), it is considered "strong."
- If the strength is 2, it is considered "moderate."
- If the strength is less than 2, it is considered "weak."

## Example

```bash
Enter a password: MyPassword123
Password is very strong!
```


## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.








