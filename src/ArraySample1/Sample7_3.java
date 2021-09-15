package ArraySample1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/* 부분 정렬 : Arrays.sort(sortData, 0, 4); // 0,1,2,3 요소만 정렬
 *  
 * 임의의 수를 N개 입력 받아서, 배열에 저장하고 내림차순 정렬을 하여 출력하세요.
 * 데이터> 
 *  100 300 400 200 55
 *  1회전 결과: 400 100 300 200 55
 *  2회전 결과: 400 300 100 200 55
 *  3회전 결과: 400 300 200 100 55
 *  4회전 결과: 400 300 200 100 55
 *  5회전 결과: 400 300 200 100 55
 *  
 *  - Scanner, BufferedReader, args[] 중에서 골라서 사용하세요.
 */
public class Sample7_3 {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		//1.sort data size define	
		System.out.println("원하는 배열의 크기를 입력해 주세요.");
		int n = sc.nextInt();// 5
		
		Integer sortData[] = new Integer[n];// [0] ~ [4], Integer : 클래스 타입
		// int: 정수 자료형
		
		//2.data input
		System.out.println("***** 데이터 입력 부분 *****");
		//           0 < 5
		for(int i=0; i < sortData.length; i++) {
			System.out.print((i+1) + "번째 데이터 입력 : ");
			sortData[i]= sc.nextInt();
		}
		
		//3.data sort 
		//descending sort
		
		Arrays.sort(sortData, 0, 400); // 0,1,2,3 요소만 정렬				
			
		//4.sorted data output
		System.out.println("***** 오름차순 결과 출력 *****");
		
		for(int k : sortData) {  //가변 for문			
			System.out.print(k + " ");// 	
		}
		System.out.println();
		System.out.println("-----------------");
				
	}

}
