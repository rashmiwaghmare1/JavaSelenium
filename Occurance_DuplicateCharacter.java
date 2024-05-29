import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Occurance_DuplicateCharacter {

	public static void main(String[] args) {
String st="Hellow world";
HashMap<Character, Integer>map=new HashMap<>();
for(int i=0;i<st.length();i++) {
	char ch=st.charAt(i);
	if(map.containsKey(ch)) {
	map.put(ch, map.get(ch)+1)	;	
}
	else {
		map.put(ch, 1);
	}
	}
Set<Entry<Character, Integer>>entry=map.entrySet();
for(Entry<Character, Integer>entr:entry) {
if(entr.getValue()>1) {
	System.out.println("ocuurance of duplicate character"+" "+entr.getKey()+" "+entr.getValue());
}
}
}
}