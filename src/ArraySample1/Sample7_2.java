package ArraySample1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/* 오름차순: 작은 값에서 큰 값으로 정렬하는 것, a,b,c,d..., 1,2,3..., 가나다라...
 * 내림차순: 큰 값에서 작은 값으로 정렬하는 것, z,y,x....., 10,9,8..., 하파사....
 *  - 정렬은 반드시 오름/내림차순을 하고 나서 데이터를 처리해야 데이터 처리의 효율성(생산성)이 높아집니다.
 * 외부정렬: 퀵소트, 래딕스(버킷), 셀렉션, 버블 등의 정렬 알고리즘이 존재 합니다. , <자료구조>를 참조하여 공부하세요. 
 * 내부정렬: 내부 메모리 사용
 *  - 오름차순(Arrays.sort(arr));
 *  - 내림차순(Arrays.sort(arr,Collections.reverseOrder()));
 *  - 순수 알고리즘으로 구현
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
public class Sample7_2 {

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
		int imsi;
		
		for(int i=0; i < sortData.length; i++) { //first data
			
			for(int j=i+1; j < sortData.length; j++) { // second data
				
				//    [0], 12             [1],  34
				if(sortData[i]  <  sortData[j]) {
					// 12        12
					imsi = sortData[i];
					// 34            34
					sortData[i] = sortData[j];
					//  12         12
					sortData[j] = imsi;					
				}				
			}
			System.out.println("***** 내림차순 결과 출력 *****");
			System.out.println((i+1) + "회전 결과 : ");	
			
			//4.sorted data output
			for(int k : sortData) {  //가변 for문
				System.out.print(k + " ");// 	
			}
			System.out.println();
			System.out.println("-----------------");
		}
		
		
		
		
		
		
				
	}

}
