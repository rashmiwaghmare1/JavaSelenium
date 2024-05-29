import java.util.Arrays;

public class Right_Rotationby3element {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int size=a.length;

		for(int i=1;i<=3;i++) {
			int last=a[size-1];
			for(int j=size-1;j>0;j--) {
				a[j]=a[j-1];
			}
			a[0]=last;
		}
		System.out.println(Arrays.toString(a));
	}

}
