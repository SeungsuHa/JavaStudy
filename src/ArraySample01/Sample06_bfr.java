package ArraySample01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 조건 연산자(삼항 연산자)
 * x = (    ) ? 참 : 거짓;
 * 
 * 문제> 3개의 데이터를 입력받아서 가장 작은 값을 구하여 출력하세요.
 *  - Scanner, BufferedReader, args[] 중에서 골라서 사용하세요.
 */
public class Sample06_bfr {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int mini;
		int Min[] = new int[5];
		
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		System.out.println("1번째 숫자를 입력해 주세요.");
		Min[0] = Integer.parseInt(br.readLine());//12
		
		System.out.println("2번째 숫자를 입력해 주세요."); 
		String x = br.readLine();//7
		Min[1] = Integer.parseInt(x);
		
		System.out.println("3번째 숫자를 입력해 주세요.");
		Min[2] = Integer.parseInt(br.readLine());//54
		System.out.println("4번째 숫자를 입력해 주세요.");
		Min[3] = Integer.parseInt(br.readLine());//17
		System.out.println("5번째 숫자를 입력해 주세요.");
		Min[4] = Integer.parseInt(br.readLine());//540
		
		mini = Min[0];// mini = 12
		
		for(int i=1; i <=4; i++) {
			//x = (    ) ? 참 : 거짓;
			mini = mini < Min[i] ? mini: Min[i];// 7 = 12 < 7, 7 = 7 < 54, 7 = 7 < 17, 7 = 7 < 540
		}
		
		System.out.println("최소값 : " + mini);// 7		
		
	}

}
