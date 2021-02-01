package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon1924 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int month = Integer.parseInt(st.nextToken());
		int day = Integer.parseInt(st.nextToken());
		int Month[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		
		int answer = 0;
		int total = 0;
		
		for(int i=1; i<month; i++) {
			total += Month[i];
		}
			total +=day;
		
			answer = total%7;
			if (answer==1) System.out.print("MON");
			else if (answer==2) System.out.print("TUE");
			else if (answer==3) System.out.print("WED");
			else if (answer==4) System.out.print("THU");
			else if (answer==5) System.out.print("FRI");
			else if (answer==6) System.out.print("SAT");
			else if (answer==0) System.out.print("SUN");
	}
}
