package Programmers;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class 섬연결하기 {
	static boolean[] visit;
    static int sum = 0;
    static ArrayList<ArrayList<Node3>> graph = new ArrayList<>();
    public int solution(int n, int[][] costs) {
        int answer = 0;
        visit = new boolean[n];
        
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int[] cost : costs) {
            int from = cost[0];
            int to = cost[1];
            int costValue = cost[2];
            
            graph.get(from).add(new Node3(to, costValue));
            graph.get(to).add(new Node3(from, costValue));
        }
        
        bfs();
                
        answer = sum;
        
        return answer;
    }
    static void bfs() {
        PriorityQueue<Node3> queue = new PriorityQueue<>();
        queue.add(new Node3(0, 0));
        
        while(!queue.isEmpty()) {
            Node3 node = queue.poll();
            
            if (!visit[node.next]) {
                visit[node.next] = true;
                sum += node.cost;
            }
            
            for (int i = 0; i < graph.get(node.next).size(); i++) {
                int next = graph.get(node.next).get(i).next;
                int cost = graph.get(node.next).get(i).cost;
                if (!visit[next]) {
                    queue.add(new Node3(next, cost));
                }                
            }
        }
    }
}
class Node3 implements Comparable<Node3> {
    int next;
    int cost;
    
    public Node3(int next, int cost) {
        this.next = next;
        this.cost = cost;
    }
    
    @Override
	public int compareTo(Node3 o) {
		return this.cost - o.cost;
	}
}
