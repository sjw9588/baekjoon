package basic_tutorial;
import java.util.Scanner;
public class baekjoon8393 {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int total =0;
			for(int i=1;i<=n;i++) {
				total = total + i;
		}
			System.out.println(total);
	}
}