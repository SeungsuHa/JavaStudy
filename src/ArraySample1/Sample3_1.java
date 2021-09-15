package ArraySample1;

import java.util.Scanner;

/* 반복처리 하도록 프로그램을 변경해주세요.
 *  1.for, while, do~while문
 *  
 *  2.cnt, count 이용하지 않고 반복되도록 하는 경우 코딩은?
 *  
 */
public class Sample3_1 {

	public static void main(String[] args) {
		int count;
		
		//1.배열에 저장 할 데이터 갯수 입력
			Scanner sc = new Scanner(System.in);
			System.out.print("배열에 저장 할 데이터 갯수 입력 : ");
			count = sc.nextInt();
					
		//2.배열에 데이터 입력
			int Data[] = new int[count];
			
			for(int i=0; i < Data.length; i++) {
				Data[i] = sc.nextInt();
			}

		boolean run = true;	
			
		while(run) { // 무한루프
				
		//3.찾을 데이터 입력
			System.out.println("검색할 데이터를 입력하세요.");
			int SearchData = sc.nextInt();
			
		//4.찾은 데이터 출력
			for(int i=0; i < Data.length; i++) {
				
				if(SearchData == Data[i]) { //yes
					System.out.println(Data[i] + "는 " + "[" + i + "]"); // i => index역할 
				}				
			}
			//무한루프 탈출시 사용
			if(run) {
				System.out.println("데이터 검색을 게속하시겠습니가?(yes/no)");
				String str = sc.next();//문자열을 입력
				
				// 객체를 사용하여 데이터를 비교할 때 사용
				//if(str.equlas("y")) { // 기본자료형의 데이터가 같은가? 
				if(str == "y") { // 객체의 주소비교
					continue;
				}else {
					break;
				}
			}		
			
		}
			
		}

}
