package 연습용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class P1194 {

	static int N, M;
	static char[][] arr;

	public static void main(String[] arg) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		N = Integer.parseInt(str.substring(0, 1));
		M = Integer.parseInt(str.substring(2, 3));
		arr = new char[N + 1][M + 1];

		for (int i = 0; N > i; ++i) {

			str = br.readLine();

			arr[i] = str.toCharArray();

		}
        
        System.out.println(arr[0][7] == 1);     //  false
	System.out.println(arr[0][7] == '1');	//  true
    
    
    	arr[0][7] = 9;
	System.out.println(arr[0][7]);		//  tap키공백
	arr[0][7] = '9';
	System.out.println(arr[0][7]);		// 9
	arr[0][7]++;
	System.out.println(arr[0][7]);		//  :

	}

}