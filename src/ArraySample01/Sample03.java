package ArraySample01;

import java.util.Scanner;

public class Sample03 {
/*
 * 원하는 데이터 찾기 임의의 수 N개 입력받아서, 찾고자 하는 데이터의 위치가 어디인지를 찾아서 그 index값을 출력하세요. 1차원 배열
 * 사용 int a[] = new int[5]; String str[] = new String[5];
 * 
 * a		b		c		d		e 
 * ---------------------------------------- 
 * 10		20		30		40		50
 * ---------------------------------------- 
 * 100번지	104번지	108번지	112번지	116번지
 * [0]		[1] 	[2] 	[3] 	[4]
 */
	public static void main(String[] args) {
	// 1.배열에 저장 할 데이터 갯수 입력
		System.out.println("배열에 저장 할 데이터 갯수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

	// 2.배열에 데이터 입력
		System.out.println("배열에 데이터를 " + count + "개 입력하세요");
		int Data[] = new int[count];
		
		for (int i=0; i < Data.length; i++) {
			Data[i] = sc.nextInt();
		}
		
	// 3.찾을 데이터 입력
		System.out.println("검색할 데이터를 입력하세요.");
		int SerchData = sc.nextInt();

	// 4.찾은 데이터 출력
		for (int i=0; i < Data.length; i++) {
			if(SerchData == Data[i]) {
				System.out.println(Data[i] + "는 " + i);
			} else {
			}
		}
	}
}