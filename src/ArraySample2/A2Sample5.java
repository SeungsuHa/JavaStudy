package ArraySample2;

import java.util.Scanner;

/* 다음과 같은 배열 형태로 나열되는 프로그램을 작성하세요.
 * 2차원 배열 사용(for 2개 사용)
 *  -특징
 *   1.행 증가. 열 증가(행)
 * 
 *    
 * 1  0  0  0  0 
 * 2  3  0  0  0
 * 4  5  6  0  0
 * 7  8  9  10 0
 * 11 12 13 14 15
 * 
 * int Exercise2_6[][] = new int[n][m];
 * 
 */
public class A2Sample5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("배열 크기 지정 : ");
		int n = sc.nextInt();// 5
		int m = sc.nextInt();// 5

		int Exercise2_5[][] = new int[n][m];

		// 2.data input
		int k = 0;

		//              5 < 5
		for (int i = 0; i  < Exercise2_5.length; i++) { // row => 0, 1, 2, 3, 4

			//              0 <= 4
			for (int j = 0; j <= i; j++) { // column => 0, 
				k++; // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
				Exercise2_5[i][j] = k; 
				// [0][0]= 1, 
				// [1][0]= 2, [1][1]= 3, 
				// [2][0]= 4, [2][1]= 5, [2][2]= 6, 
				// [3][0]= 7, [3][1]= 8, [3][2]= 9, [3][3]= 10,
				// [4][0]= 11, [4][1]= 12, [4][2]= 13, [4][3]= 14, [4][4]= 15
			}
		}

		// 3.data output

		for (int i = 0; i < Exercise2_5.length; i++) {

			for (int j = 0; j < Exercise2_5.length; j++) {
				System.out.print(Exercise2_5[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
