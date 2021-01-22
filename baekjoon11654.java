package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon11654 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = String.valueOf(br.readLine());
		char w = word.charAt(0);
		int a = Integer.valueOf(w);
		
		System.out.print(a);
	}
}
