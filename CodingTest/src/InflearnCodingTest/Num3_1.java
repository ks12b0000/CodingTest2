package InflearnCodingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Num3_1 {
	
	
	
	/* 프로그래머스 방식 */
//	public ArrayList<Integer> solution(int num, int num2, int[] arr, int[] arr2) {
//		ArrayList<Integer> answer = new ArrayList<>();
//		
//		int p1 = 0;
//		int p2 = 0;
//		
//		while (p1 < num && p2 < num2) {
//			if(arr[p1] < arr2[p2]) {
//				answer.add(arr[p1++]);
//			}
//			else {
//				answer.add(arr2[p2++]);
//			}
//		}
//		while (p1 < num) answer.add(arr[p1++]);
//		while (p2 < num2) answer.add(arr2[p2++]);
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num3_1 T = new Num3_1();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		for (int i = 0; i < num; i++) {
//			arr[i] = sc.nextInt();
//		}
//		int num2 = sc.nextInt();
//		int[] arr2 = new int[num2];
//		for (int i = 0; i < num2; i++) {
//			arr2[i] = sc.nextInt();
//		}
//		for (int x : T.solution(num, num2, arr, arr2)) {
//			System.out.print(x + " ");
//		}
//		sc.close();
//	}
	
	
	/* 프로그래머스 방식2 */
//	public int[] solution(int num, int num2, int[] arr, int[] arr2) {
//		int[] answer = new int[num + num2];
//		
//		for (int i = 0; i < num; i++) {		
//			answer[i] = arr[i];
//		}
//		
//		int cnt = 0;
//		for (int i = num; i < num+num2; i++) {
//			answer[i] = arr2[cnt];
//			cnt++;
//		}
//		
//		Arrays.sort(answer);
//		Arrays.toString(answer);
//		
//		return answer;
//	}
//	public static void main(String[] args) {
//		Num3_1 T = new Num3_1();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		for (int i = 0; i < num; i++) {
//			arr[i] = sc.nextInt();
//		}
//		int num2 = sc.nextInt();
//		int[] arr2 = new int[num2];
//		for (int i = 0; i < num2; i++) {
//			arr2[i] = sc.nextInt();
//		}
//		for (int x : T.solution(num, num2, arr, arr2)) {
//			System.out.print(x + " ");
//		}
//		sc.close();
//	}
	
	
	
	/* 백준 방식1 */
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[] arr = new int[num];
//		
//		for (int i = 0; i < num; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		int num2 = sc.nextInt();
//		int[] arr2 = new int[num2];
//		
//		for (int i = 0; i < num2; i++) {
//			arr2[i] = sc.nextInt();
//		}
//		
//		int[] answer = new int[num + num2];
//		
//		for (int i = 0; i < num; i++) {			// answer[i] 번째에 arr[i] 번째 값을 넣어줌.
//			answer[i] = arr[i];
//		}
//		
//		int cnt = 0;							
//		for (int i = num; i < num+num2; i++) {		// answer[i]번째 부터(num 번째 까지는 이미 넣어 둠.) num + num2 만큼 반복 
//			answer[i] = arr2[cnt];					// answer[i]번째에 arr2[cnt]값을 넣어주고 넣고 난 후 cnt를 1 증가시켜줌.
//			cnt++;
//		}
//		
//		Arrays.sort(answer);						// Arrays.sort 를 이용해서 answer를 오름차순으로 정렬해줌.
//		Arrays.toString(answer);					// Arrays.toString 을 이용해서 지금까지의 answer 값을 출력해줄 수 있게 만들어줌.
//		
//		for (int x: answer) {
//			System.out.print(x + " ");
//		}
//		
//		sc.close();
//	}
	
	
	
	
	/* 백준 방식2 */
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] arr = new int[num];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int num2 = Integer.parseInt(br.readLine());
		int[] arr2 = new int[num2];
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < num2; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] answer = new int[num + num2];
		
		for (int i = 0; i < num; i++) {		
			answer[i] = arr[i];
		}
		
		int cnt = 0;
		for (int i = num; i < num+num2; i++) {
			answer[i] = arr2[cnt];
			cnt++;
		}
		
		Arrays.sort(answer);
		Arrays.toString(answer);
		
		for (int x: answer) {
			System.out.print(x + " ");
		}
		
		br.close();
	}

}
