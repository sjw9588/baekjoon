package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2292 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int path = 2;
		int d = 6;
		int num = 2;
		do {
			num = num + d;
			d += 6;
		/*	System.out.print("num = "+ num +"  ");
			System.out.println("d = "+ d);	*/
			if (N <= 1) {
				path = 1;
				break;
			} else if (N <= 2) {
				path = 2;
				break;
			} else if (num <= N) {
				path++;
			}
		} while (num < N);
		System.out.print(path);
	}
}
