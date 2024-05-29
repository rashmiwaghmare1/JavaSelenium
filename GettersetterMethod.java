
public class GettersetterMethod {
private int a;
private String name;
public int getterint() {
	return a;
}
public void setterint(int b) {
	a=b;
}
public String gettername() {
	return name;
}
public void settername(String nam) {
	name=nam;
}
	public static void main(String[] args) {
		GettersetterMethod g=new GettersetterMethod();
g.setterint(10);
g.settername("Rashmi");
System.out.println(g.getterint());
System.out.println(g.gettername());

	}

}
