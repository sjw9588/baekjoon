package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon10809 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = String.valueOf(br.readLine());
		
		int order[] = new int[word.length()];		//입력받은 문자열의 알파벳을 int형식으로 표기하는 배열.
		for(int i=0; i<word.length(); i++) {
			char w = word.charAt(i);
			order[i] = Integer.valueOf(w)-97;		
		}
		int answer[] = new int[26];					//정답을 나타낼 배열. 입력받지 않은 알파벳은 -1로 표기.
		int cnt = 0;
		for(int i=0; i<26; i++) {
			answer[i] = -1;
		
			for(int k=0; k <word.length(); k++) {
			answer[order[k]] = cnt-200;			
			if((k>1) && (order[k-1]==order[k])) {
				answer[order[k]]=cnt-201;
			}
			cnt++;
			}
		}
		for(int k : answer)
			System.out.print(k+" ");
	}
}