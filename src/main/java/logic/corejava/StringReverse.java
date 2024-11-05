package logic.corejava;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println("Reversing a String....");
		
		//Method-1
		String str1 = "Good";
		String str2="";
		System.out.println(""+str1.toCharArray().length);
		int len = str1.toCharArray().length;

		for(int i=len-1; i>=0; i--) {
			str2= str2 + (str1.charAt(i));
		}
		System.out.println("Reverse String: "+str2);
		
		if(str1.equals(str2)) {
			System.out.println("String is palindrome.");
		} else {
			System.out.println("Sring is not a palindrome.");
		}
		
		//Method-2
		StringBuffer str4;
		int j =1;
		
		
		
	}

}
