package ������;

import java.util.Scanner;

public class �ڵ��1025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // �ټ��ڸ�
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
