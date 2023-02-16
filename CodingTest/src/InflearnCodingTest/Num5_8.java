package InflearnCodingTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Num5_8 {
	public int solution(int n, int m, int[] patient) {
		int answer = 0;
		Queue<Integer> queue = new LinkedList<>();
		
		for (int i = 0; i < n; i++) {
			queue.offer(patient[i]);
		}
				
		return answer;
	}
	public static void main(String[] args) {
		Num5_8 T = new Num5_8();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] patient = new int[n];
		for (int i = 0; i < n; i++) {
			patient[i] = sc.nextInt();
		}
		System.out.println(T.solution(n, m, patient));
		sc.close();
	}
}
