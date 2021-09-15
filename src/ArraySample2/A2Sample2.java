package ArraySample2;

import java.util.Scanner;

/* 구구단을 만들어서 출력하세요.
 * 2차원 배열 사용(for 2개 사용)
 * 
 * int[][] gugudan = new int[8][8];//[0][0] ~ [8][8]
 * 
 */
public class A2Sample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1.input
		System.out.println("배열 사이즈 입력 : ");
		int n = sc.nextInt();// 9
		int m = sc.nextInt();// 9
		
		int gugudan[][] = new int[n][m];// 
			
		//2.data input
		for(int i=0; i < gugudan.length; i++) { //row
			
			for(int j=0; j < gugudan.length; j++) { //column
				gugudan[i][j] = (i+1) * (j+1);
				// 2 * 1 = 2[0][0], 2*2 = 4[0][1], 
			
			}
		}
		
		//3.data output
		
		for(int i=0; i < gugudan.length; i++) {
			
			for(int j=0; j < gugudan.length; j++) {
				 System.out.println((i+1) + "*" +  (j+1) + "=" +  gugudan[i][j]);
			}
			System.out.println("-------------------");
		}
		
		
		
	}

}
