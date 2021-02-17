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
			int arr[][] = new int[n][2];							// 입력할 숫자들로 구성될 배열 생성.
			int d[][] = new int[n][3];
			
			for (int k = 0; k < 2; k++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j <n; j++) {
					arr[j][k] = Integer.parseInt(st.nextToken());
				}
			}					//각 열별로 n번째 경우에 oo, ox, xo 각각 세가지 경우의 수에 따른 n-1번째의 경우의 수들의 최댓값을 구한다.
			d[0][0] = 0;
			d[0][1] = arr[0][0];
			d[0][2] = arr[0][1];
			
			for(int k=1; k<n; k++) {
				d[k][0] = Math.max(d[k-1][0], Math.max(d[k-1][1], d[k-1][2]));
				d[k][1] = Math.max(d[k-1][0], d[k-1][2]) + arr[k][0];
				d[k][2] = Math.max(d[k-1][0], d[k-1][1]) + arr[k][1];
			}
			int ans = Math.max(d[n-1][0], Math.max(d[n-1][1], d[n-1][2]));
			System.out.println(ans);
		}
	}
}
