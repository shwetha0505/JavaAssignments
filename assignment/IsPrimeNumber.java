package week1.assignment;

public class IsPrimeNumber {

public static void main(String[] args) {
	int n= 30;  
	int n1;  
    System.out.println("The Prime Numbers are:");
	for (int i = 2; i <=n; i++) {
	 n1 = 0;  

	 for (int j = 2; j <= i / 2; j++) {
		 if (i % j == 0) {
		  n1++;  
		  break; 
		        }
		      }

		      
	if (n1 == 0) {
     System.out.println(i); 
		  }
	}
	}
	}

