package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon10818 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int a[] = new int[N];
		int big, small = 0;
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0;i<N;i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		big=a[0];
		small = a[0];
		for(int i=1;i<N;i++) {
			
			if(big<a[i]) {
				big = a[i];
			}
			if(a[i]<small) {
				small = a[i];
			}
		}
		System.out.println(small+" "+big);
	}
}
