package basic_tutorial;

import static java.lang.Integer.parseInt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class baekjoon1065 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		System.out.print(Isometric_sequence(n));
	}
	public static int Isometric_sequence(int number) {
		int cnt = 0;
		
		if(number<100) {
			cnt = number;
		}
		else if(99<number) {
			if(number==1000) number=999;
			cnt = 99;
			for(int k=100; k<=number; k++) {
				int hundred = k/100;
				int ten = (k/10)%10;
				int one = k%10;
				
				if((hundred-ten)==(ten-one)) {
					cnt++;
				}
			}
		}
		
		return cnt;
	}
}
