package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon4344 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c = Integer.parseInt(br.readLine()); // test-case 개수 c

		for (int k = 0; k < c; k++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " "); // " "를 기준으로 구분되는 st 토큰문자열
			int m = Integer.parseInt(st.nextToken()); // 첫 토큰이자 정수 m = 학생 수 = 점수 개수
			int score[] = new int[m]; // m만큼 점수 배열을 생성.

			for (int i = 0; i < m; i++) {
				score[i] = Integer.parseInt(st.nextToken());
			}
			double avg, total = 0;
			for (int i = 0; i < m; i++) {
				total += score[i];
			}
			avg = total / m;
			double cnt = 0;
			for (int i = 0; i < m; i++) {
				if (score[i] > avg) {
					cnt++;
				}
			}
			double result = (double) (cnt / m * 100);
			System.out.print(String.format("%.3f%%", result));
		}
	}
}
