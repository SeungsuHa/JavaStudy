package ArraySample2;

import java.util.Scanner;

/* 다음과 같은 배열 형태로 나열되는 프로그램을 작성하세요.
 * 2차원 배열 사용(for 2개 사용)
 *  -특징
 *   1.2 증가
 *   2.행 증가, 열이 0행에서 2행까지는 증가, 이후에 감소 열이 따라간다. 
 *    
 * 0 	0 	1 	0 	0
 * 0 	3 	5 	7 	0
 * 9 	11 	13 15 	17
 * 0 	19 	21 23 	0
 * 0 	0 	25 	0 	0
 * 
 * int Exercise2_4[][] = new int[n][m];
 * 
 */
public class A2Sample4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.println("배열 크기 지정 : ");
		int n = sc.nextInt();// 5
		int m = sc.nextInt();// 5		
		
		int Exercise2_4[][] = new int[n][m];// 
			
		//2.data input
		int k=1;
		
		//           3 <=2  
		for(int i=0; i <=2; i++) { //row => 0, 1, 2
			
			//        0     5 <= 4
			for(int j = 2-i; j<=2+i; j++) { //column => 2, 
				Exercise2_4[i][j] = k;
				// [0][2] = 1, 
				// [1][1]= 3, [1][2]=5, [1][3]=7
				// [2][0]= 9, [2][1]=11, [2][2]=13, [2][3]=15, [2][4]=17
				
				k+=2;// 3, 5, 7, 9, 11, 13, 15, 17, 19
			}
			
			
			}
		
		//             5 <= 4
		for(int i = 3; i <= 4; i++) { //row => 3

			//      2     3 <= 2
			for(int j=i-2; j <= 6-i; j++) { //column=> 1, 
				Exercise2_4[i][j] = k; // 19, 21
				//[3][1] = 19, [3][2]=21, [3][3]=23, 
				//[4][2]=25
				
				 k+=2;// 21, 23, 25, 27
				 
			}				
			
		}
		
		//3.data output
		
		for(int i=0; i < Exercise2_4.length; i++) {
			
			for(int j=0; j < Exercise2_4.length; j++) {
				 System.out.print(Exercise2_4[i][j] + "\t");
			}
			System.out.println();
		}
		
		
		
	}

}
