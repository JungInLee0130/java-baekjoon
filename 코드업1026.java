package ������;

import java.util.Scanner;

public class �ڵ��1026 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.nextLine();
		String[] split = time.split(":");
		
		System.out.println(Integer.parseInt(split[1]));
		sc.close();
	}
}
