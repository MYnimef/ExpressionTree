import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //String postfix = "ab+ef*g*-";
        //String postfix = "a b + e f * g * -";
        System.out.print("Enter postfix expression: ");
        String postfix = in.next();
        System.out.println("Postfix expression is: " + postfix);

        ExpressionTree expressionTree = ETBuilder.build(postfix);
        ETPrint.printTree(expressionTree, 0);

        System.out.print("Expression is: ");
        System.out.print(ETPrint.printExpression(expressionTree));

        System.out.println("\nSolving the expression...");
        System.out.println("Result is " + ETSolve.solve(expressionTree, in));
    }
}