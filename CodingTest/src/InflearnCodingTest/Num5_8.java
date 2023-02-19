package InflearnCodingTest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
	int id;
	int priority;
	
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}

public class Num5_8 {
	public int solution(int n, int m, int[] patient) {
		int answer = 1;
		Queue<Person> queue = new LinkedList<>();
		
		for (int i = 0; i < n; i++) {
			queue.offer(new Person(i, patient[i]));
		}
		while (!queue.isEmpty()) {
			Person person = queue.poll();
			for (Person x : queue) {
				if (x.priority > person.priority) {
					queue.offer(person);
					person = null;
					break;
				}
			}
			if (person != null) {
				if (person.id == m) {
					return answer;
				}
				else {
					answer++;
				}
			}
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
