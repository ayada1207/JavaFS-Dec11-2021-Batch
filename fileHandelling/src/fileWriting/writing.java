package fileWriting;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class writing {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		String name;
		System.out.println("Enter Your Name");
		name = scan.nextLine();
		
		FileWriter fw = new FileWriter("C:\\Users\\arpii\\Documents\\MyDocument\\names.txt",true);
		fw.write(name+"\n");
		fw.close();
		System.out.println("Name Saved Successfully");
		scan.close();
	}

}
