package basic_tutorial;

import java.util.Calendar;
import java.util.Scanner;

public class baekjoon1924_api {
	public static void main(String args[]) {
		
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		
		getMonth(x,y);
		s.close();
	}
	static void getMonth(int x,int y) {
		Calendar c = Calendar.getInstance();
		
		c.set(2007, x-1, y);			// * 월이 1이 아닌 0부터 시작됨.
		int m = c.get(Calendar.DAY_OF_WEEK);

		if (m==1) System.out.print("SUN");		//일요일이 1 월요일 2 ~~
		else if (m==2) System.out.print("MON");
		else if (m==3) System.out.print("TUE");
		else if (m==4) System.out.print("WED");
		else if (m==5) System.out.print("THU");
		else if (m==6) System.out.print("FRI");
		else if (m==0) System.out.print("SAT");
	}
}
