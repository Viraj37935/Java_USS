package ibm;

public class String_count {

	public static void main(String[] args) {
		
		String str = "VirajJavaDeveloper4789";
		
		int letters=0;
		int digit=0;
		
		for(char c: str.toCharArray()) {
			if(Character.isLetter(c)) {
				letters++;
			}
			else if(Character.isDigit(c)) {
				digit++;
			}
		}
		
		System.out.println("Letters:"+letters);
		System.out.println("Digits:"+digit);

	}

}
