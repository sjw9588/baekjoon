package basic_tutorial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon1110 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//StringTokenizer st = new StringTokenizer(br.readLine());
	
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		int turn = n;
		do{
			n = ((n%10)*10) + (((n/10)+(n%10))%10);
			cnt++;
		}while(turn!=n);

	System.out.println(cnt);
	br.close();
	}
}
