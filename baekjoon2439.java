package basic_tutorial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2439 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {
			for(int k=n-i-1;k>0;k--) {
				bw.write(" ");
			}
			for(int j=0;j<i+1;j++) {
				bw.write("*");	
			}
			bw.write("\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
