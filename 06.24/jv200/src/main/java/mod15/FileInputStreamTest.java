package mod15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//파일을 읽어들여 자바로 가져와서 화면에 출력하는 것
public class FileInputStreamTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		int totalByte = 0;
		try {
			try {
				fis = new FileInputStream("test.txt");
				fos = new FileOutputStream("test_copy.txt");
				for(int readByte; (readByte = fis.read()) != -1;) {
//					System.out.write(readByte);
					fos.write(readByte);
					totalByte++;
				}
			}finally {
				fis.close();
				fos.close();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n전체 바이트 수: "+ totalByte +"bytes."); //상대주소  //file size
	}
}

//프로퍼티스 ? -- String관련