package basic_tutorial;

import java.util.Scanner;

public class baekjoon2739 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int j=1;j<=9;j++) {
				int k = n*j;
				System.out.println(n+" * "+j+" = "+k);
			}
		
	}

}
