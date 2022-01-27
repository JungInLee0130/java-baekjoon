package 연습용;

import java.util.Arrays;
import java.util.Scanner;

class pu {
	public String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
	    int i;
		try {
			for (i = 0; i < completion.length; i++) {
				if (!participant[i].equals(completion[i])) {
					return participant[i];
				}
			}
			return participant[i];
		} catch (ArrayIndexOutOfBoundsException e) {
			return participant[completion.length];
		}
	}
}

public class 프로그래머스2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] participant = { "mislav", "stanko", "mislav", "ana" };
		String[] completion = { "stanko", "ana", "mislav" };
		pu p = new pu();

		p.solution(participant, completion);
		sc.close();
	}
}
