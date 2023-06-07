import java.util.Scanner;

public class PasswordStrength {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        scanner.close();
        
        int length = password.length();
        boolean hasUpperCase = !password.equals(password.toLowerCase());
        boolean hasLowerCase = !password.equals(password.toUpperCase());
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecialChar = password.matches(".*[^a-zA-Z0-9].*");
        
        int strength = 0;
        
        if (length >= 8) {
            strength += 2;
        }
        if (hasUpperCase && hasLowerCase) {
            strength += 2;
        }
        if (hasDigit) {
            strength += 1;
        }
        if (hasSpecialChar) {
            strength += 1;
        }
        
        if (strength >= 5) {
            System.out.println("Password is very strong!");
        } else if (strength >= 3) {
            System.out.println("Password is strong!");
        } else if (strength >= 2) {
            System.out.println("Password is moderate!");
        } else {
            System.out.println("Password is weak!");
        }
    }
}
