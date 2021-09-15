package ArraySample2;

import java.util.Scanner;

/* 지그재그 행렬을 만들어서 출력하세요.
 * 2차원 배열 사용(for 2개 사용)
 * 
 * 특징>
 *  - 행 증가, 열 감소
 *  - 홀수행, 짝수행
 *  
 *  3행 3열을 입력하면,
 * 1 2 3 
 * 6 5 4 
 * 7 8 9 
 * 
 *  5행 5열이면,
 * 1   2  3  4  5 : 0행
 * 10  9  8  7  6 : 1행
 * 11 12 13 14 15 : 2행
 * 20 19 18 17 16 : 3행
 * 21 22 23 24 25 : 4행
 * 
 */
public class A2Sample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1.sort data size define	
		System.out.println("원하는 배열의 크기를 입력해 주세요.");
		int n = sc.nextInt();// 5
		int m = sc.nextInt();// 5
		
		int Data[][] = new int[n][m];// 
			
		//2.data input
		System.out.println("***** 데이터 입력 부분 *****");// title
		int start=0, end, count=1;
		end = m - 1;// 4
		
		//           0 < 5
		for(int i=0; i < Data.length; i++) {
			
			if(i%2 == 0) { //짝수행
				
				//                 0 <= 5
				for(int j = start; j <= end; j++) {
					Data[i][j] = count++;// count = count + 1(2)기억, 
					//[0][0] = 1, 
				}
			}else {
				//                 4 >= 0
					for(int j=end; j >= start; j--) { //홀수행
						Data[i][j] = count++;						
				}
			}
			
		}
		
		//3.data output
		for(int i=0; i < Data.length; i++) {
			for(int j=0; j < Data[i].length; j++) {
				System.out.print(Data[i][j] + "  "); // ?????
				
			}
			System.out.println(); 
		}
		
	}

}
