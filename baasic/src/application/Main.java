package application;
	
import java.util.Stack;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import model.Functions;
import model.Utility;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	private static double result;
	private static Stack<Double> st = new Stack<>();
	
	/**
	 * postfix evaluating when an operator
	 * @param ch
	 */
	public static void postfixEvaluation(char ch) {	
		double tmp = 1,val1 = st.pop();	
		switch(ch) {
			case '+' : tmp = val1+st.pop();
			case '-' : tmp = val1-st.pop();
			case '*' : tmp = val1*st.pop();
			case '/' : tmp = val1/st.pop();
			case '^' : tmp = Math.pow(val1, st.pop());
			case '%' : tmp = val1%st.pop();
			case '!' : tmp = Functions.factorial((long)val1);
		}
		st.push(tmp);
	}
	
	/** The infixToPostfix method that converts given infix expression
	* to postfix expression.
	*/
	public static double infixToPostfix(String exp)
	{	
		st.clear();
		
		double db,tmp;
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i<exp.length();i++) {
			
			char c = exp.charAt(i);
			
			if (!Utility.isOperator(c)) {
				db = 0.0;
				tmp = 10;
				boolean flag = false;
				while(Character.isDigit(c)||c=='.') {
					
					if(c=='.') {
						flag = true;
						tmp = 1.0;
						continue;
					}
					
					if(!flag) {
						db *= tmp;
						db += (int)(c) - 48;
					}
					else {
						tmp /= 10.0;
						db += ((double)((int)c - 48))*tmp;
					}
					i++;
					if(exp.length()>=i) break;
					c = exp.charAt(i);
				}
				i--;
				st.push(db);
			}
			else if (c == '(') stack.push(c);
			else if (c == ')'){
				while (!stack.isEmpty() && stack.peek() != '(') postfixEvaluation(stack.pop());
				stack.pop();
			}
			else {
				while (!stack.isEmpty() && Utility.Prec(c) <= Utility.Prec(stack.peek())) postfixEvaluation(stack.pop());
				stack.push(c);
			}
		}
		
		while (!stack.isEmpty()) postfixEvaluation(stack.pop());

		return st.pop();
	}
	public static void main(String[] args) {
		//launch(args);
//		n += 1.0;
//		System.out.println(n);
//		String exp = "a+b*(c^d-e)^(f+g*h)-i";
//		System.out.println(infixToPostfix(exp));
//		String exp = "(4+(4-6)+4+7444.444+5[5])";
//		double dbb = 1000000;
//		System.out.println(dbb);
//		System.out.println(isValidExpression(exp));
		String exp = "(4+5-6)";
		System.out.println(infixToPostfix(exp));
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
