package Programmers;

public class 이모티콘할인행사 {
	static double[] dis = new double[]{0.1, 0.2, 0.3, 0.4};
    static int maxPeople = 0;
    static int maxMoney = 0;
    public int[] solution(int[][] users, int[] emoticons) {
        int[] answer = new int[2];
        
        DFS(users, emoticons, new double[emoticons.length], 0);
        
        answer[0] = maxPeople;
        answer[1] = maxMoney;
        
        return answer;
    }
    static void DFS(int[][] users, int[] emoticons, double[] disCnt, int idx) {
        if (idx == emoticons.length) {
            int people = 0;
            int money = 0;
            for (int i = 0; i < users.length; i++) {
                int sum = 0;             
                for (int j = 0; j < disCnt.length; j++) {
                    if (disCnt[j] * 100 >= users[i][0]) {
                        sum += emoticons[j] - (emoticons[j] * disCnt[j]);
                    }
                }
                if (sum >= users[i][1]) {
                    people++;
                }
                else {
                    money += sum;
                }
            }
            if (maxPeople < people) {
                maxPeople = people;
                maxMoney = money;
            }
            else if (maxPeople == people){
                maxMoney = Math.max(maxMoney, money);
            }
            return;
        }
        for (int i = 0; i < 4; i++) {
            disCnt[idx] = dis[i];
            DFS(users, emoticons, disCnt, idx + 1);
        }
        
    }
}
