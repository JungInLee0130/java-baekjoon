
package ������;

import java.util.Scanner;

public class �ڵ��1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		
		String[] split = num.split("-"); // �����°��̹Ƿ� �迭�� �޾������
		
		int[] arr = new int[2];
		
		for (int i = 0; i < 2; i++) {
			arr[i] = Integer.parseInt(split[i]);
		}
		
		for (int i = 0; i < 2; i++) {
			System.out.print(split[i]);
		}
		
		
	}
}