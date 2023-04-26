package BaekJoon;

import java.util.Scanner;

public class Num27866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int num = sc.nextInt();
		
		System.out.println(str.charAt(num - 1));
		
		sc.close();
	}
}
