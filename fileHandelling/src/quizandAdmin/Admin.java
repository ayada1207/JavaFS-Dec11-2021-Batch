package quizandAdmin;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Admin {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name;
		boolean isFound=false;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the name: ");
		name=obj.nextLine();
		var result=Files.readAllLines(Paths.get("C:\\Users\\arpii\\Documents\\MyDocument\\quizDetails.txt"));
		for(var r:result) {
			var data=r.split(",");
			if(name.equalsIgnoreCase(data[0])) {
				System.out.println("Score Of" +name+" is: "+data[1]);
				isFound=true;
				break;
				
			}
		}
		if(!isFound) {
			System.out.println("Name not Found");
		}
		
	}
}
