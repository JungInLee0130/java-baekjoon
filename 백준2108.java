package ������;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ����2108 {
	public static long manny(long[] array) {
		long[] count = new long[8001];
		long count_index = 0;
		ArrayList<Integer> max = new ArrayList<>();
		int i;
		Arrays.fill(count, 0);
		
		// -4000 <= array[i] <= 4000
		for (i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				count_index = 4000 + Math.abs(array[i]);
			}else {
				count_index = array[i];
			}
			count[(int)count_index]++;
		}
		
		int max_index = 0;
		
		for(i = 0; i < count.length; i++) {
			if (count[i] > count[max_index]) {
				max_index = i;
			}
		}
		
		for (i = 0; i < count.length; i++) {
			if (count[i] == count[max_index]) { // count�� ������
				if (i > 4000) {
					max.add(-(i-4000));
				}else {
					max.add(i);
				}
			}
		}
		// max_index�� 1�����
		if (max.size() == 1) {
			return max.get(0);
		}else { // max_index�� 2���϶�
			Collections.sort(max);
			return max.get(1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i, j;
		long[] array = new long[N];
		for (i = 0; i < N; i++) {
			array[i] = sc.nextLong();
		}
		Arrays.sort(array);
		//1. ������
		long sum = 0;
		for (i = 0; i < N; i++) {
			 sum += array[i];
		}
		double avg = (double)sum / N;
		long e = Math.round(Math.abs(avg));
		if (avg < 0) {
			e = -e;
		}
		System.out.println(e);
		//2. �߾Ӱ�
		System.out.println(array[(array.length - 1) / 2]);
		//3.�ֺ�
		// �̹� ���ĵ�.
		System.out.println(manny(array));

		// 4.����
		long range = array[N - 1] - array[0];
		System.out.println(range);
		
		sc.close();
	}
}
