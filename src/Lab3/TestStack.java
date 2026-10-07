package Lab3;

import java.util.Scanner;
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
		Scanner scanner = new Scanner(System.in);
		StackReferenceBased stack = new StackReferenceBased();

	    stack.push("A");
	    stack.push("B");
	    stack.push("C");

	    stack.displayStack();
	    
	    System.out.println();
	   
	    System.out.println(isBalanced("{ken}"));
	    System.out.println(isBalanced("{ken"));
	    
	    int choice = 0;
	    
	    System.out.println();
	    
	    System.out.println("Welcome to StackTest! Please select a number from the list.");
	    
	    while(choice != 6) {
	    	System.out.println(); 
	    	System.out.println("Please select a number from the list.");
	    	System.out.println("1. Push a string on to the stack"); 
	    	System.out.println("2. Pop a string from the stack"); 
	    	System.out.println("3. Peek at the top of the stack"); 
	    	System.out.println("4. Empty the stack"); 
	    	System.out.println("5. Check if a string has balanced brackets");
	    	System.out.println("6. Quit the program"); 
	    	System.out.print("Enter your selection: "); 
	    	
	    	choice = scanner.nextInt(); 
	    	scanner.nextLine();
	    	
	    	if(choice == 1) {
	    		System.out.println("enter a string to push");
	    		String user = scanner.nextLine();
	    		stack.push(user);
	    		System.out.println("string " + user + " was pushed onto the stack");
	    		break;
	    	}
	    	
	    	else if (choice == 2) {
	    		if(!stack.isEmpty()) {
	    			System.out.println("popped " + stack.pop());
	    		}
	    		else {
	    			System.out.println("the stack is empty");
	    		}
	    		break;
	    	}
	    	
	    	else if (choice == 3) {
	    		if(!stack.isEmpty()) {
	    			System.out.println("top of stack: " + stack.peek());
	    		}
	    		else {
	    			System.out.println("the stack is empty");
	    		}
	    		break;
	    	}
	    	
	    	else if (choice == 4) {
	    		stack = new StackReferenceBased();
	    		System.out.println("the stack has been emptied");
	    		break;
	    	}
	    	
	    	else if (choice == 5) {
	    		System.out.println("enter a string to check");
	    		String input = scanner.nextLine();
	    		
	    		if (isBalanced(input)) {
	    			System.out.println("the brackets are balanced");
	    		}
	    		else {
	    			System.out.println("the brackets are not balanced");
	    		}
	    		break;
	    	}
	    	
	    	else if (choice == 6) {
	    		System.out.println("goodbye");
	    		break;
	    	}
	    }
	}
}
