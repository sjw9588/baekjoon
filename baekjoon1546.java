package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1546 {
	public static void main(String args[]) throws IOException{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			double score[] = new double[n];
			for(int i=0;i<n;i++) {
				score[i] = Integer.parseInt(st.nextToken());
			}
			double max = score[0];
			for(int i=0;i<n;i++) {
				if(max < score[i])
					max = score[i];
			}
			for(int i=0;i<n;i++) {
				score[i] = (score[i]/max)*100;
			}
			
			double avg = 0;
			double total = 0;
			for(int i=0; i<n; i++) {
				total += score[i];
			}
			avg = (double)(total/n);
			System.out.print(avg);
	}
}
