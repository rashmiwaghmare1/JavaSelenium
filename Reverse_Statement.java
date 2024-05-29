
public class Reverse_Statement {

	public static void main(String[] args) {
String string="Hellow java";
String st[]=string.split(" ");
String reverseString=" ";
for(String w:st) {
	String reverseword=" ";

for(int i=w.length()-1;i>=0;i--) {
reverseword=reverseword+w.charAt(i);
}
reverseString=reverseString+reverseword;
	}
System.out.println(reverseString.trim());
	}
}
