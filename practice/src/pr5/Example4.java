package pr5;

import java.util.*;

public class Example4 {
    public static void main(String[] args) {
        double          leftOperand, result, rightOperand;
        String          leftString, operator, rightString, expression;
        StringTokenizer expressionTokenizer, st;
        Scanner         in = new Scanner(System.in);

        System.out.println("give expressionsInvalid syntax (for example: 45.0+4.1 3.2*9.1):");

        expressionTokenizer = new StringTokenizer(in.nextLine(), " ");

        while (expressionTokenizer.hasMoreTokens()) {
            expression = expressionTokenizer.nextToken(); 
            
            st = new StringTokenizer(expression, "+-*/", true);

            try {
                leftString  = st.nextToken();
                operator    = st.nextToken();
                rightString = st.nextToken();

                try {
                    leftOperand = Double.parseDouble(leftString);
                } catch (NumberFormatException nfe) {
                    System.out.println("error: '" + leftString + "' isnt number");
                    continue; 
                }

                try {
                    rightOperand = Double.parseDouble(rightString);
                } catch (NumberFormatException nfe) {
                    System.out.println("error: '" + rightString + "' isnt number");
                    continue;
                }

                if (operator.equals("+"))      result = leftOperand + rightOperand;
                else if (operator.equals("-")) result = leftOperand - rightOperand;
                else if (operator.equals("*")) result = leftOperand * rightOperand;
                else if (operator.equals("/")) result = leftOperand / rightOperand;
                else                           result = 0.0;

                System.out.println("result " + expression + " = " + result);

            } catch (NoSuchElementException nsee) {
                System.out.println("Invalid syntax in: " + expression);
            }
        }
        in.close();
    }
}
