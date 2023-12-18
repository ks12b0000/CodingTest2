package Programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 호텔대실 {
//	public int solution(String[][] book_time) {
//      int answer = 1;
//      
//      // 입실 시간이 빠른 시간 별로 정렬 (분으로)
//      int[][] arr = new int[book_time.length][book_time[0].length];
//      
//      for (int i = 0; i < book_time.length; i++) {
//          for (int j = 0; j < book_time[i].length; j++) {
//              String[] num = book_time[i][j].split(":");
//              arr[i][j] = (Integer.parseInt(num[0]) * 60) + Integer.parseInt(num[1]);
//          }          
//      }
//              
//      Arrays.sort(arr, new Comparator<int[]>() {
//
//			@Override
//			public int compare(int[] o1, int[] o2) {
//				return o1[0] - o2[0];
//			}       	
//		});
//      
//      Queue<Integer> queue = new LinkedList<>();
//      queue.add(arr[0][1]);
//      int idx = 0;
//	
//      while (!queue.isEmpty()) {
//          idx++;
//          if (idx >= arr.length) break;
//          if (queue.peek() + 10 >= arr[idx][0]) {
//              queue.poll();
//          } else {
//              answer++;
//          }
//          queue.add(arr[idx][1]);
//      }
//      
//      return answer;
//  }
	
	
	// 정답
	public int solution(String[][] book_time) {
      int answer = 0;
      
      // 입실 시간이 빠른 시간 별로 정렬 (분으로)
      int[][] arr = new int[book_time.length][book_time[0].length];
      
      for (int i = 0; i < book_time.length; i++) {
          for (int j = 0; j < book_time[i].length; j++) {
              String[] num = book_time[i][j].split(":");
              arr[i][j] = (Integer.parseInt(num[0]) * 60) + Integer.parseInt(num[1]);
          }          
      }
              
      Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
              if (o1[0] == o2[0]) {
                  return o1[1] - o2[1];
              } else {
                  return o1[0] - o2[0];
              }
			}       	
		});
      
      // 퇴실 시간이 제일 빠른 순으로 저장해두기 위해 PriorityQueue 사용
      PriorityQueue<Integer> queue = new PriorityQueue<>();
      queue.add(arr[0][1]);
      
      for (int i = 1; i < arr.length; i++){
          if (queue.peek() <= arr[i][0]){
              queue.poll();
          } 
          queue.add(arr[i][1] + 10);
      }
      
      answer = queue.size();
      
      return answer;
	}
}
