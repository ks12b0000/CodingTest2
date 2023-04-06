package Programmers;


public class 연속된부분수열의합 {
//	public int[] solution(int[] sequence, int k) {
//        int[] answer = new int[2];
//        int[] arr = new int[sequence.length];
//        arr[0] = sequence[0];
//        
//        for (int i = 1; i < sequence.length; i++) {
//        	arr[i] = arr[i - 1] + sequence[i];
//        	if (sequence[i] == k) {
//        		answer[0] = i;
//        		answer[1] = i;
//        		break;
//        	}
//        	if (arr[i] == k) {
//        		answer[0] = 0;
//        		answer[1] = i;
//        	}
//        }
//        
//        for (int i = 0; i < arr.length - 1; i++) {
//        	if (arr[i + 1] > k && arr[i] < k) {
//        		answer[0] = i;
//        		answer[1] = i + 1;
//        	}
//        }
//        
//        return answer;
//    }
}
//1 2 3 4 5 
//1 3 6 10 15

//1 1 1 2 3 4 5
//1 2 3 5 8 12 17

//2 2 2 2 2
//2 4 6 8 10
