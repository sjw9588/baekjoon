package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class baekjoon9465 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			int arr[][] = new int[2][n];

			for (int k = 0; k < 2; k++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < n; j++) {
					arr[k][j] = Integer.parseInt(st.nextToken());
				}
			}
			int temp = 0;
			for (int j = 0; j < n - 1; j++) {
				if ((arr[0][j] > arr[0][j + 1]) || (arr[0][j] > arr[1][j])) {
					arr[0][j + 1] = 0;
					arr[1][j] = 0;
				}
				else if((arr[0][j] > arr[0][j + 1]) || (arr[0][j] > arr[1][j]))
			}
		}
	}
}
