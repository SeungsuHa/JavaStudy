package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/* 문제> 다음과 같은 성적이 존재합니다.
 * -----------------------
 * 	key		value
 * -----------------------
 * 최원철		100  => 12345678(ISBN) 제목 ? 0권
 * 고주란 		 99
 * 하승수		 56
 * 권혁진		 78
 * -----------------------
 * 
 * 1.이 점수의 평균을 구하여 출력하세요.
 * 2.최고점수는 얼마인가요?
 * 3.최고점수를 받은 key는 누구인가요?
 * 
 */
public class MapSample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("key(성명)를 입력하세요.");
		String xint = sc.next();//
		System.out.println("Value(성적)를 입력하세요.");
		int xStr = sc.nextInt();//
		
		
		Map<String, Integer > m = new HashMap<>();
		m.put(xint, xStr);
		m.put("고주란", 99);
		m.put("하승수", 56);
		m.put("권혁진", 78);
		
		//1.이 점수의 평균을 구하여 출력하세요.
		int maxValue = 0, totalValue = 0;
		String valueID = null;
				
			Set<Map.Entry<String, Integer>> eSet = m.entrySet();
		
			for(Map.Entry<String, Integer> entry : eSet) {
				
				if(entry.getValue() > maxValue) {
					maxValue = entry.getValue();
					valueID = entry.getKey();
				}
				totalValue += entry.getValue();//총점 
			}
			
			double average = totalValue / m.size();//4
			System.out.println("평균 점수는 : " + average); 
		//2.최고점수는 얼마인가요?
			System.out.println("최고의 점수는 : " + maxValue); 
		
		//3.최고점수를 받은 key는 누구인가요?
			System.out.println("최고점수의 key value : " + valueID);  
	}

}