
public class Check_Primeno {

	public static void main(String[] args) {
int no=3;
int count=0;
for(int i=2;i<=no-1;i++) {
	if(no%i==0) {
		count++;
	}
}

if(count==0) {
	System.out.println("prime no");
}
else {
	System.out.println("not prime no");
}
	}

}
