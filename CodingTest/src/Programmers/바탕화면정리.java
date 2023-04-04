package Programmers;

public class 바탕화면정리 {
	// 2번째 방식
	public int[] solution(String[] wallpaper) {
        int[] answer = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        
        for (int i = 0; i < wallpaper.length; i++) {
        	for (int j = 0; j < wallpaper[i].length(); j++) {
        		if (wallpaper[i].charAt(j) == '#') {
        			answer[0] = Math.min(answer[0], i);
        			answer[1] = Math.min(answer[1], j);
        			answer[2] = Math.max(answer[2], i + 1);
        			answer[3] = Math.max(answer[3], j + 1);
        		}
        	}
        }
        
        return answer;
    }
	
	// 처음 푼 방식
//	public int[] solution(String[] wallpaper) {
//        int[] answer = new int[4];
//        
//        char[][] arr = new char[wallpaper.length][wallpaper[0].length()];
//        
//        for (int i = 0; i < arr.length; i++) {
//        	for (int j = 0; j < arr[i].length; j++) {
//        		arr[i][j] = wallpaper[i].charAt(j);
//        	}
//        }
//        
//        int lux = Integer.MAX_VALUE;
//        int luy = Integer.MAX_VALUE;
//        int rdx = Integer.MIN_VALUE;
//        int rdy = Integer.MIN_VALUE;
//        
//        for (int i = 0; i < arr.length; i++) {
//        	for (int j = 0; j < arr[i].length; j++) {
//        		if (arr[i][j] == '#') {
//        			luy = Math.min(luy, i);
//        			lux = Math.min(lux, j);
//        		}
//        	}
//        }
//        
//        for (int i = 0; i < arr.length; i++) {
//        	for (int j = 0; j < arr[i].length; j++) {
//        		if (arr[i][j] == '#') {
//        			rdy = Math.max(rdy, i + 1);
//        			rdx = Math.max(rdx, j + 1);
//        		}
//        	}
//        }
//        
//        answer[0] = luy;
//        answer[1] = lux;
//        answer[2] = rdy;
//        answer[3] = rdx;
//        
//        return answer;
//    }
}
