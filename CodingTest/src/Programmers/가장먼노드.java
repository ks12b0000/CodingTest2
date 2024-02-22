package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 가장먼노드 {
	static boolean[] visit;
    static int[] count;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public int solution(int n, int[][] edge) {
        int answer = 0;
        visit = new boolean[n + 1];
        count = new int[n + 1];
        
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] arr : edge) {
            int from = arr[0];
            int to = arr[1];
            
            graph.get(from).add(to);
            graph.get(to).add(from);
        }
        
        bfs(1);      
        
        Arrays.sort(count);
        int max = count[n];
        
        for (int num : count) {
            if (max == num) {
                answer++;
            }
        }
        
        return answer;
    }
    static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        visit[start] = true;
        queue.add(start);
        count[start] = 1;
        
        while (!queue.isEmpty()) {
            int num = queue.poll();
            for (int i = 0; i < graph.get(num).size(); i++) {
                int next = graph.get(num).get(i);
                if (!visit[next]) {
                    count[next] = count[num] + 1;
                    visit[next] = true;
                    queue.add(next);
                }
            }
        }
    }
}
