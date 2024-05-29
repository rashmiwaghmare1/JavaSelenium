import java.util.HashSet;

public class Primefactor {

	public static void main(String[] args) {
int no=315;
HashSet<Integer>set =new HashSet<>();
for(int i=2;i<=no;i++) {
	
		while(no%i==0) {
			set.add(i);
			no=no/i;
		}
	}

for(Integer s:set) {
	System.out.println(s);
}

	}

}
