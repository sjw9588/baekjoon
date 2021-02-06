package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1463 {
	static Integer[] dp;

	public static void main(String agrs[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		dp = new Integer[N + 1];
		dp[0] = dp[1] = 0;
		System.out.print(recur(N));
	}

	static int recur(int N) {
		if (dp[N] == null) {
			if (N % 6 == 0) {
				dp[N] = Math.min(recur(N - 1), Math.min(recur(N / 3), recur(N / 2))) + 1;
			} else if (N % 3 == 0) {
				dp[N] = Math.min(recur(N / 3), recur(N - 1)) + 1;
			} else if (N % 2 == 0) {
				dp[N] = Math.min(recur(N / 2), recur(N - 1)) + 1;
			} else {
				dp[N] = recur(N-1) + 1;
			}
		}
		return dp[N];
	}
}
