
public class Word_count {

	public static void main(String[] args) {
String string="Hellow java";
 string=string.replaceAll("//s"," ");
 int count=1;
 for(int i=0;i<string.length();i++) {
	 if(string.charAt(i)==' '&& string.charAt(i+1)!=' ') {
		 count++;
	 }
 }
 System.out.println("word count is "+count);
	}

}
