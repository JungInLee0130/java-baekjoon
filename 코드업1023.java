package ������;

import java.util.Scanner;

public class �ڵ��1023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		
		String[] split = num.split("\\."); // ���� 2, . -> �����
		
		int[] arr = new int[2];
		
		for (int i = 0; i < 2; i++) {
			arr[i] = Integer.parseInt(split[i]);
		}
		
		for (int i = 0; i < 2; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
	}

}
