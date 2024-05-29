import java.util.Arrays;

public class Maximum_Number {

	public static void main(String[] args) {
int a[]= {10,50,90,60};
int max=a[0];
int min=a[0];
for(int i=0;i<a.length;i++) {
	
	if(a[i]>max) {
		max=a[i];
		
	}
	else if(a[i]<min) {
		min=a[i];
	}
	
	
	}
long sum=Arrays.stream(a).summaryStatistics().getSum();
System.out.println("Addition of array elements in 1st method"+sum);
int sum2=Arrays.stream(a).reduce(Integer::sum).getAsInt();
System.out.println("addition of array elements in 2nd method"+sum2);
System.out.println(Math.max(max, min));
System.out.println(Math.min(min, min));
System.out.println("maximum elements is "+" "+max);
System.out.println("minimum elements is "+" "+min);

}
}