
public class HalfUpercase {

	public static void main(String[] args) {
String string="java is object oriented programming language ";
int len=string.length()/2;
System.out.println(len);
for(int i=0;i<string.length();i++) {
char c=	string.charAt(i);
if(i<=len) {
System.out.print(Character.toUpperCase(c));
}
else if(i>=len){
System.out.print(Character.toLowerCase(c));
}

}
	}

}
