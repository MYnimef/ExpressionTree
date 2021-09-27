import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter infix expression: ");
        String infix = in.nextLine();

        String postfix = InfixToPostfix.get(infix);
        System.out.println("Postfix expression is: " + postfix);

        ExpressionTree expressionTree = ETBuilder.build(postfix);
        ETPrint.printTree(expressionTree, 0);

        System.out.println("\nSolving the expression...");
        System.out.println("Result is " + ETSolve.solve(expressionTree, in));
    }
}