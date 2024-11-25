class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "InvalidAgeException: " + getMessage();
    }
}

class AgeValidator {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 120) {
            throw new InvalidAgeException("Age must be between 0 and 120.");
        }
    }
}

public class InvalidAgeExceptionDemo {
    public static void main(String[] args) {
        int age = 125;

        try {
            AgeValidator.validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
