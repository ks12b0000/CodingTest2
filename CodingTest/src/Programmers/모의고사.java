package Programmers;

import java.util.ArrayList;

public class 모의고사 {
	public int[] solution(int[] answers) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		int[] num1 = {1, 2, 3, 4, 5};
		int[] num2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int a = 0;
		int b = 0;
		int c = 0;
		
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == num1[i % 5]) a++;
			if (answers[i] == num2[i % 8]) b++;
			if (answers[i] == num3[i % 10]) c++;
		}
		
		int max = Math.max(a, Math.max(b, c));
		
		if (max == a) answer.add(1);
		if (max == b) answer.add(2);
		if (max == c) answer.add(3);
		
        return answer.stream().mapToInt(x -> x).toArray();
    }
}
