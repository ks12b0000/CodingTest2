package BaekJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Num10757 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());
		a = a.add(b); // a.add(b) = BigInteger 객체와 파라미터(인자)로 들어온 BigInteger객체의 더한 값을 BigInteger 타입으로 반환한다.
		System.out.println(a);
		
		sc.close();
	}
}
