package ibm;

public class Palindrome_1 {

	public static void main(String[] args) {
		
		//NAYAN => NAYAN
		
		String str="NAYAN";
	
		String reversed="null";
		
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb);
		
		
		StringBuilder sb2=new StringBuilder(sb.reverse());
		
		reversed=sb2.toString();
		System.out.println(str.equals(reversed));

	}

}
