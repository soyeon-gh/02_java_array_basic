package step2_01.array;

import java.util.Scanner;

/*
 * # 숫자이동[1단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 
 * @) 정답을 보지않고 소스를 동작시켜 본뒤에 내용을 이해하고 코드를 작성할 것
 * 
 */
//2021-02-18 19:44
public class ArrayEx14_정답 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] game = { 0, 0, 2, 0, 0, 0, 0 };
		int player = 0;
		boolean isRunning = true;
		for (int i = 0; i < 7; i++) {
			if (game[i] == 2) {
				player = i;
			}
		}

		while (isRunning) {
			System.out.println("\n                  숫자이동");
			System.out.println("===================================================");
			System.out.println("숫자2는 캐릭터");
			System.out.println("숫자1을 입력하면, 캐릭터가 왼쪽으로");
			System.out.println("숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.");
			System.out.println("양 끝에 도달하면 게임을 종료합니다.");
			System.out.println("===================================================");
			System.out.print("{ ");
			for (int i = 0; i < game.length; i++) {
				System.out.print(game[i] + " ");
				if (i < game.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.print("}");
			System.out.println();
			System.out.println("===================================================");
			System.out.print("숫자를 입력해주세요 >> ");
			int getNumber = scan.nextInt();
			if (getNumber == 1) {

				for (int i = 0; i < game.length; i++) {
					
					if (game[0] != 2) {
						
						if (game[i] == 2) {
							game[i] = 0;
							i--;
							game[i] = 2;
						}
					} else {
						System.out.println("======================");
						System.out.println("게임 종료합니다.");
						System.out.println("======================");
						i = game.length;
						isRunning = false;
					}
				}

			} else if (getNumber == 2) {
				
				for (int i = 0; i < game.length; i++) {
					
					if (game[6] != 2) {
						if (game[i] == 2) {
							game[i] = 0;
							i++;
							game[i] = 2;
						} 
					} else {
						System.out.println("======================");
						System.out.println("게임 종료합니다.");
						System.out.println("======================");
						i = game.length;
						isRunning = false;
					}
				}
			} else {
				System.out.println("1과 2만 입력해주세요.");
			}
		}

	}

}
