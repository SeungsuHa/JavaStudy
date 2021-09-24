package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/* Array => AarrayList =>  CollectionFramework : List + Set + Map 구조 
 * Set구조 형태
 *  - 데이터의 중복 값을 허용 [X], 데이터의 저장 순서를 유지 [X]  
 *  - 복수개의 데이터를 저장합니다.
 *  - 크기는 가변적입니다.
 * < > : type of라고 부릅니다.
 * 
 */
public class SetSample1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		
		Set<Integer> set = new HashSet<>();
		// Set<Integer> set = new HashSet<>(Integer);
		set.add(100);//[0]
		set.add(200);//[1]
		set.add(300);//[2]
		set.add(x1);//[3]
		set.add(x2);//[4]
		
		System.out.println(set);//[현대빈, 최원철, 정상은]
		System.out.println(set.toString());// 최원철
		
		for(int data : set) {
			System.out.println("FOR문 : " + data); 
		}
		
		
		//반복자
		Iterator<Integer> el = set.iterator();
		
		while(el.hasNext()) { // 안에 데이터가 존재하는가?
			System.out.println(el.next()); 
		}
		
		//data size
		System.out.println(set.size());// 5
		
		//정렬 기능을 포함한 set 구조 형태
		TreeSet<Integer> tset = new TreeSet<>();
		
		tset.add(11000);//[0]
		tset.add(1200);//[1]
		tset.add(3300);//[2]
		tset.add(6700);//[3]
		tset.add(6700);//[4]
		
		System.out.println(tset.size());//
		System.out.println(tset);// [1200, 3300, 6700, 8900, 11000]
		
		
		
		
	}

}
