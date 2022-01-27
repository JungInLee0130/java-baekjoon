package 연습용;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class 백준10814 {

	public static void main(String[] args) {
		/*<String, Value>: <Key, Value>*/ 
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 10만 까지
		
		HashMap<String, Integer> member_map = new HashMap<>();
		
		for (int i = 0; i < N; i++) {
			// 나이, 이름 공백구분
			int age = sc.nextInt();
			String name = sc.next();
			member_map.put(name, age);
			//sc.nextLine(); // 다음에 정수가 옴
		}
		// 1. 나이순 2. 나이가같으면 가입한 순.
		// HashMap value값 정렬
		/*
		 * List<Entry<String, Integer>> list_entries = new
		 * ArrayList<Entry<String,Integer>>(member_map.entrySet());
		 * Collections.sort(list_entries, new Comparator<Entry<String, Integer>>(){
		 * public int compare(Entry<String,Integer> obj1, Entry<String, Integer> obj2) {
		 * return obj1.getValue().compareTo(obj2.getValue()); } });
		 */
		List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(member_map.entrySet());
		Collections.sort(list_entries, new Comparator<Entry<String, Integer>>(){
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
				return obj1.getValue().compareTo(obj2.getValue());
			}
		});
		
		//해시맵 전체 출력
		for (Entry<String, Integer> entrySet : list_entries) {
			System.out.println(entrySet.getValue() + " " + entrySet.getKey());
		}
		
		sc.close();
	}

}
