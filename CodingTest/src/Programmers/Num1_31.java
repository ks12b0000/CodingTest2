//package Programmers;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Num1_31 {
//	public String solution(int[] numbers, String hand) {
//        String answer = "";
//        ArrayList<Integer> left = new ArrayList<>();
//        ArrayList<Integer> right = new ArrayList<>();
//        
//        for (int i = 0; i < numbers.length; i++) {
//        	if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
//        		answer += "L";
//        		left.add(numbers[i]);
//        	}
//        	else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
//        		answer += "R";
//        		right.add(numbers[i]);
//        	}
//        	else if (numbers[i] == 2 || numbers[i] == 5 || numbers[i] == 8 || numbers[i] == 0) {
//        		if (left.size() - 1>= 5) {
//        			if (numbers[i] - left.get(left.size() - 1) > right.get(right.size() - 1) - numbers[i]) {
//            			answer += "R";
//            			right.add(numbers[i]);
//            		}
//        			else if (numbers[i] - left.get(left.size() - 1) < right.get(right.size() - 1) - numbers[i]){
//            			answer += "L";
//            			left.add(numbers[i]);
//            		}
//        		}
//        		else if (left.size() - 1 == 0 || right.size() - 1 == 0) {
//        			if (numbers[i] > numbers[i]) {
//            			answer += "R";
//            			right.add(numbers[i]);
//            		}
//        			else if (numbers[i] < numbers[i]){
//            			answer += "L";
//            			left.add(numbers[i]);
//            		}
//        		}
//        		else if (left.size() - 1 < 5){
//        			if (left.get(left.size() - 1) - numbers[i] > numbers[i] - right.get(right.size() - 1)) {
//            			answer += "R";
//            			right.add(numbers[i]);
//            		}
//        			else if (left.get(left.size() - 1) - numbers[i] < numbers[i] - right.get(right.size() - 1)){
//            			answer += "L";
//            			left.add(numbers[i]);
//            		}
//        		}   	
//        		else {
//        			if (hand == "right") {
//        				answer += "R";
//        				right.add(numbers[i]);
//        			}
//        			else {
//        				answer += "L";
//        				left.add(numbers[i]);
//        			}
//        		}
//        	}
//        }
//        
//        return answer;
//    }
//	public static void main(String[] args) {
//		Num1_31 T = new Num1_31();
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int[] numbers = new int[num];
//		for (int i = 0; i < num; i++) {
//			numbers[i] = sc.nextInt();
//		}
//		String hand = sc.next();
//		System.out.println(T.solution(numbers, hand));
//		sc.close();
//	}
//}
