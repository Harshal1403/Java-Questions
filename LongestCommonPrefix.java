import java.util.Arrays;

public class LongestCommonPrefix {

	
	public static String longestCommonPrefix(String[] strs) {
		
		Arrays.sort(strs);
		int i=0;
		String s="";
		
		while (i<strs[0].length()) {
			if (strs[0].charAt(i)==strs[strs.length-1].charAt(i)) {
				s=s+strs[0].charAt(i);
				i++;
			}
			else {
				return s;
			}
		}
		
        return s;
    }
	
	public static void main(String[] args) {
		String s = longestCommonPrefix(new String[] {"flower","flow","flight"});
		System.out.println(s);
	}

}
