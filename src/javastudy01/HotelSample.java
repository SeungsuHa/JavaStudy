package javastudy01;

/*
 * kosmo hotel을 새롭게 증축을 합니다.
 * 5층 건물이고, 각 층은 7개 호실로 구성되어 있습니다.
 * 이 경우에 투숙객의 데이터가 다음과 같다면, 전체 인원 수와 각 층의 평균 인원수는 얼마인가요?
 * data>
 * 1층: 10, 5, 6, 7, 8, 9, 10
 * 2층: 1, 9, 7, 8, 5, 4, 3
 * 3층: 10, 20, 30, 40, 50, 60, 70
 * 4층: 3, 5, 8, 9, 12, 22, 55
 * 5층: 6, 3, 8, 2, 5, 4, 5
 */
public class HotelSample {

	public static void main(String[] args) {

		int floor = 5;
		int room = 7;

		int sum[];
		sum = new int[room];

		double avg[];
		avg = new double[room];

		int sumTotal;
		sumTotal = 0;

		int[][] guest = { { 10, 5, 6, 7, 8, 9, 10 }, { 1, 9, 7, 8, 5, 4, 3 }, { 10, 20, 30, 40, 50, 60, 70 },
				{ 3, 5, 8, 9, 12, 22, 55 }, { 6, 3, 8, 2, 5, 4, 5 } };

		for (int i = 0; i < floor; i++) {
			for (int j = 0; j < room; j++) {
				sum[i] += guest[i][j];
				avg[i] = sum[i] / floor;
			}
			sumTotal += sum[i];
		}

		for (int i = 0; i < floor; i++) {
			System.out.println(i + 1 + "층의 평균 인원 수 : " + avg[i] + "명");
		}

		System.out.println("전체층의 인원 수 : " + sumTotal + "명");
	}

}
