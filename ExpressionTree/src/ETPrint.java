public class ETPrint {
    public static String printExpression(ExpressionTree t) {
        if (!Operator.isOperator(t.getValue())) {
            return t.getValue() + "";
        } else {
            return "(" +
                    printExpression(t.getLeft()) +
                    " " +
                    t.getValue() +
                    " " +
                    printExpression(t.getRight()) +
                    ")";
        }
    }

    public static void printTree(ExpressionTree node, int level) {
        if (node != null) {
            printTree(node.getRight(), level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("   ");
            }
            System.out.println(node.getValue());
            printTree(node.getLeft(), level + 1);
        }
    }
}