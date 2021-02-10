package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon9095 {
	static int d[];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		d = new int[12];
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(add(n));
		}
	}

	static int add(int n) {
		d[0] = 1;
		d[1] = 1;
		d[2] = 2;
		d[3] = 4;
		if (n > 3) {
			d[n] = add(n - 1) + add(n - 2) + add(n - 3);
		}
		return d[n];
	}
}
