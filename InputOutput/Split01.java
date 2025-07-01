package InputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Split01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\lokesh\\Desktop\\IOException\\split.txt"));
		int nol = 2;
		int countLine = 0;
		String s = br.readLine();
		while (s != null) {
			countLine++;
			s = br.readLine();
		}
		br.close();
		int temp = countLine / 2;
		if (countLine % 2 != 0) {
			temp++;
		}
		br = new BufferedReader(new FileReader("C:\\Users\\lokesh\\Desktop\\IOException\\split.txt"));
		String str;
		for (int i = 1; i <= temp; i++) {
			PrintWriter pw = new PrintWriter(
					new FileWriter("C:\\Users\\lokesh\\Desktop\\IOException\\split" + i + ".txt"));
			for (int j = 1; j <= nol; j++) {
				str = br.readLine();
				if (str == null) {
					break;
				}
				pw.println(str);
			}
			pw.close();
		}
	}
}