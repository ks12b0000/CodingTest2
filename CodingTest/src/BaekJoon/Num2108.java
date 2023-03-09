package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Num2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		double sum = 0.0;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		Arrays.sort(arr);
		
		boolean flag = false;
		int mode_max = 0;
		int mode = 0;
		
		for(int i = 0; i < n; i++) {
			int jump = 0;	// 동일한 수가 나온만큼 i 값 jump 시킬 변수 
			int count = 1;
			int i_value = arr[i];
			
			for(int j = i + 1; j < n; j++){
				if(i_value != arr[j]) {
					break;
				}
				count++;
				jump++;
			}
			
			if(count > mode_max) {
				mode_max = count;
				mode = i_value;
				flag = true;
			}
			else if(count == mode_max && flag == true) {
				mode = i_value;
				flag = false;
			}
			i += jump;
		}
		
		System.out.println(Math.round(sum / n));
		System.out.println(arr[arr.length / 2]);
		System.out.println(mode);
		System.out.println(arr[arr.length - 1] - arr[0]);
		
		
		br.close();
	}
}
