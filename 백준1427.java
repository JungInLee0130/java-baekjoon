package 연습용;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 백준1427 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String N = sc.nextLine();
		ArrayList<Integer> arr = new ArrayList<>();
		int k = 0;
		
		char[] number = N.toCharArray(); // String-> char[]
		int[] num = new int[number.length]; // char[] -> int[i]
		
		for (int i = 0; i < number.length; i++) {
			num[i] = number[i] - '0'; // 각각의 char-> int
		}
		
		Arrays.sort(num);
		
		for (int i = num.length - 1; i >= 0; i--) {
			System.out.print(num[i]);
		}
		
		sc.close();
	}
}
