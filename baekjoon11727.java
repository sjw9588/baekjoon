package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon11727 {
	static int d[];													// 배열을 static 선언하여 거듭 생성하지 않게끔 한다.
	public static void main(String agrs[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		d = new int[n + 1];			//static 선언한 배열의 크기를 정의.
		
		System.out.print(ways(n));
	}

	static int ways(int n) { // TOP-DOWN 방식
		int answer = 0;

		if(n==0 || n ==1) return 1;
		if ((d[n]) > 0) return d[n];
							// 2x2 박스는 1x2 의 경우의 수와 동일하므로 x2 해주면 된다.
		d[n] = (ways(n - 1) + 2 * ways(n - 2)) % 10007;

		return d[n];
	}
}
