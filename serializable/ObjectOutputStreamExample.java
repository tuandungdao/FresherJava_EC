package serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("D:/CBLS_Base/testout.txt"));
            // create student
            Student student = new Student(1, "Tran Hao Phong", "Ha Noi", 17);
            // write student
            oos.writeObject(student);
            System.out.println("Success...");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }
	}

}
