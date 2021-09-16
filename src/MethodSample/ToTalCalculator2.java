package MethodSample;

import java.util.Scanner;

/* 문제> 2개의 숫자를 이용하여 덧셈, 뺄셈, 곱셈, 나눗셈을 처리하여 
 * 출력하세요. 
 * 
 * 접근제한자
 * --------------------------------------------
 *  - 1.private : 자신이 속한 클래스에서만 접근 가능.
 *  - 3.protected : 다른 패키지, 다른 클래스, 상속인 경우  
 *  - 4.public : 파일 정보 숨김이 안됨. hidden 속성 X, 
 *  - 2.생략을 했을 경우 : 디폴트 => 같은 패키지 다른 클래스 
 */
public class ToTalCalculator2 { //mainClass

	public static void main(String[] args) {
		// Class Sample3_1 : add
		// 		Sample3_2 : sub
		// 		Sample3 : mul
		// 		Sample5 : div
		
		// 		totalSample_add : add : subClass
		// 		totalSample_sub : sub
		// 		totalSample_mul : mul
		// 		totalSample_div : div
				
		
		ToTalCalculator2 tc = new ToTalCalculator2();
		
		totalSample_add tadd = new totalSample_add();// tadd(300 address)
		tadd.add();	// 객체명.메소드명
		
		Scanner sc = new Scanner(System.in);
		System.out.println("---- 뺄셈 구하기 -----");
		System.out.println("첫번째 숫자 입력: ");
		double x = sc.nextDouble();// 12.345
		System.out.println("두번째 숫자 입력: ");
		double y = sc.nextDouble();// 34.123
				
		totalSample_sub.sub(x, y);//클래스명.메소드명
			
		double result = totalSample_mul.mul();
		System.out.println("곱셈의 결과 : " + result);
				
		double result2 = totalSample_div.div();
		System.out.println("나눗셈의 결과 : " + result2);
		
	}


}
