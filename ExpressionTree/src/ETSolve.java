import java.util.Scanner;

public class ETSolve {
    public static double solve(ExpressionTree t, Scanner in) {
        char c = t.getValue();

        if (!Operator.isOperator(c)) {
            System.out.print("Enter " + c + ": ");
            return in.nextDouble();
        } else {
            return Operator.performOperation(solve(t.getLeft(), in), c, solve(t.getRight(), in));
        }
    }
}