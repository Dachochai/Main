/* Pictures.java */

public class Pictures
{
	private static int x;
	private static int y;

	//Constructor
    public Pictures()
    {
    	setX(0);
    	setY(0);
    }
    
    public Pictures(int numX, int numY)
    {
    	setX(numX);
    	setY(numY);
    }
    
	//Mutator
    public void setX(int num)
    {
    	x = num;
    }
    
    public void setY(int num)
    {
    	y = num;
    }
    
    //Accessor
    public int getX()
    {
    	return x;
    }
    
    
    public int getY()
    {
    	return y;
    }
    
    //Facilities
    public String toString()
    {
    	String position = "" + getX() + ", " + getY();
    	
    	return position;
    }

    //Garbage
    protected void finalize() 
    {
    	System.out.println("Pictures was cleared.");
    	
        finalize();
    }
}
