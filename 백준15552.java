package 연습용;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(bf.readLine());
		try {
			for (int i = 0; i < T; i++) {
				// 1 이게 더 빠름
				StringTokenizer st = new StringTokenizer(bf.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				bw.write(a + b + "\n");
				/*
				 * //2 String s = bf.readLine(); String[] split = s.split(" "); // 정수 2개 공백포함해서
				 * 받음
				 * 
				 * bw.write(Integer.parseInt(split[0]) + Integer.parseInt(split[1]) + "\n");
				 */
			}

			bw.flush();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
