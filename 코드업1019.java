
package ������;

import java.util.Scanner;

public class �ڵ��1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine(); // 2020.10.24
		
		//���ڿ� .�������� ������ ()
		String[] split = data.split("\\.");
		
		// int�� ����ȯ
		int[] arr = new int[3];
		
		for (int i = 0; i < 3; i++)
		{
			arr[i] = Integer.parseInt(split[i]); // ���ڿ��� ������ �ٲ�
		}
		
		// printf: ���Ŀ� ���� ���
		System.out.printf("%04d.%02d.%02d", arr[0], arr[1], arr[2]);
		sc.close();
	}
}