package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 이친수 정의
 * 1. 이친수는 0으로 시작하지 않는다.
 * 2. 이친수에서는 1이 두번 연속으로 나타니지 않는다. 즉, 11을 부분 문자열로 갖지 않는다.
 * N자리(1<= N <=90) 이친수의 개수를 구하는 프로그램 작성.
 */
public class baekjoon2193 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long num[] = new long[n];							// *** n의 범위가 90까지이므로 배열을 long타입으로 선언하여야 함 ***

		num[0] = 1;
		if (n >= 2) {
			num[1] = 1;
			for (int i = 2; i < n; i++) {
				num[i] = num[i - 1] + num[i - 2];
			}
		}
		System.out.print(num[n - 1]);
	}
}
