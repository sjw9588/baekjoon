package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1316 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String args[]) throws IOException {

		int n = Integer.parseInt(br.readLine());
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			if (check()) { // check()함수가 true이면 그룹단어 개수를 하나 증가시킨다.
				cnt++;
			}
		}
		System.out.print(cnt);
	}

	public static boolean check() throws IOException {
		boolean check[] = new boolean[26]; // 초기값은 false('중복안됨'표시). true '중복됨' 표시.
		int num = 0;

		String str = br.readLine();
		int len = str.length();

		for (int i = 0; i < len; i++) {
			char k = str.charAt(i);

			if (k != num) {
				if (check[k - 'a'] == false) {
					check[k - 'a'] = true;
					num = k;
				} 
				else if (check[k - 'a'] == true) {
					return false;
				}
			}
		}
		return true;
	}
}
