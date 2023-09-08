import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// class that has methods for converting a parenthesized expression from infix to postfix and a separate method for evaulating that postfix expression.
// suffers from int division errors unfortunately
class ArithmeticExpressionEvaluator {
    public static void main(String[] args) throws IOException {
        ArithmeticExpressionEvaluator evaluator = new ArithmeticExpressionEvaluator();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 
        String infix = reader.readLine();
        System.out.println("infix: " + infix);

        String[] input = infix.split(" ");
        ArrayList<String> postfix = evaluator.infixToPostFix(input);
        
        System.out.println("postfix:");
        for(String s : postfix){
            System.out.print(" " + s);
        }
        System.out.println();

        int result = evaluator.evalulatePostFix(postfix);
        System.out.println("result: " + result);
    }
    ArrayList<String> infixToPostFix(String[] data){
        Stack<String> postFixStack = new Stack<String>();
        Stack<String> opsStack = new Stack<String>();
        for(int i = 0; i < data.length; i++){
            if(data[i].equals("+") || data[i].equals("-") || data[i].equals("*") || data[i].equals("/")){
                // saving operations for later. This will take ( a + b ) and convert it to ab+
                opsStack.push(data[i]);
            } else if(data[i].equals("(") || data[i].equals(" ")){
                continue;
            } else if(data[i].equals(")")){
                // "saving operations for later" by only pushing them once we run into a closing parenthesis
                postFixStack.push(opsStack.pop());
            } else {
                postFixStack.push(data[i]);
            }
        }
        return postFixStack.toArrayList();
    }
    int evalulatePostFix(ArrayList<String> infix){
        Stack<Integer> evalStack = new Stack<Integer>();

        for(int i = infix.size()-1; i >= 0; i--){
            String elem = infix.get(i);
            if(elem.equals("+") || elem.equals("-") || elem.equals("*") || elem.equals("/")){
                // pop 2 most recent elements and eval them
                int num1 = evalStack.pop();
                int num2 = evalStack.pop();
                if(elem.equals("+"))evalStack.push(num1 + num2);
                else if(elem.equals("-"))evalStack.push(num1 - num2);
                else if(elem.equals("*"))evalStack.push(num1 * num2);
                else evalStack.push(num1 / num2);
            } else {
                // otherwise its a number
                evalStack.push(Integer.parseInt(elem));
            }
        }
        return evalStack.pop();
    }
    // void evaluatePostFix(String[] data){
    //     for(int i = 0; i < data.length; i++){
    //         if(data[i].equals("+") || data[i].equals("-") || data[i].equals("*") || data[i].equals("/"))operationsStack.push(data[i]);
    //         else if(data[i].equals("("))continue;
    //         else if(data[i].equals(")")){
    //             String operation = operationsStack.pop();
    //             int num1 = numbersStack.pop();
    //             int num2 = numbersStack.pop();
    //             if(operation.equals("+"))numbersStack.push(num1 + num2);
    //             else if(operation.equals("-"))numbersStack.push(num1 - num2);
    //             else if(operation.equals("*"))numbersStack.push(num1 * num2);
    //             else numbersStack.push(num1 / num2);
    //         }
    //         else numbersStack.push(Integer.parseInt(data[i]));
    //     }
    //     System.out.println(numbersStack.pop());
    // }
}