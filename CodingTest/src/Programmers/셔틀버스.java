package Programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class 셔틀버스 {
	// 87.5점 나옴. 내일 다시 풀기
	public String solution(int n, int t, int m, String[] timetable) {
        String answer = "";
        
        String[] start = new String[n + 1];
        
        int sum = 0;
        int hh = 9;
        for (int i = 0; i < n; i++) {
            if (sum >= 60) {
                hh++;
                sum -= 60;
            }
            if (hh < 10) {
                start[i + 1] = "0" + hh + ":" + sum;
            }
            if (sum < 10) {
                start[i + 1] = hh + ":" + "0" + sum;
            }
            if (hh < 10 && sum < 10) {
                start[i + 1] = "0" + hh + ":" + "0" + sum;
            }
            if (hh > 9 && sum > 9) {
                start[i + 1] = hh + ":" + sum;
            }            
            sum += t;
        }
        
        // for (String s : startHH) {
        // 	System.out.println(s);
        // }
        
        int[][] time = new int[timetable.length][2];
        
        for (int i = 0; i < timetable.length; i++) {
            String[] arr = timetable[i].split(":");
            time[i][0] = Integer.parseInt(arr[0]);
            time[i][1] = Integer.parseInt(arr[1]);
        }
        
        Arrays.sort(time, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] != o2[0]) {
					return o1[0] - o2[0];
				}
				else {
					return o1[1] - o2[1];
				}
			}
		});
        
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            String[] arr = start[i].split(":");
            int startHH = Integer.parseInt(arr[0]);
            int startMM = Integer.parseInt(arr[1]);
            for (int j = 0; j < timetable.length; j++) {
                if (!queue.contains(time[j]) && queue.size() < n * m) {
                    if (startHH > time[j][0]) {
                        queue.add(time[j]);
                    }
                    else if (startHH == time[j][0] && startMM >= time[j][1]) {
                        queue.add(time[j]);
                    }
                }
                
            }
            
        }
        while (!queue.isEmpty()) {

            if (queue.size() >= m) {
                break;
            }
            else {
                queue.poll();
            }
        }
        
        int a = 0;
        int b = 0;
        if (queue.isEmpty()) {
            String str = start[n];
            answer = str;
        }
        else {
            int[] num = ((LinkedList<int[]>) queue).get(queue.size() - 1); 
            a = num[0];
            if (num[1] - 1 < 0) {
                b = 60 + (num[1] - 1);
                a--;
            }
            else {
                b = (num[1] - 1);
            }
            if (a < 10) {
                answer = "0" + a + ":" + b;
            }
            if (b < 10) {
                answer = a + ":" + "0" + b;
            }
            if (a < 10 && b < 10) {
                answer = "0" + a + ":" + "0" + b;
            }
            if (a > 9 && b > 9) {
                answer = a + ":" + b;
            }
        }
        
//        for (int[] s : queue) {
//        	System.out.println(s[0] + " " + s[1]);
//        }
        
        return answer;
    }
}
