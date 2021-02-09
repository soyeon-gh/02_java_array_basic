package step2_01.array;

import java.util.Arrays;

public class ArrayEx01 {

	public static void main(String[] args) {

		// 1. 일반 변수 ( 값 저장 ) 
		int nVar = 0;
		nVar = 3;
		System.out.println(nVar);		// 값
		
		// 2. 주소 변수 ( 주소 저장 )
		int[] arr = null;
		arr = new int[5]; 
		System.out.println(arr);		// 주소
		
		System.out.println(arr[0]);	// 배열은 생성시에 초깃값이 셋팅이 되어있다.
		System.out.println(arr[1]); // 정수형태의 배열은 0 , 나머지는 직접확인해보자.
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println();
		
		//System.out.println(arr[5]);
		//java.lang.ArrayIndexOutOfBoundsException:5
		// 배열의 범위가 넘어설때 나는 에러메세지 ( 해당 에러메세지 암기 )
		
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		System.out.println("============================");
		for (int i = 0; i < arr.length; i++) { //arr.length >> 배열의 크기
			System.out.println(arr[i]);
		}
		System.out.println("============================");
		// (참고) 배열이 익숙해진 후에 사용
		System.out.println(Arrays.toString(arr));
	}

}
