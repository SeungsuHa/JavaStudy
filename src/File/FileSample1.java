package File;

// 파일처리 
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//import java.io.*;//유지보수


/*
 * 파일에 대한 처리: input(keyboard)/output(monitor)
 * 
 * 1.원본 파일: hyun.txt을 복사하여 hello.txt로 저장해 봅니다.
 * 
 */
public class FileSample1 {

	private void FileCopy() throws IOException {
	File src = new File("c:\\Filetest\\hyun.txt");
	File tar = new File("c:\\Filetest\\Hello.txt");
	
	//원본을 읽기 위하여 객체 생성 
	FileInputStream fis = new FileInputStream(src);
	//원본을 복사하여 출력하기 위한 객체 생성
	FileOutputStream fos = new FileOutputStream(tar);
	
	while(true){
		int read = fis.read();
		
		if (read == -1){ // eof 의미, end of file, -1: 잘못됨을 의미(return value): 0이하 마이너스 어떤 값?
			break;
		}
		fos.write(read);
		//클래스, 객체명, 메소드명(매개변수)
		System.out.println((char)read); //java.lang패키지에 속합니다.
		}
	}

	public static void main(String[] args) throws IOException {
		FileSample1 fs1 = new FileSample1();
		fs1.FileCopy();
	}

}

/*
 * bit => byte => word => filed => record => block => file => Database =>
 * DataBank
 * 
 */


/*
 * java.lang. * : 생략이 가능합니다. 
 * 	- 일반적으로 import가 필요없는 패키지에 해당하는 메소드나 크래스나 인터페이스는 여기에 해당합니다.
 * 
 * java.util.* : 자료구조 
 * 
 * java.net.* : client/Server program, 채팅...게임
 * 
 * java.io.* : 파일 입출력 관리 
 * 
 * 
 * 
 */





