package 연습용;

import java.util.Scanner;

public class 코드업1023 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		
		String[] split = num.split("\\."); // 길이 2, . -> 제어문자
		
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
