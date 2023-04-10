package Programmers;

import java.util.Arrays;
import java.util.Collections;

public class 최솟값만들기 {
	public int solution(int[] A, int[] B) {
        int answer = 0;        
        Arrays.sort(A);
        Integer[] Barr = new Integer[B.length];
        for (int i = 0; i < B.length; i++) {
        	Barr[i] = B[i];
        }
        
        Arrays.sort(A);
        Arrays.sort(Barr, Collections.reverseOrder());
        
        for (int i = 0; i < A.length; i++) {
        	answer += A[i] * Barr[i];
        }

        return answer;
    }
}
