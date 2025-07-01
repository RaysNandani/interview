
package InputOutput;


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteLineByLine {

	public static void main(String[] args) throws IOException  {
		
		PrintWriter out = new PrintWriter(new FileWriter("C:\\Users\\lokesh\\Desktop\\IOException\\nandani.txt", true));
		
		out.println("hello bhai");

		out.println("khelega.. free fire");
 
		out.close();
		

		System.out.println("data write successfully...!!!");

	}

}