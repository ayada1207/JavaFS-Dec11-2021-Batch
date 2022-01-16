package quizandAdmin;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class QuizProgramm {

	public static void main(String[] args) throws IOException {

		String name;
		int ans;
		int score = 0;
		Scanner scan = new Scanner(System.in);
		FileWriter fw = new FileWriter("C:\\Users\\arpii\\Documents\\MyDocument\\quizDetails.txt",true);
		System.out.println("Enter Your Name: ");
		name = scan.nextLine();
		
		System.out.println("Q1: Number of continents in world");
		System.out.println("1. Four, 2. Three, 3. Five, 4. Seven");
		System.out.println("Enter your Answer");
		
		ans = scan.nextInt();
		
		if(ans == 4) {
			score = score+20;
		}else if(ans > 4 || ans <=0) {
				System.out.println("OOPS, You enterd wrong option. please select right option for next question");
		}
		
		System.out.println("Q2: Larget continents in world");
		System.out.println("1. Asia, 2. Australia, 3. Europe, 4. North America");
		System.out.println("Enter your Answer");
		
		ans = scan.nextInt();
		
		if(ans == 1) {
			score = score+20;
		}else if(ans > 4 || ans <=0) {
			System.out.println("OOPS, You enterd wrong option. please select right option for next question");
		}
		
		System.out.println("Q3: Oldest democracy in the world");
		System.out.println("1. America, 2. United Kingdom, 3. India, 4. China");
		System.out.println("Enter your Answer");
		
		ans = scan.nextInt();
		
		if(ans == 3) {
			score = score+20;
		}else if(ans > 4 || ans <=0) {
			System.out.println("OOPS, You enterd wrong option. please select right option for next question");
		}
		
		System.out.println("Q4: No Of planet in our solar Syatem");
		System.out.println("1. Four, 2. Eigth, 3. Five, 4. Seven");
		System.out.println("Enter your Answer");
		
		ans = scan.nextInt();
		
		if(ans == 2) {
			score = score+20;
		}else if(ans > 4 || ans <=0) {
			System.out.println("OOPS, You enterd wrong option.");
		}
		
		scan.close();
		fw.write(name+","+score+"\n");
		System.out.println("Thank You for taking quiz,"+name+ " your Score has been stored Successfully"+"");
		fw.close();
	}

}
