package mod15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//������ �о�鿩 �ڹٷ� �����ͼ� ȭ�鿡 ����ϴ� ��
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
		System.out.println("\n��ü ����Ʈ ��: "+ totalByte +"bytes."); //����ּ�  //file size
	}
}

//������Ƽ�� ? -- String����