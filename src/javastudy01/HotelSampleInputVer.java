package javastudy01;

import java.util.Scanner;

/*
 * kosmo hotel을 새롭게 증축을 합니다.
 * 5층 건물이고, 각 층은 7개 호실로 구성되어 있습니다.
 * 이 경우에 투숙객의 데이터가 다음과 같다면, 전체 인원 수와 각 층의 평균 인원수는 얼마인가요?
 * data>
 * 1층: 10, 5, 6, 7, 8, 9, 10 => 55 / 7 => 7.8
 * 2층: 1, 9, 7, 8, 5, 4, 3
 * 3층: 10, 20, 30, 40, 50, 60, 70
 * 4층: 3, 5, 8, 9, 12, 22, 55
 * 5층: 6, 3, 8, 2, 5, 4, 5
 */
public class HotelSampleInputVer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//keyboard 데이터 입력
		System.out.println("행을 입력하세요.(층)");
		int floor = sc.nextInt();
		System.out.println("열을 입력하세요.(호)");
		int room = sc.nextInt();

		// int kosmos[][] = new int[5][7];
		int guest[][] = new int[floor][room];

		// 1.data input
		System.out.println("각층 각호의 인원수를 입력하세요.");
		for (int i = 0; i < guest.length; i++) {

			for (int j = 0; j < guest[i].length; j++) {
				guest[i][j] = sc.nextInt();
			}
		}

		// 2.data processing
		int sum[];
		sum = new int[room];

		double avg[];
		avg = new double[room];

		int sumTotal;
		sumTotal = 0;

		for (int i = 0; i < floor; i++) {
			for (int j = 0; j < room; j++) {
				sum[i] += guest[i][j];
				avg[i] = sum[i] / (double) room;
			}
			sumTotal += sum[i];
		}

		// 3.data output
		System.out.println("각층 각호의 인원수를 출력하세요.");
		for (int i = 0; i < guest.length; i++) {

			for (int j = 0; j < guest[i].length; j++) {
				System.out.print(guest[i][j] + " ");
			}
			System.out.println();// 줄바꿈.
			System.out.print(i + 1 + "층 평균 인원 :");
			System.out.printf("%5.2f", avg[i]);
			System.out.print("명");
			System.out.println();
		}
		System.out.println("전체층 인원 : " + sumTotal + "명");

	}

}
