package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2562 {
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		int a[] = new int[9];
		for(int i=0;i<9;i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		int big = a[0];
		int cnt = 0;
		for(int i=1;i<9;i++) {
			if(big<a[i]) {
				big = a[i];
				cnt = i;
			}
		}
		System.out.println(big+"\n"+(cnt+1));
		br.close();
	}
}
