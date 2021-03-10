/* Summation.java */

public class Summation 
{
	private int result;
	
	public Summation()
	{
		setResult(0);
	}
	
	public Summation(int x, int y)
	{
		Sum(x, y);
	}
	
	public void Sum(int x, int y)
	{
		setResult(x + y);
	}
	
	private void setResult(int result)
	{
		this.result = result;
	}
	
	public int getResult()
	{
		return result;
	}
	
	public String toString()
	{
		String resultStr = String.valueOf(getResult());
		
		return resultStr;
	}
}
