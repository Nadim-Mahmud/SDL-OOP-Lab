package application;
	
import java.util.Stack;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/application/UI.fxml")); 
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static int Prec(char ch){
		switch (ch) {
			case '+':
			case '-':
				return 1;
	
			case '*':
			case '/':
				return 2;
	
			case '^':
				return 3;
		}
		return -1;
	}

	/** The main method that converts given infix expression
	* to postfix expression.
	*/
	static String infixToPostfix(String exp){
		
		String result = new String("");
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i<exp.length();i++) {
			char c = exp.charAt(i);
			
			if (Character.isLetterOrDigit(c)) result += c;
			else if (c == '(') stack.push(c);
			else if (c == ')'){
				
				while (!stack.isEmpty() && stack.peek() != '(') result += stack.pop();
				if (!stack.isEmpty() && stack.peek() != '(')return "Invalid Expression";
				else stack.pop();
			}
			else {
				while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) result += stack.pop();
				stack.push(c);
			}
		}
		
		while (!stack.isEmpty()) result += stack.pop();

		return result;
	}
	
	public static boolean isBracketStarting(char ch) {
		
		if(ch=='('||ch=='{'||ch=='[') return true;
		return false;
	}
	
	public static boolean isBracketEnding(char ch) {
		
		if(ch==')'||ch=='}'||ch==']') return true;
		return false;
	}
	
	public static boolean isBracket(char ch) {
		if(ch=='('||ch=='{'||ch=='['||ch==')'||ch=='}'||ch==']') return true;
		return false;
	}
	
	public static boolean isOperator(char ch) {
		
		if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='^'||ch=='%'||ch=='!') return true;
		return false;
	}
	
	private static boolean isDigit(char ch) {
		if(ch>='0'&&ch<='9') return true;
		return false;
	}
	
	public static char ending(char ch) {
		
		switch(ch) {
		case ')' : return '(' ;
		case '}' : return '{';
		case ']' : return '[';
		}
		return ' ';		
	}
	/**
	 * @param str the given expression
	 * @return if valid return true else return false
	 */
	
	public static boolean isValidExpression(String str) {
		
		Stack<Character> stack = new Stack<>();
		int sz = str.length()-1;
		
		for(int i=0; i<=sz; i++) {
			
			char ch = str.charAt(i);
			
			//checking for invalid charecter
			if(!isBracket(ch)&&!isOperator(ch)&&!isDigit(ch)&&ch!='.') return false;
			
			//checking for blank space
			if(ch==' ') return false;
			
			//Checking opeator realted error
			if(i>0&&i<sz) {
				
				char ch1 = str.charAt(i-1);
				char ch2 = str.charAt(i+1);
				
				if(isOperator(ch)) {
					if(isOperator(ch1)||isOperator(ch2)) return false;
				}
				else if(isBracketStarting(ch)) {
					if(isOperator(ch2)||isBracketEnding(ch2)) return false;
				}
				else if(isBracketEnding(ch)) {
					if(isOperator(ch1)) return false;
				}
			}
			else if(isOperator(ch)) return false;
			
			///Checking braket sequenece
			if(isBracketStarting(ch)) {
				stack.push(ch);
			}
			else if(isBracketEnding(ch)) {
				if(stack.empty()) return false;
				if(stack.peek()!=ending(ch)) return false;
				stack.pop();
			}
		}
		return true;
	}


	public static void main(String[] args) {
		//launch(args);
//		double n =  Double.parseDouble("123.124444");
//		n += 1.0;
//		System.out.println(n);
//		String exp = "a+b*(c^d-e)^(f+g*h)-i";
//		System.out.println(infixToPostfix(exp));
		String exp = "(4+(4-6)+4+7444.444+5[5])";
		System.out.println(isValidExpression(exp));

	}
}
