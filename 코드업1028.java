package ������;

import java.util.Scanner;

public class �ڵ��1028 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		int vInt = Integer.parseUnsignedInt(number);
		String sInt = Integer.toUnsignedString(vInt);
		
		System.out.println(sInt);
		
		sc.close();
	}
}
