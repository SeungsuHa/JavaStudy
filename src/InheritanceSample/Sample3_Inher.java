package InheritanceSample;

import MethodSample.Sample3_1;

/* 패키지명 : MethodSample
 * 
 * interface Sample3_1 add => public abstract void add(); 설계만 합니다.
 *							=> public abstract void sub();
 * 		 					=> public abstract void mul();
 * 							=> public abstract void div();
 * 추상 (클래스)메소드 오버라이딩 = 오버라이딩 : 상속하는 경우 @Overrid  
 * 
 * 추상 클래스/인터페이스, 클래스
 * 
 * 상속의 4가지 유형 : 자바는 단일상속만 허용합니다.
 * ---------------------------------------
 * 1. public class a extends b { .....} : 단일 상속
 * 2. public class a implements b { ..... } : 단일 상속 
 * 3. public class a extends b implements c, d, e,.... { .... } : 다중 상속의 효과를 본다고 합니다.
 * 4. interface a extends b { ..... }  
 *    public class a extends b { .....} 
 *    public class a implements b { ..... }
 *    public class a extends b implements c, d, e,.... { .... }
 */
public class Sample3_Inher extends Sample3_1 {

	public static void main(String[] args) {
		Sample3_Inher si = new Sample3_Inher();
//		si.add();
		

	}

}
