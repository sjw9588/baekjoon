package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1157 {
	public static void main(String args[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		char order[] = new char[26];
		int num[] = new int[26]; 	// 가장 많이 사용된 알파벳의 index를 저장할 배열.

		for (int i = 0; i < word.length(); i++) {
			order[i] = 65;
		}
		for (int i = 0; i < word.length(); i++) { 	// abcdef --- xyz 를 가지는 배열 order[] 생성.
			order[i] += i;
		}
		for (char z : order)
			System.out.print(z);
		System.out.println();
		for (int i = 0; i < word.length(); i++) {
			char k = word.charAt(i);

			if ('a'<= k && k <='z') {
				num[k - 'a']++;
			} else {
				num[k - 'A']++;
			}
		}
		for(int m : num)
			System.out.print(m);
		System.out.println();
		int k = 0;
		int max = 0;
		for (int a = 0; a < order.length; a++) {
			if (max < num[a]) {
				max = num[a];
				k = a;
			}
		}
		System.out.println(order[k]);
	}
}
