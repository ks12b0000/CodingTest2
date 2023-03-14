package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num10872 {
	public int DFS(int n) {
		if (n == 0) return 1;
		else if (n == 1) return 1;
		else return n * DFS(n - 1);
		
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Num10872 T = new Num10872();
		System.out.println(T.DFS(n));		
		br.close();
	}
}
