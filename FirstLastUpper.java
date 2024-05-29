
public class FirstLastUpper {

	public static void main(String[] args) {
String string="welcome to java";
StringBuffer sBuffer=new StringBuffer();
String st[]=string.split(" ");
for(String st2:st) {
String friString=st2.substring(0,1);
String remString=st2.substring(1,st2.length()-1);
String laString=st2.substring(st2.length()-1);
sBuffer.append(friString.toUpperCase()+remString+laString.toUpperCase()+" ");



}
System.out.println(sBuffer);	
}

	}

