package ������;

import java.util.Scanner;

public class �ڵ��1024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		
		for (int i = 0; i < word.length(); i++) {
			System.out.println("\'" + word.charAt(i) + "\'");
		}
	}

}
