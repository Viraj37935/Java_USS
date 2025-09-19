package String;

public class String_Methods {

	public static void main(String[] args) {

		String str = new String("Bayerishce Motoren Werke India (BMW)");
		String emptstr = "";
		String blankstr = "    ";

		System.out.println("Length of str: " + str.length());

		System.out.println("Character at index 15: " + str.charAt(15));

		System.out.println("Is Empty str: " + emptstr.isEmpty());
		System.out.println("IS Str Empty: " + str.isEmpty());

		System.out.println("Is blankstr Blank: " + blankstr.isBlank());
		System.out.println("Is str blank:" + str.isBlank());
		System.out.println("Is emptystr Blank: " + emptstr.isBlank());

	}

}
