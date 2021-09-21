public class Operator {
    public static boolean isOperator(char c) {
        return c == '+'
                || c == '-'
                || c == '*'
                || c == '/'
                || c == '^';
    }

    public static double performOperation(double a, char op, double b) {
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            default -> 0;
        };
    }
}