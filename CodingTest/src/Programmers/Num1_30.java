package Programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Num1_30 {
	
	// 방법1 (HashSet 사용, 중복값 제거해주고 정렬은 안됨.)
//	public int[] solution(int[] numbers) {
//        HashSet<Integer> hashSet = new HashSet<>();
//        
//        for (int i = 0; i < numbers.length; i++) {
//        	for (int j = i + 1; j < numbers.length; j++) {
//        		hashSet.add(numbers[i] + numbers[j]); // numbers를 2개씩 다 더해서 저장해줌.
//        	}
//        }
//        int[] answer = hashSet.stream().mapToInt(x -> x).toArray(); 
		  // answer배열에 hashSet에 저장한 값들을 stream을 이용해서 int로 변환 후 toArray이용해서 배열로 저장
//        Arrays.sort(answer); // Arrays.sort이용해서 answer를 정렬해줌.
//        
//        return answer;
//    }
	
	// 방법2 (TreeSet 사용, 중복값 제거해주고 정렬까지 해줌.)
	public int[] solution(int[] numbers) {
		TreeSet<Integer> answer = new TreeSet<>();
		for (int i = 0; i < numbers.length; i++) {
        	for (int j = i + 1; j < numbers.length; j++) { 
        		answer.add(numbers[i] + numbers[j]); // numbers를 2개씩 다 더해서 저장해줌.
        	}
        }
		return answer.stream().mapToInt(x -> x).toArray(); // answer를 stream이용해서 int로 변환 후 toArray이용해서 배열로 출력
	}
	public static void main(String[] args) {
		Num1_30 T = new Num1_30();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] numbers = new int[num];
		for (int i = 0; i < num; i++) {
			numbers[i] = sc.nextInt();
		}
		for (int x : T.solution(numbers)) {
			System.out.print(x + " ");
		}
		sc.close();
	}
}
