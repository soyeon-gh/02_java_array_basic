package step2_01.array;

import java.util.Scanner;

//2021-03-02 19:00

public class ArrayEx24_테스트문제1_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] a = { 10, 4, 5, 3, 1 };
		int sum = 0;
		int check = -1;
		int index = 0;
		int cArrayIndexNumber = 0;
		int max = 0;
		int cnt = 0;

		System.out.println("┌───────────────────────────────────────────────┐");
		System.out.println("│            ArrayEx24_테스트문제1_1            │");
		System.out.println("└───────────────────────────────────────────────┘");

		// 문제 1) 위 배열를 이용해서 전체 요소의 합출력 /////////////////////////////

		System.out.println(" 문제 1) 위 배열를 이용해서 전체 요소의 합출력");
System.out.println();
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		System.out.println(" 답 : " + sum);

		// 문제 2) 값을 입력하면 인덱스 출력 /////////////////////////////////////
		// 예) 5 ==> 2 , 1 ==> 4
		System.out.println("───────────────────────────────────────────────");
		System.out.println(" 문제 2) 값을 입력하면 인덱스 출력             ");

		System.out.print("  { ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i < a.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" }");
		System.out.println();
		System.out.print(" 값 입력 : ");
		int getValue = sc.nextInt();

		for (int i = 0; i < a.length; i++) {
			if (getValue == a[i]) {
				check = 0;
				index = i;
			}
		}

		if (check == 0) {
			System.out.println(" 값 : " + getValue + " ==> 인덱스 : " + index);
		} else if (check == -1) {
			System.out.println("┌──────────────────┐");
			System.out.println("│  없는 값 입니다  │");
			System.out.println("└──────────────────┘");
		}

		System.out.println();

		// 문제 3) 인덱스를 입력하면 값 출력 /////////////////////////////////////////
		// 예) 2 ==> 5 , 4 ==> 1

		System.out.println("───────────────────────────────────────────────");
		System.out.println(" 문제 3) 인덱스를 입력하면 값 출력");

		System.out.print("{ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i < a.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" }");
		System.out.println();
		System.out.print(" 인덱스 입력 : ");
		int getIndexNumber = sc.nextInt();

		if (getIndexNumber <= a.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[getIndexNumber] == a[i]) {
					System.out.println(" 인덱스 : " + getIndexNumber + " ==> 값 : " + a[i]);
				}
			}
		} else if (getIndexNumber > a.length || getIndexNumber < 0) {
			System.out.println("┌──────────────────────┐");
			System.out.println("│  없는 인덱스 입니다  │");
			System.out.println("└──────────────────────┘");
		}

		System.out.println();

		// 문제 4) 위 배열중 가장 큰 값 출력 /////////////////////////////////////////
		// 예) 10
		System.out.println("───────────────────────────────────────────────");
		System.out.println(" 문제 4) 위 배열중 가장 큰 값 출력");
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}

		System.out.println(" 답 : " + max);
		System.out.println();

		// 문제 5) 위 배열중 홀수의 개수 출력 /////////////////////////////////////////
		// 예) 홀수의 개수 : 3
		System.out.println("───────────────────────────────────────────────");
		System.out.println(" 문제 5) 위 배열중 홀수의 개수 출력");
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				cnt++;
			}
		}

		System.out.println(" 답 : " + cnt);
		System.out.println();

		// 문제 6) a의 값중 홀수만 b에 저장 /////////////////////////////////////////
		// (저장위치는 a와 b의 동일한 위치에 저장)
		// 예) b => {0, 0, 5, 3, 1}

		int[] b = { 0, 0, 0, 0, 0 };
		System.out.println("───────────────────────────────────────────────");
		System.out.println(" 문제 6) a의 값중 홀수만 b에 저장");
		System.out.println();
		System.out.print(" 답 : { ");
		for (int i = 0; i < b.length; i++) {
			if (a[i] % 2 == 1) {
				b[i] = a[i];
			}
			System.out.print(b[i]);
			if (i < b.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" }");
		System.out.println();

		// 문제 7) 다음 리스트를 이용해서 /////////////////////////////////////////
		// a의 값중 홀수만 c에 저장
		// (저장위치는 앞에서부터 저장 , 3번 문제와 다름)
		// 예) b => {5, 3, 1, 0, 0}

		int[] c = { 0, 0, 0, 0, 0 };
		System.out.println("───────────────────────────────────────────────");
		System.out.println(" 문제 7) 다음 리스트를 이용해서 a의 값중 홀수만 c에 저장");
		System.out.println();
		for (int i = 0; i < c.length; i++) {
			if (a[i] % 2 == 1) {
				c[cArrayIndexNumber] = a[i];
				cArrayIndexNumber++;
			}
		}

		System.out.print(" 답 : { ");
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
			if (i < c.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" }");

		sc.close();

	}

}
