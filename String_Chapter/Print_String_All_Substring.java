package String_Chapter;
public class Print_String_All_Substring {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="nitin";
        printSubString(s);
	}
	public static void printSubString(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i,j));
			}
		}
	}

}
