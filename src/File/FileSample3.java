package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 파일에 대한 처리: input(keyboard)/output(monitor)
 * 
 * 3.키보드로부터 파일에 대한 데이터를 입력하고, stop이라는 문자를 만나면 입력을 중지합니다.
 *  
 */
public class FileSample3 {

	public static void main(String[] args) throws IOException {
		// input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// output
		FileWriter fw = new FileWriter("c:\\Filetest\\fileinput.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		System.out.println("메시지를 입력하세요.");

		int str;
		
		while ((str = br.read()) != -1) {
			if (str == 'x' || str == 'X') {
				break;
			} else {
				bw.write(str);
				bw.newLine();
				//bw.flush();//버퍼나 메모리상의 내용을 강제적으로 내보내는 역할.
				
			}
		}
		bw.close();
		fw.close();
	}

}
