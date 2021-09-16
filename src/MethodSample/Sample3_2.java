package MethodSample;

import java.util.Scanner;

/* 	method 종류(분류)
 * ------------------------------------------------------------------
 *   return value 	arguments(main area) = parameter(field area)
 * ------------------------------------------------------------------
 * 1.		O			O   
 * 2. 		O			X   [O]
 * 3.		X			O
 * 4.		X			X
 * ------------------------------------------------------------------
 * 
 * static 
 * 
 * 
 * 문제> 실수형 데이터 2개의 값을 입력받아서, 차를 구하여 출력하세요.
 * 
 */
public class Sample3_2 {
	
	double sub() {
		
		Scanner sc = new Scanner(System.in);
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
	
		double sub = x3 - y3;
		
		return sub;			
	} 
	
	
	public static void main(String[] args) {
		
		Sample3_2 s33 = new Sample3_2();
		
		 double result = s33.sub();
		
		 System.out.println("뺄셈의 결과는 : " + result);
		
	}	
		
}