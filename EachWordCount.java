
public class EachWordCount {

	public static void main(String[] args) {
String st="java is progromming language";
String st2[]=st.split(" ");
while(st2!=null) {
for(String st3:st2) {
	System.out.print(st3.length()+" ");
}
	}
System.out.println("String is null");
	}
}
