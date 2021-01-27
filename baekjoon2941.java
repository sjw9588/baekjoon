package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon2941 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String S = br.readLine();
		int cnt = 0; 

		for (int i = 0; i < S.length(); i++) {

			char k = S.charAt(i);

			if (k == 'c' && (i + 1 < S.length())) {
				if (((S.charAt(i + 1) == '=') || (S.charAt(i + 1) == '-'))) {
					i++;
				}
			}
			else if (k == 'd' && (i + 1 < S.length())) {
				if (S.charAt(i + 1) == '-') {
					i++;
				}
				else if ((S.charAt(i + 1) == 'z') && (i + 2 < S.length())) {
					if (S.charAt(i + 2) == '=') {
						i += 2;
					}
				} 
			}
			else if (k == 'l' && (i + 1 < S.length())) {
				if (S.charAt(i + 1) == 'j') {
					i++;
				}
			}
			else if (k == 'n' && (i + 1 < S.length())) {
				if (S.charAt(i + 1) == 'j') {
					i++;
				}
			}
			else if (k == 's' && (i + 1 < S.length())) {
				if (S.charAt(i + 1) == '=') {
					i++;
				}
			}
			else if (k == 'z' && (i + 1 < S.length())) {
				if (S.charAt(i + 1) == '=') {
					i++;
				}
			}
			cnt++;
		}
		System.out.print(cnt);
	}
}
