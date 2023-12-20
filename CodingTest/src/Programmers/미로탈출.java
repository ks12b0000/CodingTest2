package Programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 미로탈출 {
	/* 코드 refactor 후 */
	static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
	public int solution(String[] maps) {
        int answer = 0;
        int startX = 0, startY = 0, leverX = 0, leverY = 0;

        for (int i = 0; i < maps.length; i++) {
            if (maps[i].contains("S")) {
            	startX = i;
            	startY = maps[i].indexOf("S");
            } 
            if (maps[i].contains("L")) {
            	leverX = i;
            	leverY = maps[i].indexOf("L");
            }           
        }        
        
        int startToLever = BFS(startX, startY, maps, 'L');
        int leverToEnd = BFS(leverX, leverY, maps, 'E');
        
        answer = (startToLever != -1 && leverToEnd != -1) ? startToLever + leverToEnd : -1;
        
        return answer;
    }
    static int BFS(int x, int y, String[] maps, char target) {
    	int[][] dis = new int[maps.length][maps[0].length()];
        boolean[][] check = new boolean[maps.length][maps[0].length()];
        
        Queue<int[]> queue = new LinkedList<>();		
		queue.offer(new int[] {x, y});
        check[x][y] = true;
        
        while (!queue.isEmpty()) {
			int[] n = queue.poll();
			
			if (maps[n[0]].charAt(n[1]) == target) {
				return dis[n[0]][n[1]];
			}
			
			for (int i = 0; i < 4; i++) {
				int nx = n[0] + dx[i];
				int ny = n[1] + dy[i];
				
				if (nx >= 0 && nx < maps.length && ny >= 0 && ny < maps[0].length() && !check[nx][ny] && maps[nx].charAt(ny) != 'X') {
					check[nx][ny] = true;
					queue.offer(new int[] {nx, ny});
                    dis[nx][ny] = dis[n[0]][n[1]] + 1;
				}
			}			
		}
        
        return -1;
    }
    
    
    /* 코드 refactor 전 */
//    static int[] dx = {-1, 0, 0, 1};
//    static int[] dy = {0, -1, 1, 0};
//    static char[][] ch;
//    static int[][] dis;
//    static int leverIdx, endIdx;
//    static int startX, startY, leverX, leverY;
//    static boolean[][] check;
//	public int solution(String[] maps) {
//        int answer = 0;
//        
//        ch = new char[maps.length][maps[0].length()];
//        check = new boolean[maps.length][maps[0].length()];
//        dis = new int[maps.length][maps[0].length()];
//
//        for (int i = 0; i < maps.length; i++) {
//            ch[i] = maps[i].toCharArray();
//            if (maps[i].contains("S")) {
//            	startX = i;
//            	startY = maps[i].indexOf("S");
//            } 
//            if (maps[i].contains("L")) {
//            	leverX = i;
//            	leverY = maps[i].indexOf("L");
//            }
//        }        
//        
//        startToLeverBFS(startX, startY);
//        check = new boolean[maps.length][maps[0].length()];
//        dis = new int[maps.length][maps[0].length()];
//        leverToEndBFS(leverX, leverY);
//        
//        if (leverIdx == -1 || endIdx == -1) {
//            return -1;
//        }
//        
//        answer = leverIdx + endIdx;
//        
//        return answer;
//    }
//    static void startToLeverBFS(int x, int y) {
//        Queue<int[]> queue = new LinkedList<>();
//		
//		queue.offer(new int[] {x, y});
//        check[x][y] = true;
//        boolean leverCheck = false;
//        
//        while (!queue.isEmpty()) {
//			int[] n = queue.poll();
//			
//			if (ch[n[0]][n[1]] == 'L') {
//				leverIdx = dis[n[0]][n[1]];
//				leverCheck = true;
//				break;
//			}
//			
//			for (int i = 0; i < 4; i++) {
//				int nx = n[0] + dx[i];
//				int ny = n[1] + dy[i];
//				
//				if (nx >= 0 && nx < ch.length && ny >= 0 && ny < ch[0].length && !check[nx][ny] && ch[nx][ny] != 'X') {
//					check[nx][ny] = true;
//					queue.offer(new int[] {nx, ny});
//                    dis[nx][ny] = dis[n[0]][n[1]] + 1;
//				}
//			}			
//		}
//        if (!leverCheck) {
//        	leverIdx = -1;
//        }
//    }
//    static void leverToEndBFS(int x, int y) {
//        Queue<int[]> queue = new LinkedList<>();
//		
//		queue.offer(new int[] {x, y});
//        check[x][y] = true;
//        boolean endCheck = false;
//        
//        while (!queue.isEmpty()) {
//			int[] n = queue.poll();
//			
//			if (ch[n[0]][n[1]] == 'E') {
//				endIdx = dis[n[0]][n[1]];
//				endCheck = true;
//				break;
//			}
//			
//			for (int i = 0; i < 4; i++) {
//				int nx = n[0] + dx[i];
//				int ny = n[1] + dy[i];
//				
//				if (nx >= 0 && nx < ch.length && ny >= 0 && ny < ch[0].length && !check[nx][ny] && ch[nx][ny] != 'X') {
//					check[nx][ny] = true;
//					queue.offer(new int[] {nx, ny});
//                    dis[nx][ny] = dis[n[0]][n[1]] + 1;
//				} 
//                
//			}			
//		}
//        if (!endCheck) {
//        	endIdx = -1;
//        }
//    }
}
