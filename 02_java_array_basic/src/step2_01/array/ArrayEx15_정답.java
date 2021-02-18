package step2_01.array;

import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임
 * 
 * 1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다.
 * 2. 정답을 맞추면 back에 해당 숫자를 저장해,
 *    back에 모든 수가 채워지면 게임은 종료된다.
 * 예)
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * 입력1 : 2
 * 입력2 : 4
 * 
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 1, 0, 1, 0, 0, 0, 0, 0]
 * 
 * 입력1 : 5
 * 입력2 : 7
 * 
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 1, 0, 1, 2, 0, 2, 0, 0]
 * 
 */
//2021-02-18 20:03
public class ArrayEx15_정답 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int[] front = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
		int[] back = new int[10];
		int temp = 0;
		int tempRan = 0;
		int cnt = 0;
		boolean isRunning = true;

		// 셔플 구현(Shuffle) : 배열의 요소들을 무작위로 섞음
		while (cnt < 1000) {
			tempRan = ran.nextInt(9);
			temp = front[0];
			front[0] = front[tempRan];
			front[tempRan] = temp;
			cnt++;
		}

		System.out.println("┌──────────────────────────────────────────────────┐");
		System.out.println("│                  기억력 게임                     │");
		System.out.println("├──────────────────────────────────────────────────┤");
		System.out.println("│ 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임 │");
		System.out.println("│    정답을 맞추면 back에 해당 숫자를 저장해       │");
		System.out.println("│    back에 모든 수가 채워지면 게임은 종료된다.    │");
		System.out.println("│    숫자 순서 { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 }    │");
		System.out.println("└──────────────────────────────────────────────────┘");

		while (isRunning) {

			// <-- front array -->

			System.out.print("fornt >>   { ");
			for (int j = 0; j < 10; j++) {
				System.out.print(front[j] + " ");
				if (j < front.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.print("}");
			System.out.println();

			// <-- back array -->

			System.out.print("back >>    { ");
			for (int j = 0; j < 10; j++) {
				System.out.print(back[j] + " ");
				if (j < back.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.print("}");
			System.out.println();

			if (back[0] == 0 || back[1] == 0 || back[2] == 0 || back[3] == 0 || back[4] == 0 || back[5] == 0
					|| back[6] == 0 || back[7] == 0 || back[8] == 0 || back[9] == 0) {

				System.out.print("입력 1 : ");
				int getNumber1 = scan.nextInt();
				System.out.print("입력 2 : ");
				int getNumber2 = scan.nextInt();
				System.out.println("────────────────────────────────────────────────────");
				if (front[getNumber1] == front[getNumber2]) {
					back[getNumber1] = front[getNumber1];
					back[getNumber2] = front[getNumber2];

				} else {
					System.out.println("┌──────────────────────────────────────────────────┐");
					System.out.println("│                   틀렸습니다.                    │");
					System.out.println("└──────────────────────────────────────────────────┘");
				}

			} else {
				System.out.println("┌──────────────────────────────────────────────────┐");
				System.out.println("│                    게임 끝                       │");
				System.out.println("└──────────────────────────────────────────────────┘");
				isRunning = false;
			}
		}

	}

}
