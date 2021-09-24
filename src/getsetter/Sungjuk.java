package getsetter;

import java.util.Scanner;

/*
 * 세 과목의 성적을 입력받아서, 총점과 평균을 구하여 출력하세요. 
 *  - getter & setter 메소드 이용
 * 문제 파악(요구사항 파악)> 
 *  1.학생수 ? 
 *  2.과목 수? 
 *  3.데이터 제공 유무(가상 데이터 입력?, 파일 제공?, DB접근 제공(ID/PW)....)  
 *  4.총점?
 *  5.평균?
 *  
 * 문제 분석> 
 *  1.속성 파악? 갯수?,  자릿수, 정수/실수/문자열, 특수문자...
 *  2.어떤 데이터베이스를 사용해야 하는가?
 *  3.어떤 네트워크를 지원(사용)해야 하는가? (유선, 무선, 유무선 지원 여부)
 *  4.어떤 서버를 주기동으로 사용해야 하는가? (유선, 무선, 유무선 지원 여부)
 *  5.예산(비용 처리)은 ?
 *  6.컨설팅 유무 
 *  7.소프트웨어 개발자?
 *  8.하드웨어(펌웨어, 임베디드 시스템)?
 *  9. 그래픽 처리 등등.............  
 *  비용과 프로젝트 기간?
 *  
 * 문제 설계>
 *  1.속성과 동작에 의하여 설계가 진행됩니다.
 *  2.과목수? 3과목
 *  3.3과목? 국어, 영어, 수학
 *  4.국어는 변수?, 영어 변수는 ?, 수학의 변수는 ? (자료형), 점수 평가: 주관식/객관식
 *  5.국어, 영어, 수학 과목의 자릿수? 실수형 => 100.00 ~ 0.00
 *  6.총점 구하는 공식
 *  7.평균 구하는 공식
 *  8.타이틀은? cui, gui 방식 선택  
 *  9. 클래스변수 선언, 지역 변수 선언, 둘다 혼용?
 *  
 *  sample>
 *  1. 국어 = kor, 영어= eng, 수학 = mat, 총점 = total, 평균 = average  
 *  kor, eng, mat, total, average = double  
 *  2. total = kor + eng + mat
 *  3. average = total/3.0 (object length)
 *  4. 생성자, 단순 변수, get/setter, method etc....
 *     
 *    시스템 분석가/시스템 설계가 => 시스템 분석설계자 (최소 10년이상 차장 이상급...)
 *    coder => PL  => PM
 *     
 *    coding(developerment) = 개발
 *    - 개발 방식: getter&setter
 */

public class Sungjuk {

	double kor;//55.55
	double eng;//66.66
	double mat;//88.88
	
	static double  total;// ???
	static double  average;// getter
	
	//.......
	
	
	public void getTotal(double kor, double eng, double mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
		total = this.kor + eng + mat;
		System.out.printf("총점 %5.2f \n", total); 
	}

	public void getAverage() {
		average = total / 3.0;
		System.out.printf("평균 : %5.2f \n", average); 	
	}

		
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Sungjuk  sj = new Sungjuk();
		
	Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력해 주세요 : ");
		double kor = sc.nextDouble();// 55.55
		System.out.print("영어 점수를 입력해 주세요 : ");
		double eng = sc.nextDouble();// 66.66
		System.out.print("수학 점수를 입력해 주세요 : ");
		double mat = sc.nextDouble();// 88.88
		
		
		sj.getTotal(kor, eng, mat);//총점 구하기
		//System.out.printf("총점 : %5.2f \n", total); 
		//System.out.printf("총점 : %5.2f \n", Sungjuk.total);//클래스명.클래스변수
		//System.out.printf("총점 : %5.2f \n", sj.total);//객체명.클래스변수
		
		sj.getAverage();//평균 구하기 
		//System.out.printf("평균 : %5.2f \n", average); 
		//System.out.printf("평균 : %5.2f \n", Sungjuk.average); 
		//System.out.printf("평균 : %5.2f \n", sj.average); 
		
	}

	
}
