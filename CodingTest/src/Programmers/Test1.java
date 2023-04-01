package Programmers;

public class Test1 {
	static int g1;
    static int g2;
    static int g12;
    public long solution(int n, int c, int d, String[] a, int[] b) {
        long answer = 0;
        int min = Integer.MAX_VALUE;
        G1(a, b, c);
        G2(a, b, d);
        G12(a, b, c, d);
    
        Math.min(G1(a, b, c), Math.min(G12(a, b, c, d), G2(a, b, d)));
        
        return answer;
    }
    static int G1 (String[] a, int[] b, int c) {
        for (int i = 0; i < a.length; i++) {
            g1 += b[i] % (c * 10);
        }
		return g1;
    }
    static int G2 (String[] a, int[] b, int d) {
        int tmp = 1;
        for (int i = 0; i < a.length; i++) {
            tmp *= b[i];
        }
        g2 = (tmp * tmp) * d;
        return g2;
    }
    static int G12 (String[] a, int[] b, int c, int d) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("fan")) {
                g12 += b[i] % (c * 10);
            }
            else if (a[i].equals("Fan")) {
                g12 += b[i] * d;
            }
        }
        return g12;
    }
}
