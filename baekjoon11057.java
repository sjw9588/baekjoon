package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon11057 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int num[] = new int[10];
		for(int i=0; i<10; i++) {
			num[i] = 1;				//여기서 num[0], 즉 모든 수가 9로 이루어지는 경우는 항상 1임을 알 수 있다.
		}
		
		for(int i=1; i<n; i++) {
			for(int j=1; j<10; j++) {
				num[j] = (num[j]+ num[j-1]) % 10007;		//num[j]+ num[j+1]을 한번 계산할 때마다 자릿수가 하나씩 증가하므로(n이 +1되므로)
			}
		}
		int sum =0;
		for(int i=0; i<10; i++) {
			sum += num[i]%10007;
		}
		System.out.print(sum%10007);
	}
}
