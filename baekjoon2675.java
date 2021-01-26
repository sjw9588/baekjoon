package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2675 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			StringTokenizer S = new StringTokenizer(br.readLine(), " ");

			int a = Integer.parseInt(S.nextToken());
			String b = S.nextToken();

			for (int j = 0; j < b.length(); j++) {
				for (int k = 0; k < a; k++)
					System.out.print(b.charAt(j));
			}
			System.out.println();
		}
	}
}
