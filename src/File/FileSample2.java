package File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/*
 * 파일에 대한 처리: input(keyboard)/output(monitor)
 * 
 * 2.복사본 파일을 읽어서 화면상에 출력합니다.
 *  - UTF-8 버전
 */
public class FileSample2 {

	public static void main(String[] args) throws IOException  {
		BufferedReader  is = new BufferedReader(new FileReader("c:\\Filetest\\fileinput.txt"));

		while (true) {
			String read = is.readLine();
			if (read == null) {
				break;
			}
			
			System.out.printf(read);
		}

	}

}





/*
 * bit => byte => word => filed => record => block => file => Database =>
 * DataBank
 * 
 */