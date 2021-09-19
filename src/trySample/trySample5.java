package trySample;

import java.util.Scanner;

//if + try ~ catch

public class trySample5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(true) {	
			try {
			// data input
			System.out.println("국어 데이터 입력"); // 범위(0 ~ 100)
			String x = sc.next();// "500"
			int kor = Integer.parseInt(x);
			

			System.out.println("영어 데이터 입력"); // 범위(0 ~ 100)
			String y = sc.next();// "300"
			int eng = Integer.parseInt(y);
			
			if(kor > 0 && kor <= 100) {
				if(eng >= 0 && eng <=100) {
					int sum = kor + eng;// 500 + 300 = 800
					System.out.println("두수의 합계 " + sum);// 800
				}
			}
	
			
			}catch(NumberFormatException e) {
				System.out.println("숫자 형태로 데이터를 입력하세요.");
			}
		}
	}
}

