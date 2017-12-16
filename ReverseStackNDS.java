import java.util.Stack;
class StackReverse{
	public Stack<Integer> reverse(Stack<Integer> stack){
		if(stack.isEmpty())
			return stack;
		int temp = stack.pop();
		reverse(stack);
		insertAtBottom(stack, temp);
		return stack;
	}

	public void insertAtBottom(Stack<Integer> stack, int val){
		if(stack.isEmpty()){
			stack.push(val);
			return;
		}
		int temp = stack.pop();
		insertAtBottom(stack, val);
		stack.push(temp);
	}
}


class ReverseStackNDS{
	public static void main(String[] args){
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println("Before Reversing: " + stack);
		StackReverse stackReverse = new StackReverse();
		// stack = ;
		System.out.println("After Reversing " + stackReverse.reverse(stack));
	}
}