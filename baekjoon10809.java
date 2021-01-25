package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon10809 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = String.valueOf(br.readLine());
		int answer[] = new int[26];

		for (int i = 0; i < 26; i++) {
			answer[i] = -1;
		}
		for (int i = 0; i < word.length(); i++) {
			char k = word.charAt(i);

			if (answer[k - 'a'] == -1)
				answer[k - 'a'] = i;
		}

		for (int k : answer)
			System.out.print(k + " ");
	}
}