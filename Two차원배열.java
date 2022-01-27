package 연습용;

public class Two차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] array4 = new int[3][4];
		array4[0][0] = 10;
		
		int[][] array5 = new int[3][]; // 열단위는 아직 생성안됨, 각각 배열의 길이가 다른배열 생성가능
		//array5[0][0] = 10; // -> null 오류뜸
		
		array5[0] = new int[1]; // 0행에 1차원 배열 할당
		
		int[][] array6= {{1}, {1,2}, {1,2,3}};
		
		System.out.println(array6[0][0]);
		
		System.out.println(array6[2][2]);
	}

}
