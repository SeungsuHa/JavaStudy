package InheritanceSample;

import java.util.Scanner;

/* 
 *  메소드 오버로딩란?
 *  
 *   이름은 같지만, 역할이 다른 메소드를 구현 하는 것.
 *   - 구분 : 이름은 같으나 전달인자(매개변수)의 갯수나 데이터형이 다르면 구분이 됩니다.
 */
public class Sample2_method {

	public void add(double x4, int y4) {

		double sum = x4 / y4;

		System.out.println("div : " + sum);//
	}
	
	public void add(int x3, double y3) {

		double sum = x3 * y3;

		System.out.println("mul : " + sum);//
	}

	public void add(int x2, int y2) {

		int sum = x2 - y2;

		System.out.println("sub : " + sum);//
	}

	public void add(double x, double y) {

		int sum = (int) (x + y);

		System.out.println("add : " + sum);//
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("---- 덧셈 구하기 -----");
		System.out.println("첫번째 숫자 입력: ");
		double x = sc.nextDouble();// 12.345
		System.out.println("두번째 숫자 입력: ");
		double y = sc.nextDouble();// 34.123

		// 실수형 데이터
		Sample2_method s1 = new Sample2_method();
		s1.add(x,y);
		
		// 생성자 오버로딩
		Scanner sc2 = new Scanner(System.in);
		System.out.println("---- 뺄셈 구하기 -----");
		System.out.println("첫번째 숫자 입력: ");
		int x2 = sc2.nextInt();// 12.345
		System.out.println("두번째 숫자 입력: ");
		int y2 = sc2.nextInt();// 34.123

		// 정수형 데이터
		Sample2_method s2 = new Sample2_method();
		s2.add(x2, y2);
		
		// 생성자 오버로딩
		Scanner sc3 = new Scanner(System.in);
		System.out.println("---- 곱셈 구하기 -----");
		System.out.println("첫번째 숫자 입력: ");
		int x3 = sc3.nextInt();// 12.345
		System.out.println("두번째 숫자 입력: ");
		double y3 = sc3.nextInt();// 34.123

		// 정수형, 실수형 데이터
		Sample2_method s3 = new Sample2_method();
		s3.add(x3, y3); 
		
		// 생성자 오버로딩
		Scanner sc4 = new Scanner(System.in);
		System.out.println("---- 곱셈 구하기 -----");
		System.out.println("첫번째 숫자 입력: ");
		double x4 = sc4.nextInt();// 12.345
		System.out.println("두번째 숫자 입력: ");
		int y4 = sc4.nextInt();// 34.123

		// 정수형, 실수형 데이터
		Sample2_method s4 = new Sample2_method();
		s4.add(x4, y4);
		

	}

}
