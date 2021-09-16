package MethodSample;

import java.util.Scanner;

/* 	method 종류(분류)
 * ------------------------------------------------------------------
 *   return value 	arguments(main area) = parameter(field area)
 * ------------------------------------------------------------------
 * 1.		O			O   
 * 2. 		O			X
 * 3.		X			O   
 * 4.		X			X  [O]
 * ------------------------------------------------------------------
 * 
 */
public class Sample5 {
	
	private void div() {
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		double div = x / y;
		
		System.out.println("나눗셈의 결과는 : " + div);		
	} 
	
	
	public static void main(String[] args) { 
				
		Sample5 s3 = new Sample5();
						
		//4.방식 = 프로그래밍 언어론 
		s3.div(); // call by reference(주소 참조), 객체명.메소드명()

	}

	
		
}