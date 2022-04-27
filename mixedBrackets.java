package mixedBrackets;
import java.util.*;
 
public class mixedBrackets {
    public static boolean isBalanced(String string){
    	if (string.isEmpty()) {
    		return true;
    	}
    	Stack<Character> bracketStack = new Stack<Character>();
        for (int stackCounter = 0; stackCounter < string.length(); stackCounter++) {
        	char brackets = string.charAt(stackCounter);
        	if (brackets == '(' || brackets == '[' || brackets == '{') {
        		bracketStack.push(brackets);
        	}
        	else if(brackets == ')' || brackets == ']' || brackets == '}') {
        		if(bracketStack.isEmpty()) {
        			return false;
        		}
        		char last = bracketStack.peek();
        		if (brackets == ')' && last == '(' || brackets == ']' && last == '[' || brackets == '}' && last == '{') {
        			bracketStack.pop();
        		}
        		else {
        			return false;
        		}
        	}
        }
        return bracketStack.isEmpty();
    }
    
    public static void main(String[] args)
    {
    	//Getting Input from the User
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter a string: ");  
    	String string= sc.nextLine();
    	
    	//Checking based on the function created
        if (isBalanced(string) == true) {
            System.out.println("The string is correctly balanced ");
        }
        else
            System.out.println("The string is not correctly balanced ");
    }
}