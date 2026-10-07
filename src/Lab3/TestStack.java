package Lab3;

import java.util.Stack;

public class TestStack {
	
	public static boolean isBalanced(String s) {
    	
    	Stack<Character> stack = new Stack<Character>();
    	
    	boolean balancedSoFar = true;
    	int k = 0;
    	
    	while (balancedSoFar && k < s.length()) {
    		char ch = s.charAt(k);
    		++k;
    		
    		if (ch == '{') {
    			stack.push('{');
    		}
    		
    		else if (ch == '}') {
    			if(!stack.isEmpty()) {
    				char openBrace = stack.pop();
    			}
    			else {
    				balancedSoFar = false;
    			}
    		}
    	}
    	if (balancedSoFar && stack.isEmpty()) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackReferenceBased stack = new StackReferenceBased();

	    stack.push("A");
	    stack.push("B");
	    stack.push("C");

	    stack.displayStack();
	    
	    System.out.println();
	    
	    System.out.println(isBalanced("{ken}"));
	    System.out.println(isBalanced("{ken"));
	}

}
