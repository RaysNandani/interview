

package InputOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadLineByLineText {

	public static void main(String[] args) throws IOException {

	
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\hp\\Desktop\\IO\\readline.txt"));
		String str = br.readLine();

		while (str != null) {
			System.out.println(str);

			str = br.readLine();

		}
		
		br.close();

	}

}
