package basic_tutorial;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class baekjoon4673 {
	public static void main(String args[]) {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		boolean check[] = new boolean[10001];

		for (int i = 1; i < 10001; i++) { // d(i)는 셀프넘버 계산함수
			int n = d(i);
			if(n<10001)
				check[n] = true;
		}
		StringBuilder sb = new StringBuilder();
		for(int i=1;i<10001;i++) {
			if(check[i]!=true)
				sb.append(i).append('\n');
		}
		System.out.print(sb);
	}

	public static int d(int number) {
		int total = number;
		while (number != 0) {
			total += (number % 10);
			number = number / 10;
		}
		return total;
	}
}