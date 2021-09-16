package MethodSample;

import java.util.Scanner;

/* 	method 종류(분류)
 * ------------------------------------------------------------------
 *   return value 	arguments(main area) = parameter(field area)
 * ------------------------------------------------------------------
 * 1.		O			O   [O]
 * 2. 		O			X
 * 3.		X			O
 * 4.		X			X
 * ------------------------------------------------------------------
 * 
 * static 
 * 
 * 
 * 문제> 실수형 데이터 2개의 값을 입력받아서, 곱을 구하여 출력하세요.
 * 
 */
public class Sample3 {
	
	private double mul(double x, double y) {
		
		double mul = x * y;
		
		return mul;//
	} 
	
	
	public static void main(String[] args) {
		
		Sample3 s3 = new Sample3();
		
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
	
		double result = s3.mul(x, y);
		
		System.out.println("곱셈의 결과는 : " + result);
		
	}

		
}