import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;



public class FileTest {

	//ʹ��FileOutputStream�����ļ�wordд����Ϣ��Ȼ��ͨ��FileInputStream�ཫ�ļ��е����ݶ�ȡ������̨��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E:/mycode","work.txt"); //�����ļ�����
		try {                                        //��׽�쳣
			FileOutputStream out = new FileOutputStream(file);//����FileOutputStream����
			byte buy[] = "����һֻСë¿���Ҵ���Ҳ���".getBytes();//����byte������
			out.write(buy);//����������Ϣд�뵽�ļ���
			out.close();//�����ر�
			
		} catch (Exception e) {                    //catch��䴦���쳣��Ϣ
			// TODO: handle exception
			e.printStackTrace();                   //����쳣��Ϣ
		}
		
		try {
			FileInputStream in = new FileInputStream(file);         //����FileInputStream����
			byte byt[] = new byte[1024];                           //����byte������
			int len = in.read(byt);                                 //���ļ��ж�ȡ��Ϣ
			System.out.println("�ļ��е���Ϣ�ǣ�"+new String(byt,0,len)); //���ļ�����Ϣ���
			in.close();                //�ر���
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}

