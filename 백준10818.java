//백준 10818번
package 연습용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준10818 {

	public static void main(String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();// String
		int N = Integer.parseInt(bf.readLine());
		int[] array = new int[N];
		
		for (int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(bf.readLine());
		}
		
		System.out.println(min(array, N)+ " " + max(array, N));
		sc.close();
	}
	
	public static int min(int[] array, int N) {
		int min_num = array[0];
		
		for (int i = 1; i < N; i++) {
			if (min_num > array[i]) {
				min_num = array[i];
			}
		}
		
		return min_num;
	}
	
	public static int max(int[] array, int N) {
		int max_num = array[0];
		
		for (int i = 0; i < N; i++) {
			if (max_num < array[i]) {
				max_num = array[i];
			}
		}
		
		return max_num;
	}
}