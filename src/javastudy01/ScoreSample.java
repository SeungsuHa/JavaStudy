package javastudy01;

import java.util.Arrays;
import java.util.Scanner;

/*
 *다음 문제를 풀어보시기 바랍니다.
 *	--------성적표--------
 *------------------------------
 *번호  이름  국어  영어  수학  총점  평균  석차
 *------------------------------
 *1  aa  100  25  56  181 60.0 2
 *2  bb   25  85  58  168 56.0 3
 *3  cc   89  78  88  255 85.0 1
 *------------------------------
 *[처리조건]
 * 1. 5명의 학생 데이터가 존재합니다.
 * 2. 번호, 이름, 국어, 영어, 수학 등의 과목이 있습니다.
 * 번호 : int number(5), 이름 : String name(30), 국어: int kor(3), 영어: int eng(3),
 * 수학 : int mat(3), 총점 : int total(4), 평균 : double aberage(8,2), 석차 :int rank(3)
 * 
 * <process algorithm>
 *  1. 배열선언 : 번호 int , 과목명, 총점, 평균, 석차
 *  2. 학생수, 대상: 5개, 데이터 입력: Scanner => sc
 *  3. 총점(+),평균(/)구하기
 *  4. 석차구하기(총점이나 평균) : algorithm, java 제공 class,method
 *  5. 결과 출력 : 모양, 모습으로?
 *  
 *  row(행): 3, column(열): 8
 */

public class ScoreSample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 처리할 인원수는 ? ");
		int number = sc.nextInt();// 처리 할 데이터의 학생수 입력, 3

		String[][] stud = new String[number][2];// 번호와 이름 배열, (3,2)
		int[][] arr = new int[number][4];// 국어, 영어, 수학 점수 입력, 총점 구하기 (3,4)
		double[][] aver = new double[number][1];// 평균, (3,1)
		int[] rank = new int[number]; // (3)
		int[][] ranking = new int[number][1];// (3,1)

		// 1.data input
		// 0 < 3
		for (int i = 0; i < arr.length; i++) {
			System.out.println("---번호와 각과목 점수를 입력하세요.---");
			System.out.println("번호: ");
			stud[i][0] = sc.next();
			System.out.println("이름: ");
			stud[i][1] = sc.next();

			System.out.println("국어: ");
			arr[i][0] = sc.nextInt();
			System.out.println("영어: ");
			arr[i][1] = sc.nextInt();
			System.out.println("수학: ");
			arr[i][2] = sc.nextInt();
		}

		// 2.total & average process
		for (int i = 0; i < arr.length; i++) {
			arr[i][3] = arr[i][0] + arr[i][1] + arr[i][2];// 총점 구하기
			aver[i][0] = arr[i][3] / 3.0;// 평균 구하기
		}

		// 3.ranking
		for (int i = 0; i < number; i++) {
			rank[i] = arr[i][3];
		}

		Arrays.sort(rank);// ascending sort(오름차순)

		// 0 < 3
		for (int i = 0; i < arr.length; i++) {
			// 2 2 >=0
			for (int j = arr.length - 1; j >= 0; j--) {

				// 총점 == 2
				if (arr[i][3] == rank[j]) {
					ranking[i][0] = arr.length - j;
					break;
				} else {
					continue;
				}
			}
		}

		// 4.data output
		System.out.println("----------------------------------------------------------------");
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("----------------------------------------------------------------");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(stud[i][0] + "\t" + stud[i][1] + "\t");// 번호, 이름 출력
			for (int j = 0; j < 4; j++) {
				System.out.print(arr[i][j] + "\t");// 국어,영어,수학,총점
			}
			System.out.printf("%5.3f \t %d", aver[i][0], ranking[i][0]);// 평균 소숫점이하 3자리까지 구하기
			System.out.println();
		}
		System.out.println("----------------------------------------------------------------");
	}

}
