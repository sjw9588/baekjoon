package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon1463_2 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		System.out.print(recur(N, 0));
	}

	static int recur(int N, int count) {
		if (N < 2) {
			return count;
		}
		/*
		 * N으로 각각 2와 3으로 나누면 count는 +1에 각 연산의 나머지 값을 더해준 것이 된다. 나머지 값은 빼기 1했을 때의 count
		 * 값과 같기 때문
		 * EX)
		 * recur(5,0)
		 *  
		 * min( recur(2,2) , recur(1, 2) )
		 * 
		 * min( min( recur(1, 3) , recur(0,5) ) , min( recur(0, 3), recur(0, 5) ) )
		 * 
		 * min( min( 3 , 5 ) , min( 3, 5 ) )
		 * 
		 * min( 3, 3 )
		 * 
		 * output : 3
		 */
		return Math.min(recur(N / 2, count + 1 + (N % 2)), recur(N / 3, count + 1 + (N % 3)));

	}
}
