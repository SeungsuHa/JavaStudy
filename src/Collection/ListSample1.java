package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

/* Array => AarrayList =>  CollectionFramework : List + Set + Map 구조 
 * List구조 형태
 *  - 데이터의 중복 값을 허용하고, 데이터의 저장 순서를 유지합니다.  
 *  - 복수개의 데이터를 저장합니다.
 *  - 크기는 가변적입니다.
 * < > : type of라고 부릅니다.
 * 
 */
public class ListSample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x1 = sc.next();
		String x2 = sc.next();
		
		List<String> li = new ArrayList<String>(30); 
		li.add("현대빈");//[0]
		li.add("최원철");//[1]
		li.add("정상은");//[2]
		li.add(x1);
		li.add(x2);
		
		System.out.println(li);//[현대빈, 최원철, 정상은]
		System.out.println(li.get(1));// 최원철
		
		//반복자
		Iterator<String> el = li.iterator();
		
		while(el.hasNext()) { // 안에 데이터가 존재하는가?
			System.out.println(el.next()); 
		}
	}

}
