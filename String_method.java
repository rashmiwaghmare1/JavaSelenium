
public class String_method {

	public static void main(String[] args) {
String string="welcome@123";
int no=Integer.parseInt(string.substring(8, 11));
int sum=0;
int temp=no;
while(no!=0) {
	int rem=no%10;
	sum=sum+rem;
	no=no/10;
}
if(sum==temp) {
	System.out.println("no is palindrome number");
	System.out.println("no is not palindrome number");
}
System.out.println("count of digit last ");
System.out.println("sum of digit"+" "+sum);


	}

}
