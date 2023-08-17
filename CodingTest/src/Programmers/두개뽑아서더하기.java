package Programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class 두개뽑아서더하기 {
	public int[] solution(int[] numbers) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
                
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        for (int num : set) {
            answer.add(num);
        }
        
        Collections.sort(answer);
        
        return answer.stream().mapToInt(x -> x).toArray();
    }
}
