package step2_01.array;

import java.util.Random;
import java.util.Scanner;

/*
 * # 1 to 50[1단계] : 1 to 4
 * 
 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
 * 2. 사용자는 가장 작은수 1부터(다음은 2) 순서대로 해당 위치 값을 입력한다.
 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
 
 * 예)
 * [ 4 2 3 1 ]
 * 
 * 입력 : 3  (가장 작은수 1이 3번째에 위치 )
 * 4 2 3 9
 * 입력 : 1  ( 그 다음으로 작은 수 2가 1번째에 위치 )
 * 4 9 3 9
 * 입력 : 2  ( 그 다음으로 작은 수 3이 2번째에 위치 )
 * 4 9 9 9
 * 입력 : 0  ( 그 다음으로 작은 수 4가 0번째에 위치 )
 * 9 9 9 9
 * 
 * 코드 종료
 */

//2021-02-19 19:24

public class ArrayEx16_정답 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[4];
		boolean[] isCheck = new boolean[4];
		int[] isCheckNumber = new int[4];
		boolean isRunning = true;

		// <-- arr Array -->

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 4 + 1);
			for (int j = 0; j < i; j++) {
				if (arr[j] == arr[i]) {
					i--;
				}
			}
		}

		// <-- isCheckNumber Array -->
		// arr의 배열의 작은 수가 들어있는 인덱스 번호

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				isCheckNumber[0] = i;
			} else if (arr[i] == 2) {
				isCheckNumber[1] = i;
			} else if (arr[i] == 3) {
				isCheckNumber[2] = i;
			} else if (arr[i] == 4) {
				isCheckNumber[3] = i;
			}
		}

		while (isRunning) {

			for (int i = 0; i < isCheck.length; i++) {
				
				if (isCheck[i] == false) {
					
					// <-- system.out.print -->
					
					for (i = 0; i < arr.length; i++) {
						System.out.print(arr[i] + " ");
					}
					System.out.println();

					for (i = 0; i < isCheckNumber.length; i++) {
						System.out.print(isCheckNumber[i] + " ");
					}
					System.out.println();

					for (i = 0; i < isCheck.length; i++) {
						System.out.print(isCheck[i] + " ");
					}
					System.out.println();
					
					// <-- system.out.print end -->
					
					
					System.out.print("입력 : ");
					int number = sc.nextInt();

					if (number == isCheckNumber[i]) {
						arr[i] = 9;
						isCheck[i] = true;
					} else if (number != isCheckNumber[i]) {
						System.out.println("틀렸습니다.");
					}

				} else if (isCheck[i] == true) {
					System.out.println("코드종료");
					isRunning = false;
				}
			}

		}

		// 받아온값이랑 비교

		sc.close();
	}

}
