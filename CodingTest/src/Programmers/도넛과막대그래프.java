package Programmers;

import java.util.ArrayList;
import java.util.HashMap;

public class 도넛과막대그래프 {
	static int donutGraph = 0;
    static int rodGraph = 0;
    static int eightGraph = 0;
    static int startVertex = 0;
    static int cycleCount = 0;
    static boolean[] nextVisit;
    static boolean[] currentVisit;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public int[] solution(int[][] edges) {
        int[] answer = new int[4];
        
        // 나간 간선의 횟수 저장
        HashMap<Integer, Integer> outTrunk = new HashMap<>();
        // 들어온 간선의 횟수 저장
        HashMap<Integer, Integer> inTrunk = new HashMap<>();
        // 다음 정점 방문 여부 저장
        nextVisit = new boolean[1000001];
        // 현재 정점 방문 여부 저장
        currentVisit = new boolean[1000001];
        
        // 그래프 초기화
        for (int i = 0; i < 1000001; i++) {
        	graph.add(new ArrayList<>());
        }
        
        for (int i = 0; i < edges.length; i++) {
        	// edges를 돌면서 나간 간선, 들어온 간선의 횟수 저장
        	outTrunk.put(edges[i][0], outTrunk.getOrDefault(edges[i][0], 0) + 1);
        	inTrunk.put(edges[i][1], inTrunk.getOrDefault(edges[i][1], 0) + 1);
        	
        	// 그래프 연결
        	graph.get(edges[i][0]).add(edges[i][1]);
        }
        
        // 중심 정점
        int createdVertex = 0;
        
        for (int vertex : outTrunk.keySet()) {
        	// 나간 간선의 횟수가 2이상이고 들어온 간선의 횟수가 없는 경우의 정점이 중심 정점이다.
            if (outTrunk.get(vertex) >= 2 && !inTrunk.containsKey(vertex)) {
                createdVertex = vertex;
            }
        }
        
        for (int i = 0; i < graph.get(createdVertex).size(); i++) {
        	// 중심 정점에서 이동 한 정점은 그래프 시작 정점이다.
            startVertex = graph.get(createdVertex).get(i);
            cycleCount = 0;
            
            // 중심 정점에서 이동 한 정점부터 그래프 이동 확인
            findGraph(startVertex);
            
            // 순환 횟수가 1이라면 도넛 그래프++ 2이상이라면 8자 그래프++
            if (cycleCount == 1) {
                donutGraph++;
            } else if (cycleCount >= 2) {
                eightGraph++;
            }        
        }    
        
        answer[0] = createdVertex;
        answer[1] = donutGraph;
        answer[2] = rodGraph;
        answer[3] = eightGraph;
        
        return answer;
    }
    static void findGraph(int currentVertex) {	    
    	// 현재 정점에서 더 이상 이동 할 정점이 없는 경우 막대 그래프++
        if (graph.get(currentVertex).isEmpty()) {
            rodGraph++;
        } else {
        	// 현재 정점에서 이동 할 정점이 있는 경우
            for (int nextVertex : graph.get(currentVertex)) {
            	// 다음에 이동 할 정점 OR 현재 있는 정점에 방문한 적이 없는 경우
                if (!nextVisit[nextVertex] || !currentVisit[currentVertex]) {  
                	// 다음에 이동 할 정점이랑 처음 그래프 이동을 시작한 정점이랑 같은 경우 순환 횟수++
                    if (nextVertex == startVertex) {
                    	cycleCount++;
                    } else {
                    	// 다음에 이동 할 정점, 현재 있는 정점의 방문 여부 true
                    	nextVisit[nextVertex] = true;
                    	currentVisit[currentVertex] = true;
                    	
                    	// 다음 정점으로 이동
                        findGraph(nextVertex);
                        
                        // 다음에 이동 할 정점, 현재 있는 정점의 방문 여부 초기화
                        nextVisit[nextVertex] = false;
                        currentVisit[currentVertex] = false;
                    }
                }        
            }
        }
    }
}
