package com.dsalab.q1;

import java.util.Stack;

public class BalancingBrackets {
	// function for Checking Balanced Brackets
    static boolean CheckingBracketsBalanced(String bracketExpression)
    {
        Stack<Character> stack = new Stack<Character>();
 
        for (int i = 0; i < bracketExpression.length(); i++)
        {
            char character = bracketExpression.charAt(i);
 
            if (character == '(' || character == '[' || character == '{')
            {
               
                stack.push(character);
                continue;
            }
 
           if (stack.isEmpty())
                return false;
            
            char c;
            
            switch (character) {
            
            case '}':
            	
            	c = stack.pop();
                if (c == '(' || c == '[')
                    return false;
                break;
                
            case ')':
            	
                c = stack.pop();
                if (c == '{' || c == '[')
                    return false;
                break;
 
            case ']':
                c = stack.pop();
                if (c == '(' || c == '{')
                    return false;
                break;
            }
        }	       
        return (stack.isEmpty());
    }
 
    // Driver code
    public static void main(String[] args)
    {
		// declare variable to pass expression
        String bracketExpression = "([[{}]]})";
        // variable to get result from function 
        Boolean result;
        
        result = CheckingBracketsBalanced(bracketExpression);
        // Check result value and print 
        if (result)
            System.out.println("The entered String has Balanced Brackets");
        else
            System.out.println("The entered Strings do not contain Balanced Brackets");
    }

}
