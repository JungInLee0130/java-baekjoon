package 연습용;

import java.util.Scanner;

public class 코드업1028 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		int vInt = Integer.parseUnsignedInt(number);
		String sInt = Integer.toUnsignedString(vInt);
		
		System.out.println(sInt);
		
		sc.close();
	}
}
