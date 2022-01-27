package 연습용;

import java.util.Arrays;
import java.util.Comparator;

public class 이차원배열정렬 {

	public static void main(String[] args) {
		int[][] arr = {{3,5}, {4,2}, {3,4}};
		
		//2차원 배열 정렬 0번째열 다음 1번째 열 기준(다중 배열 정렬)
		Arrays.sort(arr,new Comparator<int[]>(){
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) {
					return o1[1] - o2[1];
				}else {
					return o1[0] - o2[0];
				}
			}
		});
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
