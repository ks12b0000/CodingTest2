package BaekJoon;

import java.util.Scanner;

public class Num10250 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {
			int h = sc.nextInt(); 
			int w = sc.nextInt(); 
			int n = sc.nextInt(); 
			int floor = 0;
			int room = 1;
			for (int j = 0; j < n; j++) { 
				floor++;
				if (floor > h) {
					floor = 1;
					room++;
				}
			}
			if (room > 9) {
				System.out.println(floor + "" + room);
			}
			else {
				System.out.println(floor + "0" + room);
			}			
		}
		
		
		sc.close();
	}
}
