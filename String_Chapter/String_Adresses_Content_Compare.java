package String_Chapter;
public class String_Adresses_Content_Compare {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		String str1 = new String("hello");
		String str2 = "hello";
		String str3 = new String("hello");
		System.out.println(str==str1);   
		System.out.println(str==str1);
		System.out.println(str2==str); // Both adresses are same
		System.out.println(str==str1);
		System.out.println(str.equals(str2));  // Both Content are same
	}

}
