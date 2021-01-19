package basic_tutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon3052 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[10];
		
		for(int i=0;i<10;i++) {
			int n = Integer.parseInt(br.readLine());	
			arr[i] = n%42;			//1~10번째 입력의 나머지를 배열로 받음. arr[0~9]
		}
		int cnt =10;
		for(int i=0;i<10;i++) {	
			for(int j=i+1;j<10;j++) {
				if(arr[i] == arr[j]) {
					cnt--;
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}
