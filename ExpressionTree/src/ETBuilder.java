import java.util.Stack;

public class ETBuilder {
    public static ExpressionTree build(String postfix) {
        Stack<ExpressionTree> st = new Stack<>();

        for (char c : postfix.toCharArray()) {
            if (c != ' ') {
                ExpressionTree t = new ExpressionTree(c);
                if (Operator.isOperator(c)) {
                    t.setRight(st.pop());
                    t.setLeft(st.pop());
                }
                st.push(t);
            }
        }

        return st.pop();
    }
}