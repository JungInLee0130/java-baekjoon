package 연습용;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 백준10814_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		
		// 입력받기 : 모두 String 으로 받음
		String[][] member_list = new String[N][2];
		for (int i = 0; i < N; i++) {
			member_list[i][0] = sc.next();
			member_list[i][1] = sc.next();
		}
		
		// 나이순 정렬
		Arrays.sort(member_list, new Comparator<String[]>() {
			@Override // 나이만 비교
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]); // String-> int 로 변환해서 계산하는게 나음.
			}
		});
		
		for (int i = 0; i < N; i++) {
			System.out.println(member_list[i][0] + " " + member_list[i][1]);
		}
		sc.close();
	}

}

