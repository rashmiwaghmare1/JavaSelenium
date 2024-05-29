
public class PalindromeString {

	public static void main(String[] args) {
String string="rashmi";
String org_stString=string;
String revString=" ";

for(int i=0;i<string.length();i++) {
	revString=revString+string.charAt(i);
}
revString=revString.trim();
if(revString.equals(org_stString)) {
	System.out.println("string is palindrome");
}
else {
	System.out.println("String is not palidnrome");
}
	}

}
