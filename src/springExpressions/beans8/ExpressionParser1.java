package springExpressions.beans8;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

public class ExpressionParser1 {

	public static void main(String[] args) {
		
		ExpressionParser parser= new SpelExpressionParser();//this class is use to parse the expression
	Expression expression=parser.parseExpression("'this is string expression'");// to parse string in via expression we have to use '' 
	System.out.println("first expression value printed:"+expression.getValue());
 
	///////////////////////////////////////////////////////////////////////////////////////////////////////
	System.out.println("----------------------------------------------------------------------------------------");
	
	ExpressionParser parser2= new SpelExpressionParser();// 
	EvaluationContext context= new StandardEvaluationContext();// we use this to set value in variable and pass them in runtime
	context.setVariable("Num1", 100);
	context.setVariable("Num2", 101);
	Expression expression2=parser2.parseExpression("#Num1 +#Num2");// to parse string in 
	System.out.println("expression 2 value: "+expression2.getValue(context));
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	System.out.println("----------------------------------------------------------------------------------------");
	
	ExpressionParser parser3= new SpelExpressionParser();
	Expression ex=parser.parseExpression("10+20");
	System.out.println("expression 3 value with two number:"+ex.getValue());
	
System.out.println("----------------------------------------------------------------------------------------");
	
	ExpressionParser parser4= new SpelExpressionParser();
	Expression ex4=parser.parseExpression("(10>20) and (20<30)");
	System.out.println("expression 4 value compare of two number:"+ex4.getValue());
	
System.out.println("----------------------------------------------------------------------------------------");
	
	ExpressionParser parser5= new SpelExpressionParser();
	Expression ex5=parser.parseExpression("10>20?'10 is greater than 20':'20 is greater than'");
	System.out.println("expression 5 ternary operator use:"+ex5.getValue());
	
System.out.println("----------------------------------------------------------------------------------------");
	ExpressionParser parser6= new SpelExpressionParser();
	Expression ex6=parser.parseExpression("'rahul'.length()");
	System.out.println("expression 6 method invocation ex:"+ex6.getValue());
	
	System.out.println("----------------------------------------------------------------------------------------");
	ExpressionParser parser7= new SpelExpressionParser();
	Expression ex7=parser.parseExpression("'9949940040' matches '[0-9]{10}'");
	System.out.println("expression 7  regex expression:"+ex7.getValue());
	}

}
