package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1735 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int[] a = new int[2];
		int[] b = new int[2];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		a[0] = Integer.parseInt(st.nextToken());
		a[1] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		b[0] = Integer.parseInt(st.nextToken());
		b[1] = Integer.parseInt(st.nextToken());
		
		int aa = (a[0] * b[1]) + (a[1] * b[0]);
		int bb = (a[1] * b[1]);
		
		int d = gcd(aa, bb);
		
		aa /= d;
		bb /= d;
		
		System.out.println(aa + " " + bb);
		
		br.close();
	}
	public static int gcd(int a, int b) {
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
