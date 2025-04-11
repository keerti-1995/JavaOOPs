package interfacespacakges;

public class Mainforshapes {

	public static void main(String[] args) {
		
		
		Shape c=new Circle(8);
		System.out.println(c.getArea());
		
		Shape r=new Rectangle(8,9);
		System.out.println(r.getArea());
		
		
		Shape t=new Triangle(4,3);
		System.out.println(t.getArea());
		
	}

}
