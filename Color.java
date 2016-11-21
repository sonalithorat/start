
class Color
{
	int blue,green,red;
	Color()
	{
		blue=10;
		green=10;
		red=10;
	}
	void display()
	{
		System.out.println("red="+red+",blue="+blue);
	}
	
	
	public static void main(String args[])
	{
		Color color=new Color();
		color.display();
	}
}