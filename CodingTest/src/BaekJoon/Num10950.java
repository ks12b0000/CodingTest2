package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num10950 {
	
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		
//		for (int i = 0; i < num; i++) {		// num 만큼 반복 
//			int num2 = sc.nextInt();
//			int num3 = sc.nextInt();
//			System.out.println(num2 + num3);	// num2 + num3 출력
//		}
//		
//		sc.close();
//	}
	

	/* 백준 방식2 */
	public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int num = Integer.parseInt(br.readLine());
	
	for (int i = 0; i < num; i++) {
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int num2 = Integer.parseInt(st.nextToken());
		int num3 = Integer.parseInt(st.nextToken());
		System.out.println(num2 + num3);
	}
	
	br.close();
}

}
