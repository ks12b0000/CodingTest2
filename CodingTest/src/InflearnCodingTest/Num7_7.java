package InflearnCodingTest;

import java.util.LinkedList;
import java.util.Queue;

class Node1 {
	int data;
	Node1 lt;
	Node1 rt;
	public Node1(int val) {
		data = val;
		lt = null;
		rt = null;
	}
}

public class Num7_7 { 
	Node1 root;
	public void BFS(Node1 root) {
		Queue<Node1> queue = new LinkedList<>();
		queue.offer(root);
		int L = 0;
		while (!queue.isEmpty()) {
			int len = queue.size();
			System.out.print(L + " : ");
			for (int i = 0; i < len; i++) {
				Node1 cur = queue.poll();
				System.out.print(cur.data + " ");
				if (cur.lt != null) {
					queue.offer(cur.lt);
				}
				if (cur.rt != null) {
					queue.offer(cur.rt);
				}
			}
			L++;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Num7_7 tree = new Num7_7();
		tree.root = new Node1(1);
		tree.root.lt = new Node1(2);
		tree.root.rt = new Node1(3);
		tree.root.lt.lt = new Node1(4);
		tree.root.lt.rt = new Node1(5);
		tree.root.rt.lt = new Node1(6);
		tree.root.rt.rt = new Node1(7);
		tree.BFS(tree.root);
	}
}
