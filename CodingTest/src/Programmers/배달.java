package Programmers;

import java.util.ArrayList;

public class 배달 {
	static ArrayList<ArrayList<Node>> list = new ArrayList<>();
    static boolean[] visit;
    static boolean[] visit2;
    public int solution(int N, int[][] road, int K) {
        int answer = 0;
        visit = new boolean[N + 1];
        visit2 = new boolean[N + 1];
        
        for (int i = 0; i < N + 1; i++) {
             list.add(new ArrayList<>());
        }

        for (int i = 0; i < road.length; i++) {
            list.get(road[i][0]).add(new Node(road[i][1], road[i][2]));
            list.get(road[i][1]).add(new Node(road[i][0], road[i][2]));
        }
        
        visit[1] = true;
        visit2[1] = true;
        dfs(1, K, 0);
        
        for (int i = 1; i <= N; i++) {
            if (visit2[i]) {
                answer++;
            }
        }

        return answer;
    }
    static void dfs(int num, int k, int sum) {        
        for (int i = 0; i < list.get(num).size(); i++) {
        	Node node = list.get(num).get(i);
        	
        	if (!visit[node.cur] && node.dist + sum <= k) {
        		visit[node.cur] = true;
                visit2[node.cur] = true;
        		dfs(node.cur, k, sum + node.dist);
                visit[node.cur] = false;
        	}
        }        
    }
}

class Node {
    int cur;
    int dist;
    
    public Node(int cur, int dist) {
        this.cur = cur;
        this.dist = dist;
    }
}
