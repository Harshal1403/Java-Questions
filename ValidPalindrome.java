
public class ValidPalindrome {

	public static boolean isPalindrome(String s) {
		
		
		String temp1 = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                temp1 += Character.toLowerCase(ch);
            }
        }
        for (int i = 0; i < temp1.length() / 2; i++) {
            if (temp1.charAt(i) != temp1.charAt(temp1.length() - i - 1)) {
                return false;
            }
        }
        return true;

	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("race a car"));
	}

}
