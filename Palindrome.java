package week1.assignment;

public class Palindrome {

	public static void main(String[] args) {
		int num=1231,num1,rem,rev = 0;
		num1=num;
		

		int len = String.valueOf(num).length();
		
		
		for(int i = 0; i < len ; i++) {
			
			rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		
			
		
			
		}
		if(num1 ==rev ) {
			System.out.println("The given number is Palindrome");
		}
		else {
			System.out.println("The given number is not Palindrome");
			
			
		}

	}

}