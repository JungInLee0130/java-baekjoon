package 연습용;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class 백준11650 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] cord = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			cord[i][0] = sc.nextInt();
			cord[i][1] = sc.nextInt();
		}
		
		Arrays.sort(cord, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) {
					return o1[1] - o2[1];
				}else {
					return o1[0] - o2[0];
				}
			}
		});
		
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(cord[i][j] +" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
