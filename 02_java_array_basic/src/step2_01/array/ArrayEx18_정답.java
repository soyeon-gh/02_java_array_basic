package step2_01.array;

import java.util.Random;
import java.util.Scanner;

/*
 * # 미니마블
 * 
 * 1. 플레이어는 p1과 p2 2명이다.
 * 2. 1p는 사용자가 1~3 사이의 숫자를 입력해 이동하고 2p는 랜덤값으로 1~3값으로 이동한다.
 * 3. 이동하다가 다음 플레이어와 같은 위치에 놓이게 되면,
 *    상대 플레이어는 잡히게 되어 원점으로 되돌아간다.
 * 4. 먼저 3바퀴를 돌면 이긴다.
 *    
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p1사용자]1~3 입력 : 3 
 *
 *  1 2 3 4 5 6 7 8  
 *  0 0 0 1 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p2컴퓨터] : 3
 *  [p2컴퓨터]가 p1을 잡았다! 
 *  
 *  1 2 3 4 5 6 7 8 
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  0 0 0 2 0 0 0 0  [0바퀴]
 * [p1사용자]1~3 입력 : 
 *
 *
 *
 */

//2021-02-19 20:50
public class ArrayEx18_정답 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		int[] game = { 0, 1, 2, 3, 4, 5, 6, 7 };
		int[] p1 = { 0, 0, 0, 0, 0, 0, 0, 0 };
		int[] p2 = { 0, 0, 0, 0, 0, 0, 0, 0 };

		int turn = 0;

		int idx1 = 0;
		int idx2 = 0;
		p1[idx1] = 1;
		p2[idx2] = 2;

		int win1 = 0;
		int win2 = 0;

		boolean isRunning = true;

		while (isRunning) {

			// <-- System.out.print -->

			// <-- index print -->

			System.out.println();
			System.out.print(" index       {");
			for (int i = 0; i < game.length; i++) {
				System.out.print(game[i]);
				if (i < game.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println("}");

			// <-- p1 user print -->

			System.out.print(" p1 user     {");
			for (int i = 0; i < p1.length; i++) {
				System.out.print(p1[i]);
				if (i < p1.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.print("}");
			System.out.println(" [" + win1 + "바퀴]");

			// <-- p2 computer -->

			System.out.print(" p2 computer {");
			for (int i = 0; i < p2.length; i++) {
				System.out.print(p2[i]);
				if (i < p2.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.print("}");
			System.out.println(" [" + win2 + "바퀴]");
			System.out.println();

			// <-- game start -->

			if (turn % 2 == 0) {
				System.out.println("───────────────────────────────────");
				System.out.print("[p1사용자] 1 ~ 3 입력 : ");
				int userP1 = scan.nextInt();

				if (userP1 <= 3) {

					p1[idx1] = 0;
					idx1 = idx1 + userP1;

					if (idx1 >= 8) {
						win1 += 1;
					}

					idx1 = idx1 % 8;

					p1[idx1] = 1;
					System.out.println("───────────────────────────────────");
				} else {
					System.out.println("───────────────────────────────────");
					System.out.println("1 ~ 3 까지 수를 입력하세요");
					System.out.println("───────────────────────────────────");
				}
			} else if (turn % 2 == 1) {
				System.out.println("───────────────────────────────────");
				int computer = random.nextInt(3) + 1;

				p2[idx2] = 0;
				idx2 = idx2 + computer;

				if (idx2 >= 8) {
					win2 += 1;
				}

				idx2 = idx2 % 8;

				p2[idx2] = 2;

				System.out.println("[p2 computer] : " + computer);
				System.out.println("───────────────────────────────────");
			}

			turn++;

			// <-- winner -->

			if (win1 == 3) {
				System.out.println("p1 user 승!");
				isRunning = false;
			} else if (win2 == 3) {
				System.out.println("컴퓨터 승!");
				isRunning = false;
			}

			// <-- Same location -->

			if (idx1 == idx2 && idx1 != 0 && turn % 2 == 0) {
				System.out.println("───────────────────────────────────");
				System.out.println("p1 user 가 computer를 잡았습니다.");
				System.out.println("───────────────────────────────────");

				p2[idx2] = 0;
				idx2 = 0;
				p2[idx2] = 2;

			} else if (idx1 == idx2 && idx2 != 0 && turn % 2 == 1) {
				System.out.println("───────────────────────────────────");
				System.out.println("computer 가 p1 user를 잡았습니다.");
				System.out.println("───────────────────────────────────");

				p1[idx1] = 0;
				idx1 = 0;
				p1[idx1] = 1;

			}

		}
		scan.close();
	}

}
