import java.security.DomainCombiner;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Set;

public class Occurance_of_Digit {

	public static void digitCount(long no) {

HashMap<Long, Integer>map=new HashMap<>();
long lastDigit=no%10;
while(no!=0) {
if(map.containsKey(lastDigit)) {
	map.put(lastDigit, map.get(lastDigit)+1);
}
else {
	map.put(lastDigit, 1);
}
no=no/10;
	}

Set<Long>set=map.keySet();
for(Long s:set) {
	System.out.println("Ocuurance of digit"+" "+s+"="+map.get(s));
}

	}
	public static void main(String[] args) {
		digitCount(12456);
	}
		
	}


