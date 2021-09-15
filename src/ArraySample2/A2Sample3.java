package ArraySample2;

import java.util.Scanner;

/* 다음과 같은 배열 형태로 나열되는 프로그램을 작성하세요.
 * 2차원 배열 사용(for 2개 사용)
 *  -특징
 *  1.어떤 수의 거듭제곱
 *  2.행을 열이 따라간다
 *  3.행 증가, 열 증가
 * 
 * 1   4    9   16   25 [0] [1] [2] [3] [4]
 * 0  36   49   64   81 [1] [2] [3] [4]
 * 0   0  100  121  144 [2] [3] [4]
 * 0   0    0  169  196 [3] [4]
 * 0   0    0    0  225 [4]
 * 
 * 
 * 
 */
public class A2Sample3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1.input
		System.out.println("배열 사이즈 입력 : ");
		int n = sc.nextInt();// 5
		int m = sc.nextInt();// 5

		int arr[][] = new int[n][m];//

		int data = 1;

		// 2.data input
		for (int i = 0; i < arr.length; i++) {

			for (int j = i; j < arr.length; j++) {

				arr[i][j] = (data * data);
				data++;
			}

		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");

			}
			System.out.println();

		}

	}
}
