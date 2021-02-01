package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon11721 {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		char arr[] = st.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
			if((i%10)==9) {
				System.out.print("\n");
			}
		}
		
	}
}
