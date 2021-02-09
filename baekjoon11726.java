package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon11726 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		System.out.print(ways(n));
	}
	
	static int ways(int n) {		//d[n] = d[n-2]+ d[n-1]		(Bottom-up 방식)
		int d[] = new int[n+1];
		int ways = 0;
		d[0] =1;
		d[1] =1;
		
		for(int i=2; i<=n; i++) {		// = 피보나치 수열.
			d[i] = (d[i-2]+ d[i-1]) % 10007;
		}
		ways = d[n];
		
		return ways;
	}
}
