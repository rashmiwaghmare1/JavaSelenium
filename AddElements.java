
public class AddElements {

	public static void main(String[] args) {
int a[]= {10,20,30,40};
int pos=3;
int ele=50;
for(int i=a.length-1;i>pos-1;i--) {
	a[i]=a[i-1];
}
a[pos-1]=ele;
for(int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
	}

}
