package 연습용;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class fla {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
        	int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1] - 1);
        	Arrays.sort(temp);
        	answer[i] = temp[commands[i][2] - 1];
        }
        return answer;
    }
}
public class 프로그래머스1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		fla f = new fla();
		int[] answer = {};
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[][] commands;
		
		for (Integer i : list) {
			list.add(i);
		}
		
		for ()
		
		sc.close();
	}
}
