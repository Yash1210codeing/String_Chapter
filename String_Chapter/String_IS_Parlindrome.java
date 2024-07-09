package String_Chapter;
 import java.util.*;
public class String_IS_Parlindrome {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
       // String s="nitin";
        System.out.println(palindrome(s));
	}
	public static boolean palindrome(String s) {
		int i=0;
		int j=s.length()-1;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
