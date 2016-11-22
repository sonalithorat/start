
class Color
{
	int blue,green,red1;
	Color()
	{
		blue=10;
		green=10;
		red1=10;
	}
	void display()
	{
		System.out.println("red1="+red1+",blue="+blue);
	}
	
	
	public static void main(String args[])
	{
		Color color=new Color();
		color.display();
	}
}
