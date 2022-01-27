package ¿¬½À¿ë;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSample {
	public static void main(String[] args) {
		TreeMapSample ex = new TreeMapSample();
		ex.checkTreeMap();
	}
	
	public void checkTreeMap() {
		TreeMap<Integer, String> map = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			// Integer, String
			map.put(sc.nextInt(), sc.next());
		}
		
		System.out.println("map = " + map);
		
		Set<Map.Entry<Integer, String>> entries = map.entrySet();
		System.out.println("entries = " + entries);
		
		for (Map.Entry<Integer, String> tempEntry: entries) {
			System.out.println(tempEntry.getKey() + " - " + tempEntry.getValue());
		}
	}
}
