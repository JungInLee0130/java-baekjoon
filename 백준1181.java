package 연습용;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 백준1181 {
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		sc.nextLine();
		
		String[] str = new String[N];
		// 문자열 입력
		for (int i = 0; i < N; i++) {
			str[i] = sc.nextLine();
		}
		
		/* 정렬 
		 * 1. 길이가 짧은것부터
		 * 2. 길이가 같으면 사전순으로*/
		Arrays.sort(str, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2) {
				if(o1.length() == o2.length()) { // 길이가 같으면
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
