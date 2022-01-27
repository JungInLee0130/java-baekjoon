package 연습용;

import java.util.Scanner;

public class 코드업1024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		
		for (int i = 0; i < word.length(); i++) {
			System.out.println("\'" + word.charAt(i) + "\'");
		}
	}

}
