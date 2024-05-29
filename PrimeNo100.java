
public class PrimeNo100 {

	public static void main(String[] args) {
for(int no=1;no<=100;no++) {
	for(int j=2;j<=no;j++) {
		if(no%j==0) {
			System.out.println(no);
			break;
		}
	}
}
	}

}
