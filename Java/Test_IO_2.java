import java.io.DataInputStream;
import java.io.FileInputStream;
 
public class Test_IO_2 {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("C:\\users\\Day Chanya\\Documents\\workspace\\OOP_Project\\write\\example1.txt"));
 
            byte[] datainBytes = new byte[dis.available()];
            dis.readFully(datainBytes);
            dis.close();
 
            String content = new String(datainBytes, 0, datainBytes.length);
 
            System.out.println(content);
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}