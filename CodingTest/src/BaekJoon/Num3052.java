package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Num3052 {
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		HashSet<Integer> num = new HashSet<>();
//		
//		for (int i = 0; i < 10; i++) {
//			num.add(sc.nextInt() % 42);
//		}
//		
//		System.out.println(num.size());
//		
//		sc.close();
//	}
	
	
	
	/* 백준 방식2 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> num = new HashSet<>();
		
		for (int i = 0; i < 10; i++) {
			num.add(Integer.parseInt(br.readLine()) % 42); 
		}
		
		System.out.println(num.size());
		
		br.close();
	}

}
