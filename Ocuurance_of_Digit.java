import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ocuurance_of_Digit {

	public static int digitcount(long no) {
		HashMap<Long,Integer>map=new HashMap<>();

	while(no!=0) {
	long lastdigit=no%10;
	if(map.containsKey(lastdigit)) {
		map.put(lastdigit, map.get(lastdigit)+1);
	}
	else {
		map.put(lastdigit, 1);
	}
	
no=no/10;
	
		}
	Set<Long>keySet=	map.keySet();
	for(Long key:keySet) {
		System.out.println(key+"="+map.get(key));
	}
	return 0;
	
		
	}
	

	public static void main(String[] args) {
		digitcount(1224);
	
	}

}
