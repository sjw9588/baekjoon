package basic_tutorial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon10992 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n -1; i++) {
			for (int j = i; j < n - 1; j++) {
				bw.write(" ");
			}
			bw.write("*");
			for (int j = 2 * i-1; j > 0; j--) {
				bw.write(" ");
			}
			if(i!=0) bw.write("*");
			bw.newLine();
		}
		for (int i = 0; i < 2 * n - 1; i++) {
			bw.write("*");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
