package basic_tutorial;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon10871 {
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int a [] = new int[n];
		
		int x = Integer.parseInt(st.nextToken());
		for(int i=0;i<n;i++) {
			a[i]= Integer.parseInt(st.nextToken());
		}
		
		for(int i=0;i<n;i++) {
			if(a[i]<x) {
				bw.write(a[i]+" ");
			}
		}
		br.close();
		bw.flush();
		br.close();
	}
}
