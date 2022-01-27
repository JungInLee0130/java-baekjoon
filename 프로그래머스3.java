package 연습용;

import java.util.Scanner;

class la {
    public static long solution(int a, int b) {
        long sum = 0;
		/*
		 * if (b > a > 0) if (b > a) { // b (b + 1) / 2 - a (a + 1) / 2 + a answer = b *
		 * (b + 1) / 2 - a * (a + 1) / 2 + a; } else { answer = a * (a + 1) / 2 - b * (b
		 * + 1) / 2 + b; }
		 */
        if (b > a) {
        	for (int i = a; i <= b; i++) {
        		sum += i;
        	}
        }
        else {
        	for (int i = b; i <= a; i++) {
        		sum += i;
        	}
        }
        return sum;
    }
}
public class 프로그래머스3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		la l = new la();
		System.out.println(la.solution(a, b));
		sc.close();
	}
}
