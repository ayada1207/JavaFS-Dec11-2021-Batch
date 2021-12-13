package Main;

public class main {
 
	private static int factorial(int n) {
		int fact = 1;
		for(int i=1;i <= n;i++) {
			fact = fact*i;
		}
		return fact;
	}
	
	private static int Permutation(int n, int r) {
		
		int result = factorial(n) /factorial(n-r);
		return result;
	}
	
	private static int Combination(int n, int r) {
		
		int result = factorial(n) /(factorial(n-r) * factorial(r));
		return result;	
	}
	
	public static void main(String[] args) {
			System.out.println(Permutation(3,2));
			System.out.println(Permutation(5,3));
			
			System.out.println(Combination(3,2));
			System.out.println(Combination(5,3));
	}

}
