
public class MethodDemo {
	static int a=10;
	public static  void add(int b,int c) {

		c=a+b;
		System.out.println(c);

	}
	public static void main(String[] args) {
		MethodDemo demo=new MethodDemo();
		demo.add(20, 0);
	}

}
