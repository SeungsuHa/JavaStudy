package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* Array => AarrayList =>  CollectionFramework : List + Set + Map 구조 
 * Map 구조 형태
 *  - 쌍으로 구성(key, value)
 *  - key는 중복을 허용하지 않으나, 데이터의 중복 값을 허용  
 *  - 복수개의 데이터를 저장합니다.
 *  - 크기는 가변적입니다.
 *  - 키값으로 주로 검색을 하는데 사용하므로 빠릅니다.
 * < > : type of라고 부릅니다.
 * 
 */
public class MapSample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();//400
		String x2 = sc.next();//"고주란"
		
		Map<Integer, String> map = new HashMap<>();
		// Set<Integer> set = new HashSet<>(Integer);
		map.put(100, "최원철");//[0]
		map.put(200, "최원철");//[1]
		map.put(300, "정상은");//[2]
		map.put(x1, x2);//[3]
				
		System.out.println(map);//[현대빈, 최원철, 정상은]
		System.out.println(map.toString());// 최원철
		System.out.println(map.get(300));  
				
			
		//data size
		System.out.println(map.size());// 5
		
		
		
		
	}

}
