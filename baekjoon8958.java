package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon8958 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String quiz[] = new String[n];
		
		for(int i=0; i<n; i++) {
			quiz[i] = br.readLine();
		}
			
			
		for(int i=0; i<n; i++) {	//n번 돌려서 n줄의 합을 게산 및 출력.
			int total = 0;
			int cnt = 0;
			for(int j=0; j<quiz[i].length(); j++) {	//연속되는 경우 cnt++, 그 외의 경우 cnt=0으로 초기화 후 total에 더해줌.
				if(quiz[i].charAt(j) == 'O') {
					cnt++;
					total += cnt;
				}
				else{
					cnt =0;
				}
			}
			System.out.println(total);
		}
	}
}
