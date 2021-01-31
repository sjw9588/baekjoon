package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1712 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int fix = Integer.parseInt(st.nextToken());
		int one = Integer.parseInt(st.nextToken());
		int price = Integer.parseInt(st.nextToken());
		int plus = 0;

		if (one >= price) {
			plus = -1;
		}
		else plus = fix/(price-one)+1;
		System.out.print(plus);
		br.close(); 
	}
}
