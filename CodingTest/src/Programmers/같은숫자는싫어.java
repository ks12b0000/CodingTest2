package Programmers;

import java.util.ArrayList;
import java.util.Stack;

public class 같은숫자는싫어 {
	public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        
        for (int num : arr) {
            if (!stack.isEmpty() && stack.peek() == num) {
                continue;
            }
            else {
                stack.add(num);
            }
        }
        
        stack.forEach(t -> answer.add(t));
        
        
        return answer.stream().mapToInt(x -> x).toArray();
    }
}
