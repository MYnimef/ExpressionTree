import java.util.Stack;

public class InfixToPostfix {
    public static String get(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> operators = new Stack<>();
        
        for (char symbol: infix.toCharArray()) {
            // Переменная автоматически попадает в итоговую строку
            if (Character.isLetter(symbol)) {
                postfix.append(symbol);
            }
            // Открывающая левая скобка отправляется в стек
            else if (symbol == '(') {
                operators.push(symbol);
            }
            // Закрывающая правая скобка инициализирует выгрузку операторов из стека
            else if (symbol == ')') {
                // Достаем все операторы до открывающей правой скобки
                while (operators.peek() != '(') {
                    postfix.append(operators.pop());
                }
                // Удаляем оставшуюся закрывающую скобку из стека
                operators.pop();
            }
            // Технически, при правильном вводе формулы, этому условию соответсвуют лишь операторы
            else if (symbol != ' ') {
                // Пока стек не опустеет и пока мы не дойдем до открывающей скобки
                // и пока приоритет оператора в символе меньше, чем операторов в стеке
                while (!operators.isEmpty() &&
                        !(operators.peek() == '(') &&
                        priority(symbol) <= priority(operators.peek())) {
                    // Добавляем к итоговой строке все операторы, удаляя их из стека
                    postfix.append(operators.pop());
                }
                // Добавляем текущий оператор в стек
                operators.push(symbol);
            }
        }

        // Выгружаем оставшиеся операторы из стека в итоговый постфиксный вид формулы
        while (!operators.isEmpty()) {
            postfix.append(operators.pop());
        }

        return postfix.toString();
    }

    // Приоритет операций - чем больше значение - тем больше приоритет
    private static int priority(char x) {
        if (x == '+' || x == '-') {
            return 1;
        }
        return 2;
    }
}