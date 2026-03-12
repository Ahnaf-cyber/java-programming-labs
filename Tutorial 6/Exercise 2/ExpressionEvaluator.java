import java.util.Stack;
import java.util.Scanner;

public class ExpressionEvaluator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String expression = input.nextLine();

        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (Character.isDigit(ch)) {
                operands.push(Character.getNumericValue(ch));
            } 
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                operators.push(ch);
            } 
            else if (ch == ')') {
                int b = operands.pop();
                int a = operands.pop();
                char op = operators.pop();

                int result = 0;
                switch (op) {
                    case '+': result = a + b; break;
                    case '-': result = a - b; break;
                    case '*': result = a * b; break;
                    case '/': result = a / b; break;
                }

                operands.push(result);
            }
        }

        System.out.println("Result: " + operands.pop());
        input.close();
    }
}
