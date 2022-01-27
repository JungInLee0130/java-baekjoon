package ������;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ����1181 {
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		sc.nextLine();
		
		String[] str = new String[N];
		// ���ڿ� �Է�
		for (int i = 0; i < N; i++) {
			str[i] = sc.nextLine();
		}
		
		/* ���� 
		 * 1. ���̰� ª���ͺ���
		 * 2. ���̰� ������ ����������*/
		Arrays.sort(str, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) { // ���̰� ������
					return o1.compareTo(o2);
				} else {
					return o1.length() - o2.length();
				}
			}
		});
		
		for (int i = 0; i < N - 1; i++) {
			if (!str[i].equals(str[i + 1])) {
				System.out.println(str[i]);
			}
		}
		System.out.println(str[str.length - 1]);
		
		sc.close();
	}
}
