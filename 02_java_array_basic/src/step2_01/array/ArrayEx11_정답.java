package step2_01.array;

import java.util.Random;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

/*
 * # 중복숫자 금지[1단계]
 * 
 * 1. 0~4 사이의 숫자를 arr배열에 저장한다.
 * 2. 단, 중복되는 숫자는 없어야 한다.
 * 힌트) 랜덤 숫자를 check배열의 인덱스로 활용한다.
 * 
*  예)
 * 랜덤숫자 : 1
 * check = {false , true , false , false , false}
 * arr   = {1, 0, 0, 0, 0}
 * 랜덤숫자 : 3
 * check = {false , true , false , true , false}
 * arr   = {1, 3, 0, 0, 0}
 * 랜덤숫자 : 2
 * check = {false , true , true , true , false}
 * arr   = {1, 3, 2, 0, 0}
 */

//2021-02-16 20:50
public class ArrayEx11_정답 {

	public static void main(String[] args) {

		Random ran = new Random();

		boolean[] check = new boolean[5];
		int[] arr = new int[5];

		int index = 0;

		while (index < 5) {

			int randomNumber = ran.nextInt(5);
			System.out.println("\n랜덤숫자 : " + randomNumber);
			if (check[randomNumber] == false) {
				check[randomNumber] = true;
				arr[index++] = randomNumber;
			} else {
				System.out.println("===================");
				System.out.println("중복");
				System.out.println("===================");
			}
			// ---------------------------------check
			System.out.print("check = { ");
			for (int i = 0; i < check.length; i++) {
				System.out.print(check[i]);
				if (i < 4) {
					System.out.print(", ");
				}
			}
			System.out.println(" }");
			System.out.println();

			// ---------------------------------arr
			System.out.print("arr = { ");
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
				if (i < 4) {
					System.out.print(", ");
				}
			}
			System.out.println(" }");
			System.out.println();

		}
		

	}

}
