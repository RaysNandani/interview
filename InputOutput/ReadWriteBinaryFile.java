package InputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWriteBinaryFile {

	public static void main(String[] args) throws IOException {
		String source = "C:\\Users\\lokesh solanki\\Desktop\\IO\\pubg.jpeg";
		String target = "C:\\Users\\lokesh solanki\\Desktop\\IO\\ok.jpg";
 
		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);

		int i;
		while ((i = in.read()) != -1) {

			out.write(i);

		}
		
		System.out.println("success");
	}

}
