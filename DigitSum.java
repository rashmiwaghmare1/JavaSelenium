
public class DigitSum {

	public static void main(String[] args) {
int no=124;
int sum=0;
int temp=no;
while(no!=0) {
	int rem=no%10;
	sum=sum+rem;
	no=no/10;

}
System.out.println("addition of digit in no" +" "+sum);
if(sum==temp) {
	System.out.println("no is palidrome ");
}
else {
	System.out.println("not is not palidrome");
}


	}

}
