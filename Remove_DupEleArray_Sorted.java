import java.util.HashSet;

public class Remove_DupEleArray_Sorted {

	public static void main(String[] args) {
int a[]= {1,4,2,6,4};
HashSet<Integer>set=new HashSet<>();
for(int i=0;i<a.length-1;i++) {
	set.add(a[i]);
}
for(Integer se:set) {
	System.out.println(se);
}
	}

}
