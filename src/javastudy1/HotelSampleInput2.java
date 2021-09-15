package javastudy1;

import java.util.Scanner;

/*
 * kosmos hotel을 새롭게 증축을 합니다.
 * 5층 건물이고, 각 층은 7개 호실로 구성되어 있습니다. 
 * 이경우에, 투숙객의 데이터가 다음과 같다면, 전체 인원수와 각 층의 평균 인원수는 얼마인가요?
 * <data>
 * 1층: 10, 5, 6, 7, 8, 9, 10 => 55 / 7 => 7.8...
 * 2층: 1, 9, 7, 8, 5, 4, 3
 * 3층: 10, 20, 30, 40, 50, 60, 70
 * 4층: 3, 5, 8, 9, 12, 22, 55
 * 5층: 6, 3, 8, 2, 5, 4, 5
 * 
 */

public class HotelSampleInput2 {
//filed area 
// global variable(C) = class variable(Java)		
// int totalsum; 자동초기화 개념 => 0

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// keyboard 데이터 입력
		System.out.println("행을 입력하세요.(층)");
		int su1 = sc.nextInt();// 5
		System.out.println("열을 입력하세요.(호)");
		int su2 = sc.nextInt();// 7

		// int kosmos[][] = new int[3][4];
		int kosmos[][] = new int[su1][su2];// int[5][7]

		// 1.data input
		System.out.println("각층 각호의 인원수를 입력하세요.");
		for (int i = 0; i < kosmos.length; i++) {

			for (int j = 0; j < kosmos[i].length; j++) {
				kosmos[i][j] = sc.nextInt();
			}
		}

		// 2.data prodessing
		int sum;// 전체 데이터의 합계 구하는 변수 선언, 지역변수 개념
		double aver = 0.0;// 지역변수 개념
		int totalsum = 0;// 지역변수 개념

		for (int i = 0; i < kosmos.length; i++) { // row
			sum = 0;
			for (int j = 0; j < kosmos[i].length; j++) { // column
				sum += kosmos[i][j];
			}
			totalsum += sum; // totalsum = toalsum + sum
			aver = sum / kosmos[i].length;
			System.out.println("합계: " + sum + ", 평균: " + aver);
		}
		System.out.println("전체 합계 : " + totalsum);
		System.out.println();
	} // main end

}// class end