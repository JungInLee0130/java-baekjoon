
package 연습용;

import java.util.Scanner;

public class 코드업1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.nextLine(); // 2020.10.24
		
		//문자열 .기준으로 나누기 ()
		String[] split = data.split("\\.");
		
		// int로 형변환
		int[] arr = new int[3];
		
		for (int i = 0; i < 3; i++)
		{
			arr[i] = Integer.parseInt(split[i]); // 문자열을 정수로 바꿈
		}
		
		// printf: 형식에 맞춰 출력
		System.out.printf("%04d.%02d.%02d", arr[0], arr[1], arr[2]);
		sc.close();
	}
}