package BaekJoon;

import java.util.Scanner;

public class Num10988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringBuffer bf = new StringBuffer(str);
		String str2 = bf.reverse().toString();
		String answer = "";
		if (str.equals(str2)) answer = "1";
		else answer = "0";
		
		System.out.println(answer);
		sc.close();
	}
}
