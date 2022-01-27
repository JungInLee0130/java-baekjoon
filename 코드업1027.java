package 연습용;

import java.util.Scanner;

public class 코드업1027 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		String[] split_date = date.split("\\.");
		int[] convert_date = new int[3];
		
		for (int i = 0; i < split_date.length; i++) {
			convert_date[i] = Integer.parseInt(split_date[2 - i]);
		}
		
		System.out.printf("%02d-%02d-%04d", convert_date[0], convert_date[1], convert_date[2]);
		
		sc.close();
	}
}