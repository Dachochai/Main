
package proj_oop;
import javax.swing.ImageIcon;
   
public class backarr {
     private ImageIcon infw1200[][] = new ImageIcon[4][10];
     public backarr(){
        for (int r = 0; r < 4; r++)
        {
           for (int c = 0; c < 10; c++)
           {
               infw1200[r][c] = new ImageIcon("chair-1.png");               
           }
         
       }
     }
     
     public void setinfw1200(ImageIcon i[][]){
        for (int r = 0; r < 4; r++)
        {
           for (int c = 0; c < 10; c++)
           {
               this.infw1200[r][c] = i[r][c];               
           }
           
        }
         
     }
     
     public String getinfw1200(){
        /*for (int r = 0; r < 4; r++)
        {
            for (int c = 0; c < 10; c++)
            {
                return(this.infw1200[r][c]);  
            }
           
         }*/
         return "chair-1.png";
     }
}
