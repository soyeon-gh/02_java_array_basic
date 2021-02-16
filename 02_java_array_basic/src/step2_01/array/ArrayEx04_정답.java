
package step2_01.array;

import java.util.Random;

/*
 * # 학생성적관리 프로그램[1단계] : 학생점수
 */


public class ArrayEx04_정답 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] arr = new int[5];
		
		
		// 문제1) arr배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		
		System.out.println("문제1) arr배열에 1~100점 사이의 랜덤 정수를 5개 저장");
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(100) + 1; 
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		
		System.out.println("문제2) 전교생의 총점과 평균 출력");
		System.out.println();
		
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i]; 
		}
		
		double avg = sum / arr.length;
		
		System.out.println("총점(" + sum + ") 평균(" + avg + ")");
		System.out.println();
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		
		System.out.println("문제3) 성적이 60점 이상이면 합격. 합격생 수 출력");
		System.out.println();
		
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 60) {
				System.out.println(i + "." + arr[i] + "합격입니다.");
				cnt ++;
			}
		}
		System.out.println();
		System.out.println("합격자 수 : " + cnt + "명");
		
	}
	
}
