package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2562_2 {
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		int a[] = new int[9];
		for(int i=0;i<9;i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		int max = 0;
		int cnt = 0;
		int index = 0;
		
		for(int value : a) {
			cnt++;
			if(max < value) {
				max = value;
				index = cnt;
			}
		}
		System.out.println(max);
		System.out.println(index);
		br.close();
	}
}
