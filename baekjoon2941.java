package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2941 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		String S = br.readLine();
		String arr[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		int cnt=0;
		for(int i=0; i< S.length(); i++) {
			char k = S.charAt(i);
			cnt++;
			switch(k) {
			case 'c' :
				if(((S.charAt(i+1)=='=')||(S.charAt(i+1)=='-'))&& i+1<S.length()) {
					cnt++;
				}
				else cnt--;
				break;
			case 'd' :
				if(S.charAt(i+1)=='z'){
					if(S.charAt(i+2)=='=' && i+2<S.length()) {
						cnt++;
					}
					else cnt--;
				}
				else if((S.charAt(i+1)=='-')&& i+1<S.length()) {
					cnt++;
				}
				else cnt--;
				break;
			case 'j':
				if(((S.charAt(i-1)=='l') || (S.charAt(i-1)=='n')) && i-1>=0) {
					cnt++;
				}
				else cnt--;
				break;
			case '=':
				if(((S.charAt(i-1)=='s') || (S.charAt(i-1)=='z')) && i-1>=0) {
					cnt++;
				}
				else cnt--;
				break;
			}
		}
		System.out.print(cnt);
	}
}
