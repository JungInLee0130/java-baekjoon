package 연습용;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class 백준2750 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(bf.readLine());
		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			array.add(Integer.parseInt(bf.readLine()));
		}
		Collections.sort(array);
		for (int i = 0 ; i < N; i++) {
			bw.write(array.get(i) + "\n");
		}
		bw.flush();
		bw.close();
		bf.close();
	}
}
