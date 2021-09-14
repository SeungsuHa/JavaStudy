package ArraySample01;

import java.util.Arrays;
import java.util.Scanner;

/* 반복처리 하도록 프로그램을 변경해주세요.
 * for, while, do~while문
 * 
 * 가독성? 프로그램을 편집하거나 해독 할 때, 편리성을 말한다.
 */

public class Sample03Loop {

	public static void main(String[] args) {

		int cnt = 0;
		int count;

		// 1.배열에 저장 할 데이터 갯수 입력
		System.out.println("배열에 저장 할 데이터 갯수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();

		// 2.배열에 데이터 입력
		System.out.println("배열에 데이터를 " + count + "개 입력하세요.");
		int Data[] = new int[count];

		for (int i = 0; i < Data.length; i++) {
			Data[i] = sc.nextInt();
		}

		do {
			cnt++;// cnt = cnt + 1;
			// 3.찾을 데이터 입력

			System.out.println("검색할 데이터를 입력하세요. " + Arrays.toString(Data));
			int SerchData = sc.nextInt();

			// 4.찾은 데이터 출력
			for (int i = 0; i < Data.length; i++) {
				if (SerchData == Data[i]) {
					System.out.println(Data[i] + "는" + "[" + i + "]");
				} else {
				}
			}

		} while (cnt < count);
		
	}
}
