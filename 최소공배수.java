// 최대공약수 최소공배수
package 연습용;

import java.util.Scanner;

class Solution {
	int[] answer = new int[2];

	public int gcd(int n, int m) {
		int gcd_num = 1;
		int a, b;

		b = n % m;
		while (b != 0) {
			b = n % m;

			if (b == 0) {
				gcd_num = m;
				break;
			} else {
				n = m;
				m = b;
			}
		}
		return gcd_num;
	}

	public int LCM(int n, int m) {
		if (answer[0] != 1)
		{
			return answer[0] * (n / answer[0]) * (m / answer[0]);
		}
		return n * m;
	}

	public int[] solution(int n, int m) {

		int i, j;

		// gcd
		if (n > m) {
			answer[0] = gcd(n, m);
		} else {
			answer[0] = gcd(m, n);
		}
		//System.out.println(answer[0]);
		// LCM
		answer[1] = LCM(m, n);

		return answer;
	}

}

public class 최소공배수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Solution s = new Solution();
		int[] a = {};
		int n, m;
		n = sc.nextInt();
		m = sc.nextInt();

		a = s.solution(n, m);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		sc.close();
	}
}