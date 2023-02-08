package Programmers;

import java.util.ArrayList;
import java.util.Scanner;

public class Num1_12 {
	public int solution(int[] ingredient) {
        int answer = 0;
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int in : ingredient) { // int in에 ingredient를 차례대로 넣어줌
        	arr.add(in); // arr에 차례대로 들어온 in 값을 저장.
        	System.out.println(arr);
        	if (arr.size() >= 4) { // arr크키가 4랑 같거나 크면
        		if (arr.get(arr.size() - 4) == 1 && arr.get(arr.size() - 3) == 2 && 
        				arr.get(arr.size() - 2) == 3 && arr.get(arr.size() - 1) == 1) { // 마지막 4자리 값이 1,2,3,1 이면 
        			answer++; // answer 증가하고 arr에서 지워줌.
        			arr.remove(arr.size() - 4);
        			arr.remove(arr.size() - 3);
        			arr.remove(arr.size() - 2);
        			arr.remove(arr.size() - 1);
        		}
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Num1_12 T = new Num1_12();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] ingredient = new int[num];
		for (int i = 0; i < num; i++) {
			ingredient[i] = sc.nextInt();
		}
		System.out.println(T.solution(ingredient));
		sc.close();
	}
}
