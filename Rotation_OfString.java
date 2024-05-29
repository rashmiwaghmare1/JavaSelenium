
public class Rotation_OfString {
public static boolean rotatedString(String st,String rotatString) {
	if(st==null|| rotatString==null) {
	System.out.println("return false");
	}
	if(st.length()!=rotatString.length()) {
	System.out.println("return false");
	}
	else {
	String con=	st+st;
	System.out.println(con.contains(rotatString));
	}
	return false;
	

}
	public static void main(String[] args) {
		Rotation_OfString.rotatedString("abcd", "bcda");
	
	}

}
