package MethodSample;

import java.util.Scanner;

/* 	method 종류(분류)
 * ------------------------------------------------------------------
 *   return value 	arguments(main area) = parameter(field area)
 * ------------------------------------------------------------------
 * 1.		O			O   
 * 2. 		O			X
 * 3.		X			O   [O]
 * 4.		X			X
 * ------------------------------------------------------------------
 * 
 */
public class Sample4 {
	
	private void mul(double x, double y) {
		
		double mul = x * y;
		
		System.out.println("곱셈의 결과는 : " + mul);// ?		
	} 
	
	
	public static void main(String[] args) { 
				
		Sample4 s3 = new Sample4();
						
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		double y = sc.nextDouble();
	
		//3.방식
		s3.mul(x, y);

	}

	
		
}



