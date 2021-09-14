package ArraySample01;

import java.util.Random;

public class Sample02 {
/*
 * 문제2> 100점대 난수(숫자)를 100개 생성하여 출력하세요.
 */
	public static void main(String[] args) {
		Random rand = new Random();

		for (int i = 0; i < 100; i++) {
			double x = rand.nextDouble() + 100;
			System.out.println(x);
		}

	}

}
