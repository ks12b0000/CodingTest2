package BaekJoon;

import java.util.Scanner;

public class Num9086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			String str = sc.next();
			System.out.println(str.charAt(0) + "" + str.charAt(str.length() - 1));
		}				
		
		sc.close();
	}
}
