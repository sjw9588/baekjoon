package basic_tutorial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2446 {
	public static void main(String agrs[]) throws IOException{
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1;i<n; i++) {
			for(int j=i; j>1; j--) {
				bw.write(" ");
			}
			for(int j=2*i-1; j<=2*n-1; j++) {
				bw.write("*");
			} 
			bw.newLine();
		}
		
		
		for(int i=1; i<=n; i++) {
			for(int j=i; j<n; j++) {
				bw.write(" ");
			}
			for(int j=2*i-1; j>0; j--) {
				bw.write("*");
			}
	/*		for(int j=i; j<n; j++) {
				System.out.print(" ");
			}*/
		bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
