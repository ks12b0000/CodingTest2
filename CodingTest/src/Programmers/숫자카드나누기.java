package Programmers;

import java.util.Arrays;

public class 숫자카드나누기 {
	public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        
        int aGcd = gcd(arrayA, arrayA[0]);
        int bGcd = gcd(arrayB, arrayB[0]);
        
        answer = getAnswer(answer, arrayB, aGcd);
        answer = getAnswer(answer, arrayA, bGcd);
        
        return answer;
    }
	static int getAnswer(int answer, int[] array, int gcd) {
		for (int num : array) {
			if (num % gcd == 0) {
				return Math.max(answer, 0);
			}
		}
		return Math.max(answer, gcd);
	}
    static int gcd(int[] array, int num) {
    	int maxGcd = 1;
        for (int i = 2; i <= num; i++) {
        	if (check(array, i)) {
        		maxGcd = i;
        	}
        }
        return maxGcd;
    }
    static boolean check(int[] array, int i) {
    	for (int num : array) {
    		if (num % i != 0) {
    			return false;
    		}
    	}
    	return true;
    }
}
