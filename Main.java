package basic_tutorial;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt(); //�ð�
		int b = in.nextInt(); //��
		in.close();
		
		b = b-45;
		
		if(b<0) {
			a--;
			b = 60+b;
		}
		if(a<0) { 
			a=23;
		}
		
		System.out.print(a+" "+b);
	}
}
