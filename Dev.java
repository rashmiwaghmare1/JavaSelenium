
public class Dev implements Client{
public void clientrequ() {
	System.out.println("client required rice and mango"+" "+rice+"kg"+" "+mango+"dozen");
}
public static void main(String[] args) {
	Dev dev=new Dev();
	dev.clientrequ();
}
}
