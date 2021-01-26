package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2908 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int num[] = new int[2];
		for(int i=0; i<2; i++) {
			int a = Integer.parseInt(st.nextToken());
		
			int hundred = a%10;
			int ten = (a%100)/10;
			int one = a/100;
			
			num[i] = 100*hundred + 10*ten + one;
		}
		if(num[0]>num[1]) {
			System.out.print(num[0]);
		}
		else System.out.print(num[1]);
	}
}
