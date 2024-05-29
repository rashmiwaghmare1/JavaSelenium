import java.util.HashMap;

public class Occurance_of_vowel {

	public static void main(String[] args) {
String string="welcome to java";

HashMap<Character, Integer> map=new HashMap<>();
map.put('a', 0);
map.put('e', 0);
map.put('i', 0);
map.put('o',0);
map.put('u',0);
for(int i=0;i<string.length();i++) {
char ch=	string.charAt(i);
if(ch=='a'|| ch=='A') {
	map.put('a', map.get('a')+1);	
}
else if(ch=='e'|| ch=='E'){
	map.put('e', map.get('e')+1);
}
else if(ch=='i'|| ch=='I'){
	map.put('i', map.get('i')+1);
}else if(ch=='o'|| ch=='O'){
	map.put('o', map.get('o')+1);
}else if(ch=='u'|| ch=='U'){
	map.put('u', map.get('u')+1);
}
	}
System.out.println("occurance of a"+" "+map.get('a'));
System.out.println("occurance of e"+" "+map.get('e'));
System.out.println("occurance of i"+" "+map.get('i'));
System.out.println("occurance of o"+" "+map.get('o'));
System.out.println("occurance of u"+" "+map.get('u'));

	}
}
