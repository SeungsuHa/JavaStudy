package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/* Array => AarrayList =>  CollectionFramework : List + Set + Map 구조 
 * List구조 형태
 *  - 데이터의 중복 값을 허용하고, 데이터의 저장 순서를 유지합니다.  
 *  - 복수개의 데이터를 저장합니다.
 *  - 크기는 가변적입니다.
 * < > : type of라고 부릅니다.
 * 
 */
public class ListSample2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(100);//[0]
		li.add(200);//[1]
		li.add(300);//[2]
		li.add(x1);//[3]
		li.add(x2);//[4]
		
		System.out.println(li);//[현대빈, 최원철, 정상은]
		System.out.println(li.get(1));// 최원철
		
		for(int data : li) {
			System.out.println("FOR문 : " + data); 
		}
		
		
		//반복자
		Iterator<Integer> el = li.iterator();
		
		while(el.hasNext()) { // 안에 데이터가 존재하는가?
			System.out.println(el.next()); 
		}
		
		//data size
		System.out.println(li.size());// 5
		
		
	}

}
