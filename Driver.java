package lab3.com;
import lab3.com.BalancingBrackets;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			BalancingBrackets BalancingBrackets= new BalancingBrackets();
			String bracketExpression="([[{}]]";
			boolean result;
			result= BalancingBrackets.checkingBracketsBalanced(bracketExpression);
			if (result)
				System.out.println("The entered string has Balanced brackets");
			else
				System.out.println("The entered string do not contain Balanced brackets");

	}

}
