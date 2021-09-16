package InheritanceSample;

import java.util.Scanner;

public class Sample_sungjuk { //1000
//클래스 변수선언 및 초기화 
	public static double kor = 89.123; 
	private double eng;// 98.0
	private double mat;// 88.9 
	
	
	//클래스변수 초기화
	public Sample_sungjuk(double kor, double eng, double mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	

	public void printOutput() {
		
		double sum = this.kor + this.eng + this.mat;
		
		System.out.println(sum);// 198.0
	}	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---- 성적 구하기 -----");
		System.out.println("국어 점수 입력: ");
		double kor = sc.nextDouble();// 100.0
		System.out.println("영어 점수 입력: ");
		double eng = sc.nextDouble();// 98.0
		System.out.println("영어 점수 입력: ");
		double mat = sc.nextDouble();// 98.0
		
		Sample_sungjuk ss = new Sample_sungjuk(kor, eng, mat);
		ss.printOutput();
		
		System.out.println(mat); // 88.9
		System.out.println(ss.mat);// 88.9, 클래스명.클래스변수
	}

}
