package String_Chapter;
public class Same_Other_Adresses_Compare_string {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hello";
		String str1 = new String("hello");
		String str2 = "hello";
		String str3 = new String("hello");
		System.out.println(str==str1);   
		System.out.println(str==str1);
		System.out.println(str2==str); 
		System.out.println(str==str1);
	}

}
