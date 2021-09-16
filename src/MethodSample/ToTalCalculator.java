package MethodSample;

import java.util.Scanner;

/* 문제> 2개의 숫자를 이용하여 덧셈, 뺄셈, 곱셈, 나눗셈을 처리하여 
 * 출력하세요. 
 * 
 */
public class ToTalCalculator {


	private double div() {
		Scanner sc = new Scanner(System.in);
		System.out.println("---- 나눗셈 구하기 -----");
		System.out.println("첫번째 숫자 입력: ");
		double x = sc.nextDouble();// 12.345
		System.out.println("두번째 숫자 입력: ");
		double y = sc.nextDouble();// 34.123
		
		double sum = x / y;// /(몫), %(나머지), double sum2 = x % y;
		
		return sum;
	} 

	private double mul() {
		Scanner sc = new Scanner(System.in);
		System.out.println("---- 곱셈 구하기 -----");
		System.out.println("첫번째 숫자 입력: ");
		double x = sc.nextDouble();// 12.345
		System.out.println("두번째 숫자 입력: ");
		double y = sc.nextDouble();// 34.123
		
		double sum = x * y;
		
		return sum;		
	}

	private void sub(double x, double y) {
		
		double sum = x - y;
		
		System.out.println("뺄셈의 결과는 : " + sum); 
	}

	private void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("---- 덧셈 구하기 -----");
		System.out.println("첫번째 숫자 입력: ");
		double x = sc.nextDouble();// 12.345
		System.out.println("두번째 숫자 입력: ");
		double y = sc.nextDouble();// 34.123
		
		double sum = x + y;
		
		System.out.println("덧셈의 결과는 : " + sum);// ?
		
	}
	
	public static void main(String[] args) {
		// Class Sample3_1 : add
		// 		Sample3_2 : sub
		// 		Sample3 : mul
		// 		Sample5 : div
		
		ToTalCalculator tc = new ToTalCalculator();
		
		tc.add();
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("---- 뺄셈 구하기 -----");
		System.out.println("첫번째 숫자 입력: ");
		double x = sc.nextDouble();// 12.345
		System.out.println("두번째 숫자 입력: ");
		double y = sc.nextDouble();// 34.123
		
		tc.sub(x, y);
		System.out.println();
		
		double result = tc.mul();
		System.out.println("곱셈의 결과 : " + result);
		System.out.println();
		
		double result2 = tc.div();
		System.out.println("나눗셈의 결과 : " + result2);
		System.out.println();
		
	}


}