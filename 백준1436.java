package 연습용;

import java.util.Scanner;

public class 백준1436 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int number = 0;
		int count = 0;
		
		while (count <= N) {
			String s_number = Integer.toString(number);// int -> String
			
			if (s_number.contains("666")) {
				count++;
			}
			if (count == N) {
				break;
			}
			number++;
		}
		
		System.out.println(number);
		sc.close();
	}
}
