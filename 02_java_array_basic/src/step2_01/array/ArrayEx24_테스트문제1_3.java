package step2_01.array;

import java.util.Scanner;

public class ArrayEx24_테스트문제1_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("┌───────────────────────────────────────────────┐");
		System.out.println("│            ArrayEx24_테스트문제1_3            │");
		System.out.println("└───────────────────────────────────────────────┘");
		
		
		// 문제 13) 아래 배열 l과 m을 비교해서 둘의 합이 짝수 일때만 n에 저장 	
		// 예) n = {74,82,0,0,0}
		
		int[] l = { 10, 20, 30, 40, 50 };
		int[] m = { 13, 54, 17, 42,  1 };
		int[] n = {  0,  0,  0,  0,  0 };
		int idx = 0;
		int sum = 0;
		
		System.out.println("문제 13) 아래 배열 l과 m을 비교해서 둘의 합이 짝수 일때만 n에 저장 ");
		System.out.println();
		
		for (int i = 0; i < l.length; i++) {
			sum = l[i] + m[i];
			if (sum % 2 == 0) {
				n[idx] = sum;
				idx++;
			}
			sum = 0;
		}
		
		System.out.print(" { ");
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
			if (i < n.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
		System.out.println();
		
		
		// 문제 14) 아래는 시험결과 이다. 시험에 합격한 사람의 번호만 win에 저장 (60점이상 합격)
		// 예) win[3]= {1002, 1003, 0};
		
		int[] num = { 1001, 1002, 1003 };
		int[] score = { 50, 83, 78 };
		int[] win = { 0,0,0 };
		idx = 0;
		System.out.println("────────────────────────────────────────────────────────────────────────────");
		System.out.println("문제 14) 아래는 시험결과 이다.  ");
		System.out.println("         시험에 합격한 사람의 번호만 win에 저장 (60점이상 합격)");
		System.out.println();
		
		for (int i = 0; i < win.length; i++) {
			if (score[i] >= 60) {
				win[idx] = num[i];
				idx++;
			}
		}
		
		System.out.print(" { ");
		for (int i = 0; i < win.length; i++) {
			System.out.print(win[i] + " ");
			if (i < win.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
		System.out.println();
		
		
		// 문제 15) 아래는 시험결과 이다 시험에 합격한 사람의 번호만 win2에 저장 (60점이상 합격)
		// 예) win2[3] = {1001, 1003, 0};
		
		int[] data = { 1001, 80 , 1002, 23, 1003 , 78 };
		int[] win2 = { 0,0,0 };
		idx = 0;
		System.out.println("────────────────────────────────────────────────────────────────────────────");
		System.out.println("문제 15) 아래는 시험결과 이다.  ");
		System.out.println("         시험에 합격한 사람의 번호만 win2에 저장 (60점이상 합격)");
		System.out.println();
		
		for (int i = 0; i < data.length; i++) {
			if (i % 2 == 1) {
				if (data[i] >= 60) {
					win2[idx] = data[i - 1];
					idx++;
				}
			}
		}
		
		System.out.print(" { ");
		for (int i = 0; i < win2.length; i++) {
			System.out.print(win2[i] + " ");
			if (i < win2.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
		System.out.println();
		
		
		
		// 문제 16) 아래 배열 o 에서 내가 입력한 값만 빼고p 에 저장 
		// 예) 30 ==> p = {10,20,40,50,0};
		
		int[] o = { 10,20,30,40,50 };
		int[] p = { 0,0,0,0,0 };
		idx = 0;
		System.out.println("────────────────────────────────────────────────────────────────────────────");
		System.out.println("문제 16) 아래 배열 o 에서 내가 입력한 값만 빼고p 에 저장");
		System.out.println();
		
		System.out.print(" { ");
		for (int i = 0; i < o.length; i++) {
			System.out.print(o[i] + " ");
			if (i < o.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
		System.out.println();
		
		System.out.print("입력 : ");
		int getNumber = sc.nextInt();
		
		for (int i = 0; i < o.length; i++) {
			if (getNumber != o[i]) {
				p[idx] = o[i];
				idx++;
			}
			
		}
		
		System.out.print(" { ");
		for (int i = 0; i < p.length; i++) {
			System.out.print(p[i] + " ");
			if (i < p.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
		System.out.println();
		
		
		
		// 문제 17) 아래 배열 q에서 내가 입력한 번호만 빼고 다른 번호와 값을 r 에 저장
		// 예) 1002 ==> r = {1001, 40, 1003, 70 , 0, 0};
		
		int[] q = { 1001, 40, 1002, 65, 1003,  70 };
		int[] r = { 0,0,0,0,0,0 };
		idx = 0;
		System.out.println("────────────────────────────────────────────────────────────────────────────");
		System.out.println("문제 17) 아래 배열 q에서 내가 입력한 번호만 빼고 다른 번호와 값을 r 에 저장 ");
		
		System.out.print(" { ");
		for (int i = 0; i < q.length; i++) {
			System.out.print(q[i] + " ");
			if (i < q.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
		System.out.println();
		
		System.out.print("1001, 1002, 1003 중 입력 : ");
		int getNumber2 = sc.nextInt();
		idx = 0;
		
		
		if (getNumber2 == q[0]) {
			for (int i = 0; i < 4; i++) {
				r[i] = q[i + 2];
			}
		}
		
		else if (getNumber2 == q[2]) {
			for (int i = 0; i < 2; i++) {
				r[idx] = q[i];
				idx++;
			}
			for (int i = 4; i < 6; i++) {
				r[idx] = q[i];
				idx++;
			}
		}
		
		else if (getNumber2 == q[4]) {
			for (int i = 0; i < 4; i++) {
				r[i] = q[i];
			}
		}
		
		System.out.print(" { ");
		for (int i = 0; i < r.length; i++) {
			System.out.print(r[i] + " ");
			if (i < r.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
		System.out.println();
		
		
		
		// 문제 18) 
		// 숫자를 5개 입력받고 arr 배열안에 입력한값이 있을때마다 
		// s배열안에 해당 값의 인덱스를 차례대로 저장할려고 한다. 
		// 조건) 만약에 입력한 숫자가 arr에 없으면 인덱스 대신 -1 저장 
		// 예) 10, 20, 10, 1, 50
		//  s = { 0, 1, 0, -1, 4}
				
		// 예)  30, 40, 1, 10, 2
		// s = { 2, 3, -1, 0, -1}
		
		int[] arr = {10,20,30,40,50};
		int[] s = new int[5];
		
		System.out.println("────────────────────────────────────────────────────────────────────────────");
		System.out.println("문제 18) 숫자를 5개 입력받고 arr 배열안에 입력한값이 있을때마다");
		System.out.println("         s배열안에 해당 값의 인덱스를 차례대로 저장할려고 한다.");
		System.out.println("         조건) 만약에 입력한 숫자가 arr에 없으면 인덱스 대신 -1 저장");
		
		System.out.print(" { ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if (i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
		System.out.println();
		
		int check = -1;
		for (int i = 0; i < 5; i++) {
			
			System.out.print("입력 : ");
			int getArr = sc.nextInt();
			
			for (int j = 0; j < arr.length; j++) {
				System.out.println(getArr);
				if (getArr == arr[j]) {
					check = j;
					break;
				} else if (getArr != arr[j]) {
					check = -1;
				} 
			}
			
			if (check > -1) {
				s[i] = check;
			} else {
				s[i] = check;
			}
			
		}
		
		System.out.print(" { ");
		for (int i = 0; i < s.length; i++) {
			System.out.print(s[i] + " ");
			if (i < s.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
		System.out.println();
		
		sc.close();
				
		
	}

}
