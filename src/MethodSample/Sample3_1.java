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
 * 문제> 실수형 데이터 2개의 값을 입력받아서, 차를 구하여 출력하세요.
 * 
 */
public class Sample3_1 {  // 25000번지
//field area: 클래스 변수와 클래스 메소드
	
	private double sub(double x2, double y2) { // x parameter, y parameter, 500번지
		
		//int sum = (int)(x + y);
		double subt = x2 - y2;
		
		return subt;//
	} 
	
	
	public static void main(String[] args) { // 11000번지
		// main 영역: 지역변수, 지역함수
		
		Sample3_1 s33 = new Sample3_1();// 25000번지
		
		Scanner sc = new Scanner(System.in);
		double x2 = sc.nextDouble();// 12.345
		double y2 = sc.nextDouble();// 34.123
	
		//1.방식
		double result2 = s33.sub(x2, y2);//arguments(x, y), 500번지
		
		System.out.println("덧셈의 결과는 : " + result2);// ?
		
	} // main end

	
		
}//class end