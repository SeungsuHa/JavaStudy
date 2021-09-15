package ArraySample1;

import java.util.Scanner;

/* <문제> 1차원배열, 국어, 영어, 수학, 점수 입력, 총점과 평균을 구하여 출력하세요. 
 *  국어: kor, 영어=eng, 수학=mat
 *  점수:total, 평균:average
 *  int scores[] = new int[n];
 */
public class Sample3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1.데이터의 갯수(과목) 입력
		System.out.println("배열에 사용할 데이터의 갯수 입력 : ");
		int n = sc.nextInt();// 3
		
		int scores[] = new int[n];//[0]= kor, [1]=eng, [2]=mat
		int jumsu=0, sum=0;
		
		//2.데이터의 입력
		//           3 < 3
		for(int i=0; i < scores.length; i++) {
			jumsu = sc.nextInt();// 100, 50, 88
			scores[i] = jumsu;// kor = scores[0] = 100, eng = scores[1] = 50, mat = scores[2] = 88
			sum+=scores[i]; // 100 <= 100, 100+50<= 50, 150+88 <= 88
		}
		
		double average = sum / scores.length;
		//3.결과를 출력 
		System.out.println("총점: " + sum);
		System.out.println("평균: " + average); 
	}

}
