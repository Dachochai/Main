import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
 
public class Test_IO {
 
    /**
     * @param args
     */
    public static void main(String[] args) {
        try{
            String data = " This content will append to the end of the file\n";
  
            File file =new File("C:\\users\\Day Chanya\\Documents\\workspace\\OOP_Project\\write\\example1.txt");
  
            //if file doesnt exists, then create it
            if(!file.exists()){
                file.createNewFile();
            }
  
            //true = append file
            FileWriter fileWritter = new FileWriter(file,false);
                BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
                bufferWritter.write(data);
                bufferWritter.close();
  
            System.out.println("Done");
  
        }catch(IOException e){
            e.printStackTrace();
        }
    }
 
}