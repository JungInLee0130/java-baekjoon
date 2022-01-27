package 연습용;

import java.util.Scanner;

public class 코드업1025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 다섯자리
		int[] digit = new int[5];
		int i = 5;
		
		while (N != 0) {
			digit[i - 1] = N % 10;
			N /= 10;
			i--;
		}
		
		//System.out.printf("%d", digit[0]);
		
		for (i = 0; i < 5; i++) {
			System.out.printf("[%d]\n", digit[i] * (int)Math.pow(10, 4 - i));
		}
		
		sc.close();
	}
}
