package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2941 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String S = br.readLine();
		int cnt=0;
		
		for(int i=0; i< S.length(); i++) {
			char k = S.charAt(i);
			switch(k) {
			case 'c' :
				if(((S.charAt(i+1)=='=')||(S.charAt(i+1)=='-'))&& i+1<S.length()) {
					i++;
				}
				break;
			case 'd' :
				if(S.charAt(i+1)=='z'){
					if(S.charAt(i+2)=='=' && i+2<S.length()) {
						i=i+2;
					}
				}
				else if((S.charAt(i+1)=='-')&& i+1<S.length()) {
					i++;
				}
				break;
			case 'l' :
				if((S.charAt(i+1)=='j') && (i+1<S.length())) {
					i++;
				}
				break;
			case 'n' :
				if((S.charAt(i+1)=='j') && (i+1<S.length())) {
					i++;
				}
				break;
			case 's' :
				if((S.charAt(i+1)=='=') && (i+1<S.length())) {
					i++;
				}
				break;
			case 'z' :
				if((S.charAt(i+1)=='=') && (i+1<S.length())) {
					i++;
				}
				break;
			}
			cnt++;
		}
		System.out.print(cnt);
	}
}
