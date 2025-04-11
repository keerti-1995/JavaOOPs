package interfacespacakges;

public class Triangle implements Shape {
	private double length;
	private double height;
	
	
	 public Triangle( int  length,int height)
	{
		this.height=height;
		this.length=length;
	}


	


	public double getArea() {
		
		return 0.5*length*height;
	}

}
