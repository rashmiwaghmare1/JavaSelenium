import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate_Character {

	public static void main(String[] args) {
String string="Hellow world";
Set<Character>set=new LinkedHashSet<>();
for(int i=0;i<string.length();i++) {
	set.add(string.charAt(i));
}
StringBuffer sBuffer=new StringBuffer();
for(Character s:set) {
	sBuffer.append(s);
}
System.out.println(sBuffer);
	}

}
