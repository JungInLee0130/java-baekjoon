package 연습용;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class la4 {
	public boolean solution(String[] phone_book) {
		for (int i = 0; i < phone_book.length - 1; i++) {
			for (int j = i + 1; j < phone_book.length; j++) {
				if (phone_book[i].startsWith(phone_book[j])) {return false;}
				if (phone_book[j].startsWith(phone_book[i])) {return false;}
			}
		}
		return true;
	}
}

public class 전화번호목록 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] phone_book = { "119", "97674223", "1195524421" };
		la4 la = new la4();
		System.out.println(la.solution(phone_book));
		sc.close();
	}
}
