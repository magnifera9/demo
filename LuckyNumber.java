
public class LuckyNumber {
	public static void main(String[] args) {
		int num = 1939;
		luckyNumberChecker(num);
	}

	private static void luckyNumberChecker(Integer num) {
		String numString = num.toString(); //converting to string just to get count of digits in the given number
		int result = 0;
		
		int[] arr = new int[numString.length()]; // array 1
		int length = arr.length; 
		int[] originalDigitsArr = new int[length]; // array 2
		
		//putting numbers one by one into int array
		for(int i = 0 ; i<length ; i++) {
			arr[i] = num%10;
			num = num/10;
		}
	
		//reversing the numbers to make it original number
		for(int j = 0 ; j<length; j++) {
			originalDigitsArr[j] = arr[length-j-1];
		}
		
		//logic for lucky number
		for(int i =1 ; i<length ; i++) {
			result = result + (originalDigitsArr[i]*originalDigitsArr[i]);
			i = i+1;
		}
		
		if(result % 9 == 0) {
			System.out.println("Lucky number");
		}else {
			System.out.println("Not Lucky number");
		}
	}
}
