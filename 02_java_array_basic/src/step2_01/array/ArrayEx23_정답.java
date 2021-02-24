package step2_01.array;

import java.util.Scanner;

/*
 * # ATM[3단계]
 * 
 * 1. 가입
 *  - 계좌번호와 비밀번호를 입력받아 가입
 *  - 계좌번호 중복검사
 * 2. 탈퇴
 *  -  계좌번호를 입력받아 탈퇴
 */

public class ArrayEx23_정답 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] accs = { 1001, 1002, 0, 0, 0 };
		int[] pws = { 1111, 2222, 0, 0, 0 };

		int check = -1;
		int accCheck = -1;
		int accsCnt = 2;
		int selectMenu = 0;
		boolean isRun = true;

		while (isRun) {
			
			System.out.println("┌───────────┐");
			System.out.println("│    ATM    │");
			System.out.println("├───────────┤");
			System.out.println("│  1.가입   │");
			System.out.println("│  2.탈퇴   │");
			System.out.println("│  3.종료   │");
			System.out.println("└───────────┘");
			System.out.println("────────────────────────────────────");
			
			System.out.print("메뉴 선택 : ");
			selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				
				System.out.println("────────────────────────────────────");
				System.out.print("계좌번호 4자리를 입력해주세요 : ");
				int accNumber = scan.nextInt();

				int accNumberLength = (int) (Math.log10(accNumber) + 1);

				// <-- accNumberLength check -->
				if (accNumberLength == 4) {

					// 있는 계좌인지 확인
					for (int i = 0; i < accs.length; i++) {
						
						//없으면
						if (accs[i] != accNumber) {
							accCheck = i;
						} 
						
						//있으면
						else if (accs[i] == accNumber) {
							System.out.println("┌───────────────────────┐");
							System.out.println("│ 이미 있는 계좌입니다. │");
							System.out.println("└───────────────────────┘");
							accCheck = -1;
							break;
						}
					}
					
					// 없는 계좌면
					if (accCheck != -1) {
						
						System.out.println("────────────────────────────────────");
						System.out.print("비밀번호 4자리를 입력해주세요 : ");
						int pwNumber = scan.nextInt();

						int pwNumberLength = (int) (Math.log10(pwNumber) + 1);

						// 비밀번호가 4자리인지 확인 맞으면 입력한 값 넣기
						
						if (pwNumberLength == 4) {

							for (int j = 0; j < pws.length; j++) {
								if (pws[j] == 0) {
									pws[j] = pwNumber;
									break;
								}

							}
							
							for (int j = 0; j < accs.length; j++) {
								if (accs[j] == 0) {
									accs[j] = accNumber;
									break;
								}
							}
					
							
//                          <-- array value check -->
							
//							System.out.println("───────────────────");
//							for (int j = 0; j < pws.length; j++) {
//
//								System.out.println(" 계좌     " + j + " , " + accs[j] + " ");
//								System.out.println(" 비밀번호 " + j + " , " + pws[j] + " ");
//
//							}
//							System.out.println("───────────────────");
							
							accsCnt += 1;
							
							System.out.println("┌──────────────┐");
							System.out.println("│   가입완료   │");
							System.out.println("└──────────────┘");
						} // if pwNumberLength

						else {
							System.out.println("┌─────────────────────────────────────┐");
							System.out.println("│   4자리의 비밀번호를 입력해주세요   │");
							System.out.println("└─────────────────────────────────────┘");
						}
					} // if accCheck 
				} // if accNumberLength

				else {
					System.out.println("┌─────────────────────────────────────┐");
					System.out.println("│   4자리의 계좌번호를 입력해주세요   │");
					System.out.println("└─────────────────────────────────────┘");
				}

			} // .selectMenu == 1

			else if (selectMenu == 2) {
				System.out.println("┌─────────────────────────┐");
				System.out.println("│   탈퇴를 누르셨습니다   │");
				System.out.println("└─────────────────────────┘");
				
				System.out.println("────────────────────────────────────");
				System.out.print("탈퇴하실 계좌번호를 입력해주세요 : ");
				int accNumber = scan.nextInt();

				int accNumberLength = (int) (Math.log10(accNumber) + 1);

				// 계좌번호가 4자리인지
		
				if (accNumberLength == 4) {

					// 계좌번호에서 존재하는 계좌번호인지 확인
					for (int i = 0; i < accs.length; i++) {
						if (accs[i] == accNumber) {
							accCheck = i; // 계좌번호의 인덱스
						}
					}

					// 있는계좌면
					if (accCheck != -1) {
						
						System.out.println("────────────────────────────────────");
						System.out.print("비밀번호를 입력해주세요 : ");
						int pwNumber = scan.nextInt();

						int pwNumberLength = (int) (Math.log10(pwNumber) + 1);

						// 비밀번호가 4자리인지 확인 맞으면
						if (pwNumberLength == 4) {
							
							check = -1;
							
							for (int i = 0; i < pws.length; i++) {
								
								// 입력한 비밀번호가 있는 번호인지 확인
								// && 계좌번호와 비밀번호 인덱스 번호가 같은지
								// 있으면
								
								if (pws[i] == pwNumber) {
//									System.out.println("비밀번호 일치");
									if (i == accCheck) {
										check = i; // 계좌,비밀번호 인덱스
//										System.out.println("인덱스 일치");
									}
								}
							}
							  
							if (check != -1) {
								for (int j = check; j < accsCnt - 1; j++) {
									accs[j] = accs[j + 1];
									pws[j] = pws[j + 1];
								}
								accs[accsCnt - 1] = 0;
								pws[accsCnt - 1] = 0;
								accsCnt--;

//								System.out.println("───────────────────");
//								for (int j = 0; j < pws.length; j++) {
//									System.out.println(" 계좌     " + j + " , " + accs[j] + " ");
//									System.out.println(" 비밀번호 " + j + " , " + pws[j] + " ");
//								}
//								System.out.println("───────────────────");
								
								System.out.println("┌────────────────────────────┐");
								System.out.println("│       탈퇴되었습니다       │");
								System.out.println("│   이용해주셔서 감사합니다  │");
								System.out.println("└────────────────────────────┘");
								
							} else {
								System.out.println("┌────────────────────────────┐");
								System.out.println("│    잘못된 비밀번호입니다   │");
								System.out.println("└────────────────────────────┘");
							}
						} else {
							System.out.println("┌───────────────────────────────────┐");
							System.out.println("│  4자리의 비밀번호를 입력해주세요  │");
							System.out.println("└───────────────────────────────────┘");
						}

					} else {
						System.out.println("┌─────────────────────┐");
						System.out.println("│   없는 계좌입니다   │");
						System.out.println("└─────────────────────┘");
					}
				}

				else {
					System.out.println("┌───────────────────────────────┐");
					System.out.println("│4자리의 계좌번호를 입력해주세요│");
					System.out.println("└───────────────────────────────┘");
					
				}

			} // .selectMenu == 2

			else if (selectMenu == 3) {
				System.out.println("┌───────────────────────────┐");
				System.out.println("│    종료를 누르셨습니다    │");
				System.out.println("│   프로그램이 종료됩니다   │");
				System.out.println("└───────────────────────────┘");
				isRun = false;

			} // .selectMenu == 3

		} // .while end
		
		scan.close();
	}
}
