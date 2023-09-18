package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Num1644 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		if (sosu(n)) cnt++;
		
		for (int i = 1; i < n; i++) {
			if (sosu(i)) {
				list.add(i);
			}
			
		}
		
		int left = 0;
		int rigth = 0;
		int sum = 0;
		
		while (rigth < list.size()) {
			if (sum >= n) {
				sum -= list.get(left++);
			}
			else {
				sum += list.get(rigth++);
			}
			if (sum == n) cnt++;
		}
		
		System.out.println(cnt);
		
		br.close();
	}
	static boolean sosu(int n) {
		if (n < 2) return false;
		
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}
		return true;
	}
}
