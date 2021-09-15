package ArraySample1;

import java.util.Random;

public class Sample1 {

/*
 * 배열 : 같은 성질의 숫자나 문자를 나열한 것 - 데이터의 갯수가 아주 많은 경우 사용 - C에서 구조체가 자바에서는 class 형태로
 * 변환됩니다. => 필드 영역 1차원 배열 : 점으로 구성, 메모리 사용, 포인터(C, 주소에 조작) => Object(객체, 주소 조작
 * 불가능) int a = 5000; *pA; pA = &a; print(pA); => ? 주소값이 존재합니다.
 * 
 * int A[] = int[10]; [0] ~ [9], 행과 열이 같습 니다.
 * 
 * 2차원 배열 : 선으로 구성, int B[][] = int[5][7]; // 5행과 7열이 존재합니다.
 * 
 * 3차원 배열 : 면으로 구성, double C[][][] = new double[]][][], 면, 행, 열
 * 
 * 자바는 행 중심언어, 파이썬은 열 중심언어
 * 
 * 난수? 실수형 형태인데, 예를 들어서 0부터 1까지의 난수를 말한다면, 0.0, 0.00, 0.000, 0.0000... 0.1,
 * 0.01, 0.001, ... 0.2... 0.3... 1.0 부동소숫점? 1234.000E+23 => ?
 * 
 * 문제1> 불린형 난수(True, False)를 100개 생성하여 출력하세요.
 * 
 * 
 */

	public static void main(String[] args) {
		Random rand = new Random();

		for (int i = 0; i < 100; i++) {
			boolean x = rand.nextBoolean();
			System.out.println(x);
		}
	}
}
