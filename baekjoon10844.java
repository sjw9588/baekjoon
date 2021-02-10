package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon10844 {
	static long d[][];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		d = new long[n][10];
		for (int i = 1; i < 10; i++) {
			d[0][i] = 1;						//하나의 배열 원소를 하나의 경우의 수로 계산한다. ㅐ
		}

		System.out.print(cal(n));
	}

	static long cal(int n) {
		long sum = 0;

		
		for (int i = 1; i < n; i++) {
			d[i][0] = d[i - 1][1];							//맨 마지막 숫자가 0이면 바로 이전 숫자가 1이여야 한다.
			d[i][9] = d[i - 1][8];							//맨 마지막 숫자가 9이면 바로 이전에 오는 숫자가 8이여야 한다.
			for (int j = 1; j < 9; j++) {					//1~8까지의 숫자가 맨 뒤에 올경우 바로 이전 자릿수의 숫자가 +1 또는 -1인 경우, 즉 2가지 있다.
				d[i][j] = (d[i - 1][j - 1] + d[i - 1][j + 1]) % 1000000000;		//d[i][j] 면 i는 자릿수, j는 그 자릿수에 오는 숫자를 의미한다.
			}
		}
		for(int i=0; i<10; i++) {
			sum += d[n-1][i] % 1000000000;
		}

		return sum%1000000000;
	}
}
