package MethodSample;

import java.util.Scanner;

public class totalSample_add { // 300 address

	public void add() { 
			Scanner sc = new Scanner(System.in);
			System.out.println("---- 덧셈 구하기 -----");
			System.out.println("첫번째 숫자 입력: ");
			double x = sc.nextDouble();// 12.345
			System.out.println("두번째 숫자 입력: ");
			double y = sc.nextDouble();// 34.123
			
			double sum = x + y;
			
			System.out.println("덧셈의 결과는 : " + sum);// ?
			
		}

}
