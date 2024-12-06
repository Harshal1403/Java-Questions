
public class LengthOfLastWord {

	public static int lengthOfLastWord(String s) {
		String trimmedStr = s.trim();

        if (trimmedStr.lastIndexOf(" ")==-1) {
			return trimmedStr.length();
		}else {
			return trimmedStr.length()-1-trimmedStr.lastIndexOf(" ");
		}		
    }
	
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("Hello World"));
		System.out.println(lengthOfLastWord("Good Morning"));
		System.out.println(lengthOfLastWord("How Are You"));
		System.out.println(lengthOfLastWord("I love   coding  "));
	}

}
