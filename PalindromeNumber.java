
public class PalindromeNumber {

	public static boolean isPalindrome(int x) {
		
		String s= Integer.toString(x);
		int i=0;
		while (i<s.length()/2) {
			if (s.charAt(i)!=s.charAt(s.length()-1-i)) {
				return false;
			} 
			i++;
		}
			
		return true;
    }
	
	public static void main(String[] args) {
		boolean b= isPalindrome( 3003);
		System.out.println(b);
	}

}
