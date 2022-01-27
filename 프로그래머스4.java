package 연습용;

import java.util.ArrayList;
import java.util.Scanner;

class la2 {
	public static void set_corrdinate(int[] hand, int number) {
		char[][] smartphone = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { '*', 0, '#' } };

		switch (number) {
		case 1:
			hand[0] = 0;
			hand[1] = 0;
			break;
		case 2:
			hand[0] = 0;
			hand[1] = 1;
			break;
		case 3:
			hand[0] = 0;
			hand[1] = 2;
			break;
		case 4:
			hand[0] = 1;
			hand[1] = 0;
			break;
		case 5:
			hand[0] = 1;
			hand[1] = 1;
			break;
		case 6:
			hand[0] = 1;
			hand[1] = 2;
			break;
		case 7:
			hand[0] = 2;
			hand[1] = 0;
			break;
		case 8:
			hand[0] = 2;
			hand[1] = 1;
			break;
		case 9:
			hand[0] = 2;
			hand[1] = 2;
			break;
		case 0:
			hand[0] = 3;
			hand[1] = 1;
			break;
		}
	}

	public static int distance(int[] hand, int[] temp_corrdinate) {
		return Math.abs(hand[0] - temp_corrdinate[0]) + Math.abs(hand[1] - temp_corrdinate[1]);
	}

	public String solution(int[] numbers, String hand) {
		String Keypad = "";
		int[] left = { 3, 0 };
		int[] right = { 3, 2 };

		for (int number : numbers) {
			switch (number) {
			case 1:
			case 4:
			case 7:
				set_corrdinate(left, number);
				Keypad += "L";
				break;
			case 3:
			case 6:
			case 9:
				set_corrdinate(right, number);
				Keypad += "R";
				break;
			case 2:
			case 5:
			case 8:
			case 0:
				int[] temp_corrdinate = new int[2];
				set_corrdinate(temp_corrdinate, number);
				int left_distance = distance(left, temp_corrdinate);
				int right_distance = distance(right, temp_corrdinate);

				if (left_distance > right_distance) {
					Keypad += "R";
					set_corrdinate(right, number);
				} else if (right_distance > left_distance) {
					Keypad += "L";
					set_corrdinate(left, number);
				} else { // 같은경우
					if (hand.equals("left")) { // 왼손잡이
						Keypad += "L";
						set_corrdinate(left, number);
					} else { // 오른손잡이
						Keypad += "R";
						set_corrdinate(right, number);
					}
				}
				break;
			}
		}
		
		return Keypad;
	}
}

public class 프로그래머스4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		la2 l = new la2();
		//int[] numbers = new int[10];
		int[] numbers = {1, 2, 1, 2, 3, 2, 1, 2, 3, 2, 1};
		String hand = "right";
		/*for (int i = 0; i < 10; i++) {
			numbers[i] = sc.nextInt();
		}*/
		//sc.nextLine();
		//String hand = sc.nextLine();
		System.out.println(l.solution(numbers, hand));
		sc.close();
	}
}
