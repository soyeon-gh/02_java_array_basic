package step2_01.array;

import java.util.Scanner;

/*
 * # 값 교체하기[2단계] 
 */

public class ArrayEx12_정답 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] arr = { 10, 20, 30, 40, 50 };
		int getIndex1, getIndex2;
		int getValue1, getValue2;
		int temp = 0;

		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예 1) 인덱스1 입력 : 1
		// 인덱스2 입력 : 3
		// {10, 40, 30, 20, 50}

		System.out.println("\n문제 1) 인덱스 2개를 입력받아 값 교체하기");
		System.out.println();

		System.out.print("인덱스 1 입력 >> ");
		getIndex1 = scan.nextInt();
		
		System.out.print("인덱스 2 입력 >> ");
		getIndex2 = scan.nextInt();
		
		temp = arr[getIndex1];
		arr[getIndex1] = arr[getIndex2];
		arr[getIndex2] = temp;

		System.out.print("{ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if (i < 4) {
				System.out.print(", ");
			}
		}
		System.out.print("}");
		System.out.println();

		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예 2) 값1 입력 : 10
		// 값2 입력 : 50
		// {50, 20, 30, 40, 10}

		System.out.println("문제 2) 값 2개를 입력받아 값 교체하기");
		System.out.println();
		
		System.out.print("값 1 입력 >> ");
		getValue1 = scan.nextInt();
		
		System.out.print("값 2 입력 >> ");
		getValue2 = scan.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if (getValue1 == arr[i]) {
				arr[i] = getValue2;
			}else if(getValue2 == arr[i]) {
				arr[i] = getValue1;
			}
		}
		
		System.out.print("{ ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if (i < 4) {
				System.out.print(", ");
			}
		}
		
		System.out.print("}");
		System.out.println();
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예 3) 학번1 입력 : 1002
		// 학번2 입력 : 1003
		// {87, 45, 11, 98, 23}
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores = { 87, 11, 45, 98, 23 };
		
		System.out.println("문제 3) 학번 2개를 입력받아 성적 교체하기");
		System.out.println();
		
		System.out.print("학번 1 입력 >> ");
		int getNumber1 = scan.nextInt();
		
		System.out.print("학번 2 입력 >> ");
		int getNumber2 = scan.nextInt();
		
		int index1 = 0;
		int index2 = 0;
		
		for (int i = 0; i < hakbuns.length; i++) {
			if (getNumber1 == hakbuns[i]) {
				index1 = i;
			}else if(getNumber2 == hakbuns[i]) {
				index2 = i;
			}
		}
		
		temp = scores[index1];
		scores[index1] = scores[index2];
		scores[index2] = temp;
		
		System.out.print("{ ");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
			if (i < 4) {
				System.out.print(", ");
			}
		}
		System.out.print("}");
		System.out.println();
		
		scan.close();

	}

}
