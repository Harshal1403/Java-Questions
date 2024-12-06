
public class PlusOne {

	public static int[] plusOne(int[] digits) {
		
		int num = digits.length;
		
		for (int i = num-1; i >= 0; i--) {
			if (digits[i]<9) {
				digits[i]+=1;
				return digits;
			}
			
			digits[i]=0;
		}
		
		int result[]= new int[num+1];
		result[0]=1;
		return result;
	}

	public static void main(String[] args) {
		int digits[]= {1,2,3};
		System.out.println(plusOne(digits));
	}

}
