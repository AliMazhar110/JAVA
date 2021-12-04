package partTwo;

public class Main {
    public static void main(String[] args) {
        int number;
        for (String i : args) {
            try {
                number = validateNumber(i);
                System.out.println(number +"! = "+ factorial(number));
            } catch (ValidNumberException v) {
                System.out.println(v);
            } catch (NumberFormatException n) {
                System.out.println(n +" "+ n.getMessage());
            }
        }
    }

    private static int factorial(int number) {
        if (number == 0)
            return 1;
        return number * factorial(number - 1);
    }

    private static int validateNumber(String test) throws ValidNumberException {
        int number = Integer.parseInt(test);
        if (number < 0 || number > 12) {
            throw new ValidNumberException(
                    "Number out of range: "+ test);
        }
        return number;
    }
}

class ValidNumberException extends Exception {
    ValidNumberException(String s) {
        super(s);
    }
}

