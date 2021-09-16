package InheritanceSample;

// 다중 상속의 효과 
public class Sample4 implements Sample4_1, Sample4_2, Sample4_3, Sample4_4 {

	@Override
	public void add() {
		int sum = 100 + 300;
		System.out.println("ADD : " + sum);		
	}
		
	public static void main(String[] args) {
		Sample4 s4 = new Sample4();
		s4.add();
		s4.sub();
		s4.mul();
		s4.div();
	}

	@Override
	public void sub() {
		int sum = 500 - 300;
		System.out.println("SUB : " + sum); 		
	}

	@Override
	public void div() {
		int sum = 500 / 3;
		System.out.println("DIV : " + sum); 		
	}

	@Override
	public void mul() {
		int sum = 500 * 300;
		System.out.println("MUL : " + sum); 		
	}

}
