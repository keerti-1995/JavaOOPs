package overloadpackaege;

public class Demo1 {
	/*Function(method) over loading is nothing but we can use same name for multiple  methods  in a same class.
	//but we should differentiate methods by giving arguments.
	//either give different  numbers of arguments(int a,int b) or different data type(String name)*/
	public void getdata(int a)
	{
		System.out.println("first getdata"+" "+a);
	}
	public void getdataint (int a,int b)
	{
		System.out.println(b);
	}
	public void getdata(String a)
	{
		System.out.println("third getdata"+" "+a);
	}
	public static void main(String[] args)
	{
		Demo1 dm=new Demo1();
		dm.getdata(4);
		dm.getdata("Mahesh");
		dm.getdataint(5, 10);
	}
}
