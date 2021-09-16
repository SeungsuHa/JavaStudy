package InheritanceSample;

/* 추상 클래스 또는 인터페이스는 객체를 생성하지 못하므로
 * 그래서 상속을 클래스로 받아서 처리해야 합니다.
 *  주의> 추상 클래스 또는 인터페이스는 미래를 위하여 미리 작성하여 두면 좋습니다. 
 *  
 */
interface Sample4_22  {
	//public abstract void add();
	void sub();
}

interface Sample4_33 extends Sample4_22 {
	//public abstract void add();
	//void sub();
	void mul();
}

interface Sample4_44 extends Sample4_33 {
	//public abstract void add();
		//void sub();
	//void mul();
	void div();
}

//추상클래스
abstract class Sample4_11 implements Sample4_44 {
	public abstract void add();	
}

//                  자식클래스                                   부모클래스
public class Sample5_multiInher extends Sample4_11 {

	public static void main(String[] args) {
		
		Sample5_multiInher sm = new Sample5_multiInher();
		sm.add();
		sm.sub();
		sm.mul();
		sm.div();
	}

	@Override
	public void mul() {
		int sum = 100 * 500;
		System.out.println("MUL : " + sum);// 50000		
	}

	@Override
	public void sub() {
		int sum = 1100 - 500;
		System.out.println("SUB : " + sum);// 600
		
	}

	@Override
	public void add() {
		int sum = 100 + 500;
		System.out.println("ADD : " + sum);// 600
	}

	@Override
	public void div() {
		int sum = 500 / 100;
		System.out.println("DIV : " + sum);// 5
		
	}

}
