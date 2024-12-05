/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true*/
import java.util.Stack;
public class ValidParenthesis {

	
	public static boolean isValid(String s) {
		
		Stack<Character> st = new Stack<>();
		st.push(s.charAt(0));
		
		for (int i = 1; i < s.length(); i++) {
			if ((st.peek()=='(' && s.charAt(i)==')') || (st.peek()=='[' && s.charAt(i)==']') || (st.peek()=='{' && s.charAt(i)=='}')) {
				st.pop();
			}
			else{
				st.push(s.charAt(i));
			}
		}
		
		if (st.empty()) {
			return true;
		} else {
			return false;
		}
		
        
    }
	
	
	public static void main(String[] args) {
		System.out.println(isValid("([[]{}]())"));
	}

}
