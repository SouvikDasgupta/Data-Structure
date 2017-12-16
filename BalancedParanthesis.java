import java.util.Scanner;
import java.util.Stack;
class BalancedParanthesis{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String paren = sc.next();
		System.out.println("Is Balanced: "+ isBalanced(paren));
	}

	public static boolean isBalanced(String paren){
		Stack<Character> stack = new Stack<>();
		for(int i=0; i<paren.length();i++){
			char c = paren.charAt(i);
			if(c=='(' || c=='{' || c=='['){
				stack.push(c);
			}else if(c==')' || c=='}' || c==']'){
				if(stack.isEmpty())
					return false;
				else if(!isMatchingPair(stack.pop(), c)){
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isMatchingPair(char top, char c){
		if(c==')' && top=='(')
			return true;
		else if(c=='}' &&  top=='{')
			return true;
		else if(c==']' && top=='[')
			return true;
		return false;
	}
}