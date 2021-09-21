public class ExpressionTree {
    private final char value;
    private ExpressionTree left, right;

    ExpressionTree(char value) {
        this.value = value;
        left = right = null;
    }

    public char getValue() { return value; }

    public ExpressionTree getLeft() { return left; }
    public void setLeft(ExpressionTree left) { this.left = left; }

    public ExpressionTree getRight() { return right; }
    public void setRight(ExpressionTree right) { this.right = right; }
}