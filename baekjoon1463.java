package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1463 {
	public static void main(String agrs[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		while ((n % 3 != 0) && (n % 2 != 0)) {
			cnt++;
			n--;
		}
		while ((n % 3 == 0)) {
			n /= 3;
			cnt++;
			if (n == 1)
				break;
		}
		while (n % 2 == 0) {
			n /= 2;
			cnt++;
			if (n == 1)
				break;
		}
		System.out.print(cnt);
	}
}
