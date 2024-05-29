
public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
String string="Hellow";
StringBuffer stringBuffer=new StringBuffer();
for(int i=0;i<string.length()-1;i++) {
	char ch=string.charAt(i);
	char c2=string.charAt(i+1);
	if(ch!=c2) {
	stringBuffer.append(ch);
	
	}



	}
System.out.println(stringBuffer);
	}
}
