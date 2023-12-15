package week1.assignment;

public class FibonacciSeries {
	public static void main(String[] args) {
	int range=8,fib1=0,fib2=1,fib3;
	System.out.println("Fibonacci series are:");
	System.out.println(fib1+ "\n" +fib2);
		for (int i = 2; i < range; i++) {
			
			fib3=fib1+fib2;
			System.out.println(+fib3);
			fib1=fib2;
			fib2=fib3;
			
		}
	}

}
