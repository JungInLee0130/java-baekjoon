package 연습용;

import java.util.Scanner;

public class 백준1018 {
	public static int making_chess(char[][] chess, int row, int column) {
		int cnt = 0;
		Boolean TF;
		Boolean chess_color;
		
		if (chess[0][0] == 'B') {
			chess_color = true;
			TF = true;
		}
		else {
			chess_color = false;
			TF = false;
		}
		for (int i = row - 8; i < row; i++) {
			for (int j = column - 8; j < column; j++) {
				if (chess[i][j] == 'B') {
					chess_color = true;
				}else {
					chess_color = false;
				}
				if (chess_color != TF) {
					cnt++;
				}
				TF = !TF;
			}
			TF = !TF;
		}
		
		cnt = Math.min(cnt, 64 - cnt); // 검정 시작과 흰시작중 작은것을 cnt에 대입.
		
		return cnt;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[][] chess = new char[N][M];
		int min = 64;

		for (int i = 0; i < N; i++) {
			String line = sc.next();
			chess[i] = line.toCharArray();
		}
		for (int i = 8; i <= N; i++) {
			for (int j = 8; j <= M; j++) {
				min = Math.min(min, making_chess(chess, i, j));
			}
		}
		System.out.println(min);
		sc.close();
	}
}

/*
 * for (int i = 0; i < N; i++) { for (int j = 0; j < M; j++) {
 * System.out.print(chess[i][j]); } System.out.println(); }
 */
