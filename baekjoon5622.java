package basic_tutorial;

import java.io.IOException;

public class baekjoon5622 {
	public static void main(String[] args) throws IOException {

		int count = 0;
		int value;

		while ((value = System.in.read()) != '\n') {
			

			if (value>64 && value <68)
				count += 3;
			else if (value > 67 && value <71)
				count += 4;
			else if (value > 70 && value <74)
				count += 5;
			else if (value > 73 && value <77)
				count += 6;
			else if (value > 76 && value <80)
				count += 7;
			else if (value > 80 && value <85)
				count += 8;
			else if (value > 84 && value <88)
				count += 9;
			else if(value >87 && value <92)
				count += 10;

		}
		System.out.print(count);
	}
}