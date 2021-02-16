package step2_01.array;

/*
 * # 배열 기본문제
 */

// 2021-02-09 20:26
public class ArrayEx03_정답 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		// 문제1) for문을 이용하여 10부터 50까지 arr 배열에 저장
		// 정답1) 10 20 30 40 50
		
		System.out.println("문제1) for문을 이용하여 10부터 50까지 arr 배열에 저장");
		System.out.println();
		System.out.print("답 : ");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10 * ( i + 1 );
			
			System.out.print(arr[i] + " " );
		}
		
		System.out.println();
		System.out.println();
		
		// 문제2) 1번에서 생성한 arr에서 4의 배수만 출력
		// 정답2) 20 40
		
		System.out.println("문제2) 1번에서 생성한 arr에서 4의 배수만 출력");
		System.out.println();
		System.out.print("답 : ");
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		
		System.out.println();
		System.out.println();
		
		// 문제3) 1번에서 생성한 arr에서 4의 배수의 합 출력
		// 정답3) 60
		
		System.out.println("문제3) 1번에서 생성한 arr에서 4의 배수의 합 출력");
		System.out.println();
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				sum += arr[i];
			}
		}
		
		System.out.println("답 : " + sum);
		System.out.println();
		
		
		// 문제4) 1번에서 생성한 arr에서 4의 배수의 개수를 출력
		// 정답4) 2
		
		System.out.println("문제4) 1번에서 생성한 arr에서 4의 배수의 개수를 출력");
		System.out.println();
		
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				cnt ++;
			}
		}
		
		System.out.println("답 : " + cnt);
		System.out.println();
		
		// 문제5) 1번에서 생성한 arr에서 짝수의 개수를 출력
		// 정답5) 5
		
		System.out.println("문제5) 1번에서 생성한 arr에서 짝수의 개수를 출력");
		System.out.println();
		
		cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				cnt++;
			}
		}
		System.out.println("답 : " + cnt);
		System.out.println();
		
	}
	
}
