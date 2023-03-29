//package Programmers;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//
//public class Num1_1 {
//	public int[] solution(String[] park, String[] routes) {
//        int[] idx = new int[2];
//        
//        for (int i = 0; i < park.length; i++) {
//        	for (int j = 0; j < park[i].length(); j++) {
//        		if (park[i].charAt(j) == 'S') {
//        			idx[0] = i;
//        			idx[1] = j;
//        		}
//        	}
//        }
//
//        for (int i = 0; i < routes.length; i++) {
//        	if (routes[i].charAt(0) == 'E') {
//        		for (int j = 1; j <= routes[i].charAt(2); j++) {
//        			if(idx[1] + j >= park[0].length()) break;
//        			if (park[idx[0]].charAt(idx[1] + j) == 'X') {
//        				break;
//        			}
//        			else {
//        				idx[1] = idx[1] + Character.getNumericValue(routes[i].charAt(2));
//        			}
//        		}
//        	}
//        	else if (routes[i].charAt(0) == 'S') {
//        		for (int j = 1; j <= routes[i].charAt(2); j++) {
//        			if (idx[0] + j >= park.length) break;
//        			if (park[idx[0] + j].charAt(idx[1]) == 'X') {
//        				break;
//        			}
//        			else {
//        				idx[0] = idx[0] + Character.getNumericValue(routes[i].charAt(2));
//        			}
//        		}       		
//        	}
//        	else if (routes[i].charAt(0) == 'W') {
//        		for (int j = 1; j <= routes[i].charAt(2); j++) {
//        			if (idx[1] - j < 0) break;
//        			if (park[idx[0]].charAt(idx[1] - j) == 'X') {
//        				break;
//        			}
//        			else {
//        				idx[1] = idx[1] - Character.getNumericValue(routes[i].charAt(2));
//        			}
//        		}       		
//        	}
//        	else if (routes[i].charAt(0) == 'N') {
//        		for (int j = 1; j <= routes[i].charAt(2); j++) {
//        			if (idx[0] - j < 0) break;
//        			if (park[idx[0] - j].charAt(idx[1]) == 'X') {
//        				break;
//        			}
//        			else {
//        				idx[0] = idx[0] - Character.getNumericValue(routes[i].charAt(2));
//        			}
//        		}       		
//        	}
//        	
//        }
//                
//        return idx;
//    }
//	public static void main(String[] args) throws IOException {
//		Num1_1 T = new Num1_1();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		String[] park = new String[n];
//		for (int i = 0; i < n; i++) {
//			park[i] = br.readLine();
//		}
//		
//		int m = Integer.parseInt(br.readLine());
//		String[] routes = new String[m];
//		for (int i = 0; i < m; i++) {
//			routes[i] = br.readLine();
//		}
//		
//		for (int x : T.solution(park, routes)) {
//			System.out.print(x + " ");
//		}
//		
//		br.close();
//	}
//}
// 다시 풀기..