package step2_01.array;

import java.util.Scanner;

/*
 * 
 * # 영화관 좌석예매
 * 
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * [X] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 1
 * [X] [O] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 
 * [X] [O] [X] [O] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 *
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 이미 예매가 완료 되었습니다.
 * 
 * [X] [O] [X] [O] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (2번 입력)
 * ----------------------
 * 매출액 : 24000원
 * 
 */

public class ArrayEx09_정답 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		char seat[] = { 'X', 'X', 'X', 'X', 'X', 'X', 'X' };
		int price = 12000;
		int totalPrice = 0;
		boolean isRuuning = true;
		while (isRuuning) {
			System.out.println("1. 좌석예매");
			System.out.println("2. 종료");
			System.out.print("선택해주세요 : ");
			int selectNumber = scan.nextInt();
			if (selectNumber == 1) {
				System.out.println("===============================");
				System.out.println("1. 좌석예매를 선택하셨습니다.");
				System.out.println("===============================");
				System.out.print("좌석 : ");
				for (int i = 0; i < seat.length; i++) {
					System.out.print("[" + seat[i] + "]");
				}
				System.out.println();
				System.out.println("===============================");

				System.out.print("좌석선택(1~7) : ");
				int selectSeat = scan.nextInt();

				if (seat[selectSeat - 1] == 'X') {
					seat[selectSeat - 1] = 'O';
					totalPrice += price;
					System.out.println("===============================");
					System.out.print("좌석 : ");
					for (int i = 0; i < seat.length; i++) {
						System.out.print("[" + seat[i] + "]");
					}
					System.out.println();
					System.out.println("===============================");
				} else if (seat[selectSeat - 1] == 'O') {
					System.out.println("이미 예약되어있는 좌석입니다.");
				}

			} else if (selectNumber == 2) {
				System.out.println("===============================");
				System.out.println("2. 종료를 선택하셨습니다.");
				System.out.println("===============================");
				System.out.println("금액 : " + totalPrice + "원 입니다.");
				isRuuning = false;

			} else {
				System.out.println("1, 2번 중 입력해주세요.");
			} 
		}
		scan.close();
	}

}
