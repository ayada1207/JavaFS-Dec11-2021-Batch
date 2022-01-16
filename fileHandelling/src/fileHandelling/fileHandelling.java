package fileHandelling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class fileHandelling {

	public static void main(String[] args) throws IOException {
		
		// give details about file only using File Object
		File f = new File("C:\\Users\\arpii\\Documents\\MyDocument\\details.txt");
		var nameOfFile = f.getName();
		System.out.println(f.exists());
		System.out.println(f.length());
		System.out.println(nameOfFile);

	  // File reader use to read data from file
		FileReader fr = new FileReader(f);
		
		/**
		  int i = fr.read();
		while(i !=-1) 
		{
		System.out.print((char)i);
		i = fr.read();
		}
		fr.close();
		 */
		
		
		//Buffer Reader is used for reading data line by line,
		//its uses file reader only to read data.
		/**
     	BufferedReader bf = new BufferedReader(fr);
		var line = bf.readLine();
		
		while(line != null) {
			System.out.println(line);
			line = bf.readLine();
		}
		bf.close();
		 */
	
		
		// to Read all Lines of java, we can use Files.readAllLines(Paths.get("url"))
		
		var result = Files.readAllLines(Paths.get("C:\\Users\\arpii\\Documents\\MyDocument\\details.txt"));
		
		for(String r:result) {
			System.out.println(r);
		}
	}

}
