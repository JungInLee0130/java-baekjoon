package 연습용;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class 백준10814_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		ArrayList<member> member_list = new ArrayList<member>();
		int N = sc.nextInt();
		
		// 정보 입력
		for (int i = 0; i < N; i++) {
			member_list.add(new member(sc.nextInt(), sc.next()));
		}
		
		//정렬
		// 나이순
		// 나이가 같으면 그냥 유지
		Collections.sort(member_list, new Comparator<member>() {
			@Override
			public int compare(member m1, member m2) {
				return m1.get_member_age() - m2.get_member_age(); 
			}
		});
		
		for (int i = 0; i < member_list.size(); i++) {
			System.out.println(member_list.get(i).get_member_age() + " " + member_list.get(i).get_member_name());
		}
		sc.close();
	}

}

class member{
	private int age;
	private String name;
	
	public member(int age, String name) {
		this.age = age;
		this.name = name;
	}// setter랑 동시에
	
	public int get_member_age() {
		return this.age;
	}
	public String get_member_name() {
		return this.name;
	}
}