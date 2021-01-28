package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1316 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[26];
		int cnt = 0;
		int num = n;
		for (int i = 0; i < 26; i++) {
			arr[i] = 0; // 중복될 경우 i++해서 배열을 한칸 넘어가는 방법. + 이미 0이 아닌 경우 그룹단어가 아닌 것으로 간주.
		}
		for (int i = 0; i < n; i++) {
			String st = br.readLine();
			for (int j = 0; j < st.length(); j++) {
				char k = st.charAt(j);

				if (j + 1 < st.length()) {
					if (k == st.charAt(j + 1)) {
						j++;
					}
				}
				else if (arr[k - 'a'] == 0){
					arr[k - 'a']++;
				}
				else if (arr[k - 'a'] != 0) {
						cnt = --num;
						System.out.println("cnt : " +cnt);
						System.out.println("num : " +num);
				}
			}
			System.out.println(cnt);
			System.out.println(num);
		}
	}
}
