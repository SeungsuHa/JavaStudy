package ArraySample1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/* 로또 난수 발생 출력하기 
 *  - 범위: 1 ~ 45
 *  - 중복숫자는 제외
 *  - Random r = new Random()
 *  - int lotto[] = new int[6]
 *  - sample> 2 17 29 31 35 44
 *  
 */
public class Sample5 {

	public static void main(String[] args) {
		int lotto[] = new int[6];
		Random r = new Random();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("로또 난수 생성 : ");
		int n = sc.nextInt();// 3
		
		for(int cnt=1; cnt<=n; cnt++) {
			
		loop: for(int idx=0; idx < lotto.length; idx++) {
				
				//int lot = r.nextInt(45); // 0 ~ 44 난수 발생
				int lot = r.nextInt(45) + 1; // 1 ~ 45 난수 발생
				
				//중복확인
				for(int i=0; i < idx; i++) {
					
					if(lot == lotto[i]) {
						idx--;
						continue loop;
					}
				}
				
				lotto[idx] = lot;				
			}
		
		//sort
		Arrays.sort(lotto);				
			
		//output
			for(int i=0; i < lotto.length; i++) {
				System.out.print(lotto[i] + " ");
			}
			System.out.println();
		}
		
	}

}
