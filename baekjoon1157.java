package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1157 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		
		int num[] = new int[26]; 	// 가장 많이 사용된 알파벳의 index를 저장할 배열.
		for (int i = 0; i < word.length(); i++) {
			char k = word.charAt(i);

			if ('a'<= k && k <='z') {
				num[k - 'a']++;
			} else {
				num[k - 'A']++;
			}
		}
		char k = 0;
		int max = 0;
		for (int a = 0; a < 26; a++) {
			if (max < num[a]) {
				max = num[a];
				k = (char)(a+65);
			}
			else if(max==num[a]) {
				k = '?';
			}
		}
		System.out.println(k);
	}
}
