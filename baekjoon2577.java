package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon2577 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int result = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
		int arr[]= new int[10]; //0~9까지의 숫자를 체크하기 위한 배열
		
		while(result!=0) {
				arr[result%10]++;
				result/=10;
		}
		for(int i : arr){
			System.out.println(i);
		}
	}	
}
