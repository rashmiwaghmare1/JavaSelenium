import java.util.Arrays;


public class SumofArray {

	public static void main(String[] args) {
int a[]= {10,20,30,40,50};

System.out.println(Arrays.stream(a).average());
//*int sum=IntStream.of(a).sum();
//*System.out.println(sum);
//2nd approach 
//int sum=Arrays.stream(a).reduce((x,y)->x+y).getAsInt();
//System.out.println(sum);
//3rd approach
//int sum=Arrays.stream(a).reduce(Integer::sum).getAsInt();
//System.out.println(sum);
//4th approach
int sum=(int) Arrays.stream(a).summaryStatistics().getSum();
System.out.println(sum);

	}

}
