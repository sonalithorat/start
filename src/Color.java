
class Color
{
	int blue1,green,red;
	Color()
	{
		blue1=10;
		green=10;
		red=10;
	}
	void display()
	{
		System.out.println("red="+red+",blue="+blue1);
	}
	
	
	public static void main(String args[])
	{
		Color color=new Color();
		color.display();
	}
}
