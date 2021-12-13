package multiplicationTable;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Number:" );
		
		int n = scan.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(n + "X" + i + "=" + n*i);
			
		}
	}
}
