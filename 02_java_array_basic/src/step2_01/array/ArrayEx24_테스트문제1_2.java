package step2_01.array;

import java.util.Scanner;

//2021-03-02 20:10
public class ArrayEx24_테스트문제1_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int check = -1;
		int index = 0;
		int newIndex = 0;
		System.out.println("┌─────────────────────────────────────────────┐");
		System.out.println("│           ArrayEx24_테스트문제1_2           │");
		System.out.println("└─────────────────────────────────────────────┘");
		
		// 문제 8) 아래 d에서 scanner로 내가 입력한 값만 빼고 e에 저장 
		// 예) 30 ==> e = {10,20,40,50,0};
		
		int[] d = { 10,20,30,40,50 };
		int[] e = { 0,0,0,0,0 };
		
		System.out.println(" 문제 8) 배열 d에서 scanner로 ");
		System.out.println("         내가 입력한 값만 빼고 e에 저장 ");
		System.out.println();
		
		System.out.print(" { ");
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i]);
			if (i < d.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println(" }");
		
		System.out.print(" 값 입력 : ");
		int getValue = sc.nextInt();
		
		// 입력한 값이 배열에 있는 값이 맞는지
		
		for (int i = 0; i < e.length; i++) {
			if (getValue == d[i]) {
				check = 0;
				index = i;
			}
		}
		
		if       (check ==  0) {
			
			for (int i = 0; i < index; i++) {
				e[i] = d[i];
			}
			
			for (int i = index; i < 4; i++) {
				e[i] = d[i + 1];
			}
			
			e[4] = 0;
			
			System.out.print(" 답 :  { ");
			for (int i = 0; i < e.length; i++) {
				System.out.print(e[i]);
				if (i < e.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println(" }");
			
		} else if(check == -1) {
			System.out.println("잘못된 답!");
		}
		
		System.out.println();
		
		// 문제 9) 아래 f에서 scanner로 내가 입력한 번호와 값을 빼고 d에 저장 
		// 예) 1002 ==> {1001, 40, 1003, 70 , 0, 0};
		
		int[] f = { 1001, 40, 1002, 65, 1003,  70 };
		int[] g = { 0,0,0,0,0,0 };
		
		System.out.println(" 문제 9) 아래 f에서 scanner로 ");
		System.out.println("         내가 입력한 번호와 값을 빼고 g에 저장 ");
		System.out.println();
		
		
		
		
		
		// 문제 10) 숫자를 하나 입력받고 아래 배열을 앞으로 하나씩 밀어낸후 맨뒤에 저장
		// 예)  60 ==> {20,30,40,50,60};
		
		int[] h = { 10,20,30,40,50 };
		
		System.out.println(" 문제 10) 숫자를 하나 입력받고 아래 배열을 ");
		System.out.println("          앞으로 하나씩 밀어낸후 맨뒤에 저장");
		System.out.println();
		
		
		
		
		
		// 문제 11) 숫자를 하나 입력받고 아래 배열을 뒤로 하나씩 밀어낸후 맨 앞에 저장 
		// 예) 60 ==> {60,10,20,30,40};
		
		int[] i = { 10,20,30,40,50 };
		
		System.out.println(" 문제 11) 숫자를 하나 입력받고 아래 배열을");
		System.out.println("          뒤로 하나씩 밀어낸후 맨뒤에 저장");
		System.out.println();
		
		
		
		
		
		
		
		
		// 문제 12) 아래배열을 거꾸로 저장 
		//예) k => {5,4,3,2,1};
		
		int[] j = { 1,2,3,4,5 };
		int[] k = { 0,0,0,0,0 };
		
		System.out.println(" 문제 12) 아래배열을 거꾸로 저장 ");
		System.out.println();
		
		sc.close();
		
	}

}
