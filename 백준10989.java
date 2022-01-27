package 연습용;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class 백준10989 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String s_N = bf.readLine();
		int N = Integer.parseInt(s_N);
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			String s_temp = bf.readLine();
			array[i] = Integer.parseInt(s_temp);
		}
		Arrays.sort(array);
		for (int i = 0 ; i < N; i++) {
			bw.write(String.valueOf(array[i]) + "\n");
		}
		bw.flush();
		bw.close();
	}
}
